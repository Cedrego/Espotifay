/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Capa_Presentacion.DataTema;
import Persistencia.AlbumJpaController;
import Persistencia.ArtistaJpaController;
import Persistencia.GeneroJpaController;
import Persistencia.TemaJpaController;
import java.util.List;
/**
 *
 * @author Franco
 */
public class AltaAlbum {
    Factory fabric =Factory.getInstance();
    ICtrl ctrl = fabric.getICtrl();
    public GeneroJpaController generoJpaController = new GeneroJpaController();
    public TemaJpaController temaJpaController = new TemaJpaController();
    public AlbumJpaController albumJpaController = new AlbumJpaController();
    public ArtistaJpaController artistaJpaController = new ArtistaJpaController();
    
    public AltaAlbum (String nombreAlbum, String nombreArtista, int anioCreacion, List<String> generos, List<DataTema> temas){

        Album albumNuevo = new Album(nombreAlbum, nombreArtista ,anioCreacion); //creo un album, ya inicializa las listas de genero y temas

        for (String genero : generos){
            albumNuevo.addGenero(generoJpaController.findGenero(genero));
        }

        for (DataTema datatema : temas){
            /*if(datatema.getNombre()==null){
                System.out.println("el tema es nulo");
            }else{
                System.out.println("el nombre del tema es:"+datatema.getNombre());
            }*/
            
            ctrl.CrearTema(datatema);
            
            albumNuevo.addTemas(temaJpaController.findTema(datatema.getNombre()));
        }
        
        //persistimos album
        try {
            albumJpaController.create(albumNuevo);
        } catch (Exception e) {
            System.out.println("Error al guardar el album: " + e.getMessage());
        }
        
        Artista artistaAlbum = artistaJpaController.findArtista(nombreArtista);
        artistaAlbum.addAlbum(albumNuevo);
        
        
    }  
    
    
}
