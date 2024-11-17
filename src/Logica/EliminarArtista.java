/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.AlbumJpaController;
import Persistencia.ArtistaJpaController;
import Persistencia.ArtistasEliminadoJpaController;
import Persistencia.TemaJpaController;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;

/**
 *
 * @author User
 */
public class EliminarArtista {
    Factory fabric =Factory.getInstance();
    ICtrl ctrl = fabric.getICtrl();
    public ArtistaJpaController ArtistaController = new ArtistaJpaController();
    public TemaJpaController temaJpaController = new TemaJpaController();
    public AlbumJpaController albumJpaController = new AlbumJpaController();
    public ArtistasEliminadoJpaController ArtistaEliminadoJpaController = new ArtistasEliminadoJpaController();
    
    public EliminarArtista(String nickArtista){
         Artista ArtEl = ArtistaController.findArtista(nickArtista);//consigo el artista que quiero eliminar
         List<Album> AlbumesArtista = ArtEl.getAlbumes();//Consigo todos los albumes de ese Artista
         List<String> TemasDeAlbumes= new ArrayList();
         //Tema-Nombre del Album
         for(Album alb :AlbumesArtista){
            // Agregar los elementos de la TemasDeAlbumes a obtenerTemasDeAlbum
            TemasDeAlbumes.addAll(ctrl.obtenerTemasDeAlbum(alb.getNombre()));
         }
         List<String> NomAlbArtista = new ArrayList();
         for(Album alb :AlbumesArtista){
            NomAlbArtista.add(alb.getNombre());//Tengo todos los nombres de los temas
         }
         // Unir la lista con un delimitador personalizado
        String NomAlbumes = NomAlbArtista.stream().collect(Collectors.joining("/ "));
        // Unir la lista con un delimitador personalizado
        String NomTemas = TemasDeAlbumes.stream().collect(Collectors.joining("/ "));
         // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();
        // Definir el formato deseado
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Transformar la fecha en un String con el formato especificado
        String FechaEliminado = fechaActual.format(formato);
        
        //Creo ese nuevo ArtistaEliminado
        //ArtistasEliminado ArtistaDeleted = new ArtistasEliminado(ArtEl.getNickname(),ArtEl.getNombre(),ArtEl.getApellido(),ArtEl.getCorreo(),ArtEl.getFecha(),NomAlbumes, NomTemas, FechaEliminado );
        ArtistasEliminado ArtistaDeleted = new ArtistasEliminado(ArtEl.getNickname(),ArtEl.getNombre(),ArtEl.getApellido(),ArtEl.getCorreo(),ArtEl.getFecha(),NomAlbumes, NomTemas, FechaEliminado );
        
        try {
            ArtistaEliminadoJpaController.create(ArtistaDeleted);
        } catch (Exception e) {
            System.out.println("Error al guardar el album: " + e.getMessage());
        }
        //Hasta aca se devio haber creado el Artista Eliminado, faltaria toda la logiaca para eliminar al artista de las demas tablas
     
        /*artista_album *
        album_genero *
        cliente_album * 
        particular_tema
        pordefecto_tema
        cliente_tema
        tema_genero
        tema
        
        album
        artistas_seguidos
        artista*/
        
        
        EntityManager em = ArtistaController.getEntityManager();

        try {
            em.getTransaction().begin(); // Iniciar transacción
            
            if(AlbumesArtista!=null || !(AlbumesArtista.isEmpty())){
                for(Album alb : AlbumesArtista){
                    // consulta para eliminar todas las filas en artista_album
                    String deleteArtistaAlbum = "DELETE FROM artista_album WHERE Artista_NICK = ?";
                    em.createNativeQuery(deleteArtistaAlbum)
                      .setParameter(1, nickArtista)
                      .executeUpdate();

                    // consulta para eliminar todas las filas en album_genero
                    String deleteAlbumGenero = "DELETE FROM album_genero WHERE Album_NOMBRE = ?";
                    em.createNativeQuery(deleteAlbumGenero)
                      .setParameter(1, alb.getNombre())
                      .executeUpdate();

                    // consulta para eliminar todas las filas en cliente_album
                    String deleteClienteAlbum = "DELETE FROM cliente_album WHERE albumFav_NOMBRE = ?";
                    em.createNativeQuery(deleteClienteAlbum)
                      .setParameter(1, alb.getNombre())
                      .executeUpdate();

                    //loop para eliminar temas del album
                    for(Tema tem : alb.getTemas()){
                        //eliminar tema de particular_tema
                        String deleteParticularTema = "DELETE FROM particular_tema WHERE temas_IDTEMA = ?";
                        em.createNativeQuery(deleteParticularTema)
                          .setParameter(1, tem.getIdTema())
                          .executeUpdate();

                        //eliminar tema de pordefecto_tema
                        String deletePordefectoTema = "DELETE FROM pordefecto_tema WHERE temas_IDTEMA = ?";
                        em.createNativeQuery(deletePordefectoTema)
                          .setParameter(1, tem.getIdTema())
                          .executeUpdate();

                        //eliminar tema de cliente_tema (favoritos del cliente)
                        String deleteClienteTema = "DELETE FROM cliente_tema WHERE temasFAV_IDTEMA = ?";
                        em.createNativeQuery(deleteClienteTema)
                          .setParameter(1, tem.getIdTema())
                          .executeUpdate();

                        //eliminar tema de tema_genero
                        String deleteTemaGenero = "DELETE FROM tema_genero WHERE Tema_IDTEMA = ?";
                        em.createNativeQuery(deleteTemaGenero)
                          .setParameter(1, tem.getIdTema())
                          .executeUpdate();

                        //eliminar tema 
                        String deleteTema = "DELETE FROM tema WHERE IDTEMA = ?";
                        em.createNativeQuery(deleteTema)
                          .setParameter(1, tem.getIdTema())
                          .executeUpdate();

                    }

                    //eliminar album
                    String deleteAlbum = "DELETE FROM album WHERE NOMBRE = ?";
                    em.createNativeQuery(deleteAlbum)
                      .setParameter(1, alb.getNombre())
                      .executeUpdate();
                }
            }
            String deleteArtistasSeguidos = "DELETE FROM artistas_seguidos WHERE ARTISTA = ?";
                em.createNativeQuery(deleteArtistasSeguidos)
                  .setParameter(1, nickArtista)
                  .executeUpdate();
                
            String deleteArtista = "DELETE FROM artista WHERE NICK = ?";
                em.createNativeQuery(deleteArtista)
                  .setParameter(1, nickArtista)
                  .executeUpdate();
            
            em.getTransaction().commit(); // Confirmar los cambios
        } catch (Exception e) {
            em.getTransaction().rollback(); // Revertir la transacción si hay un error
            System.out.println("Error al eliminar las entradas: " + e.getMessage());
        } finally {
            em.close(); // Cerrar el EntityManager
        }
        
        
    }
}
