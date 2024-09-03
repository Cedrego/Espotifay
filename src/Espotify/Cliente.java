/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

/**
 *
 * @author Camilo
 */
//@Entity
public class Cliente extends Usuario {
    
    
    //@Column (name="PLAYLISTS");
    private Particular particular; //coleccion
    
    //@Column (name="SIGUE A");
    private Usuario SigueA;
    //@Column (name="SEGUIDO POR");
    private Usuario SeguidoPor;
    
    //@Column (name="ALBUMES FAVORITOS");
    private Album albumFav; //coleccion
    
    //@Column (name="TEMAS FAVORITOS");
    private Tema temasFAV; //coleccion
    
    //@Column (name="PLAYLISTS FAVORITAS");
    private Playlist playFav; //coleccion
    
}
