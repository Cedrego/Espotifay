/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import Capa_Presentacion.DataTema;
import Persistencia.GeneroJpaController;
import Persistencia.TemaJpaController;
import Persistencia.AlbumJpaController;
import Persistencia.ArtistaJpaController;
import Persistencia.ClienteJpaController;
import javax.persistence.EntityManager;
/**
 *
 * @author Franco
 */
public class AltaTema {
    Factory fabric =Factory.getInstance();
    ICtrl ctrl = fabric.getICtrl();
    public TemaJpaController temaJpaController = new TemaJpaController();
    public GeneroJpaController generoJpaController = new GeneroJpaController();
    public AlbumJpaController albumJpaController = new AlbumJpaController();
    public AltaTema(DataTema dt){
        Album alb = albumJpaController.findAlbum(dt.getAlbum());
        //String nombreTema,Album alb,String duracionTema, int ordenAlbumT, String guardadoT
        System.out.println("================================");
        System.out.println("Añadiendo tema:");
        System.out.println("Nombre: "+dt.getNombre());
        System.out.println("Album: "+alb.getNombre());
        System.out.println("Duracion: "+dt.getDuracion());
        System.out.println("Posicion: "+dt.getOrdenAlbum());
        System.out.println("Direccion: "+dt.getDireccion());
        System.out.println("================================");
        Tema temaNuevo = new Tema(dt.getNombre(),alb,dt.getDuracion(), dt.getOrdenAlbum(), dt.getDireccion());
        
        for (String gen : dt.getGeneros()){
            temaNuevo.addGenero(generoJpaController.findGenero(gen));
        }
        /*
        try {
            temaJpaController.create(temaNuevo);
            //temaJpaController.getEntityManager().persist(temaNuevo);
            System.out.println("Se creo tema nuevo con: "+temaNuevo.getNombre()+ ", " +temaNuevo.getDuracion()+ ", " + temaNuevo.getOrdenAlbum() + "y " + temaNuevo.getDireccion());
            } catch (Exception e) {
                System.out.println("Error al guardar el tema: " + e.getMessage());
            }*/
        
        EntityManager em = null;
            try {
                em = temaJpaController.getEntityManager();
                em.getTransaction().begin();
                //INSERT INTO tema(IDTEMA, DURACION, GUARDADOEN, NOMBRE, ORDENALBUM, ALBUM_NOMBRE) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]','[value-6]')
                // Inserta en la tabla de unión
                em.createNativeQuery("INSERT INTO tema (DURACION, GUARDADOEN, NOMBRE, ORDENALBUM, ALBUM_NOMBRE, REPRODUCCIONES, DESCARGAS, FAVORITOS, LISTAS) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)")
                        .setParameter(1, temaNuevo.getDuracion())
                        .setParameter(2, temaNuevo.getDireccion())
                        .setParameter(3, temaNuevo.getNombre())
                        .setParameter(4, temaNuevo.getOrdenAlbum())
                        .setParameter(5, temaNuevo.getAlbum().getNombre())
                        .setParameter(6, 0)
                        .setParameter(7, 0)
                        .setParameter(8, 0)
                        .setParameter(9, 0)
                        .executeUpdate();

                em.getTransaction().commit();
                System.out.println("Se creo tema nuevo con: "+temaNuevo.getNombre()+ ", " +temaNuevo.getDuracion()+ ", " + temaNuevo.getOrdenAlbum() + "y " + temaNuevo.getDireccion());
            } catch (Exception e) {
                if (em.getTransaction().isActive()) {
                    em.getTransaction().rollback();
                }
                System.out.println("Error al guardar el tema: " + e.getMessage());
                e.printStackTrace();
            } finally {
                em.close();
            }
            
        for (String gen : dt.getGeneros()){
                try {
                    em = temaJpaController.getEntityManager();
                    em.getTransaction().begin();
                    
                    // Inserta en la tabla de unión
                    //INSERT INTO `tema_genero`(`Tema_IDTEMA`, `generos_NOMBRE`) VALUES ('[value-1]','[value-2]')
                    em.createNativeQuery("INSERT INTO tema_genero (Tema_IDTEMA, generos_NOMBRE) VALUES (?, ?)")
                            .setParameter(1, ctrl.obtenerIdTema(temaNuevo.getNombre(), temaNuevo.getAlbum().getNombre()))
                            .setParameter(2, gen)
                            .executeUpdate();

                    em.getTransaction().commit();
                } catch (Exception e) {
                    if (em.getTransaction().isActive()) {
                        em.getTransaction().rollback();
                    }
                    e.printStackTrace();
                } finally {
                    em.close();
                }
        }
            

    }
}
