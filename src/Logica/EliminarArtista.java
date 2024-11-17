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
     }
}
