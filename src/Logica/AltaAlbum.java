/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import Capa_Presentacion.Album;
import Persistencia.ArtistaJpaController;
import java.util.List;
/**
 *
 * @author Franco
 */
public class AltaAlbum {
    private ICtrl ictrl;
    
    public AltaAlbum (ICtrl ic, String nombreArtista, String nombreAlbum, int anioCreacion, List<Genero> generos, List<Tema> temas){
        ManejadorMusica mm = ManejadorMusica.getInstance(); //consigo instancia de manejador de musica
        ManejadorUsuario mu = ManejadorUsuario.getInstance(); //consigo instancia de manejador de usuarios
        ictrl = ic; //inicializo controlador
        
        Album albumNuevo = ictrl.CrearAlbum(nombreAlbum, nombreArtista, anioCreacion, generos, temas); //creo la instancia de album        
        mm.addAlbum(albumNuevo); //agrego la instancia a la lista de albumes del manejador
        
        Artista artista = mu.buscarArtista(nombreArtista); //busco el artista
        artista.addAlbum(albumNuevo); //agrego la instancia a la lista de albumes del artista
    }  
    
    
}
