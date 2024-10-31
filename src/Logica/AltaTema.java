/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import Capa_Presentacion.DataTema;
import Persistencia.GeneroJpaController;
import Persistencia.TemaJpaController;
import Persistencia.AlbumJpaController;
/**
 *
 * @author Franco
 */
public class AltaTema {
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
        
        try {
            temaJpaController.create(temaNuevo);
            temaJpaController.getEntityManager().persist(temaNuevo);
            System.out.println("Se creo tema nuevo con: "+temaNuevo.getNombre()+ ", " +temaNuevo.getDuracion()+ ", " + temaNuevo.getOrdenAlbum() + "y " + temaNuevo.getDireccion());
            } catch (Exception e) {
                System.out.println("Error al guardar el tema: " + e.getMessage());
            }

    }
}
