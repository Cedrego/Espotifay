/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Camilo
 */
@Entity
public class Cliente extends Usuario {
    
    @Column (name="PLAYLISTS")
    private Particular particular; //coleccion
    @Column (name="SIGUE A")
    private Usuario SigueA;
    @Column (name="SEGUIDO POR")
    private Usuario SeguidoPor;
    @Column (name="ALBUMES FAVORITOS")
    private Album albumFav; //coleccion
    @Column (name="TEMAS FAVORITOS")
    private Tema temasFAV; //coleccion
    @Column (name="PLAYLISTS FAVORITAS")
    private Playlist playFav; //coleccion

    public Cliente(Particular particular, Usuario SigueA, Usuario SeguidoPor, Album albumFav, Tema temasFAV, Playlist playFav) {
        this.particular = particular;
        this.SigueA = SigueA;
        this.SeguidoPor = SeguidoPor;
        this.albumFav = albumFav;
        this.temasFAV = temasFAV;
        this.playFav = playFav;
    }

    public Cliente() {
    }

    public Particular getParticular() {
        return particular;
    }

    public Usuario getSigueA() {
        return SigueA;
    }

    public Usuario getSeguidoPor() {
        return SeguidoPor;
    }

    public Album getAlbumFav() {
        return albumFav;
    }

    public Tema getTemasFAV() {
        return temasFAV;
    }

    public Playlist getPlayFav() {
        return playFav;
    }

    public void setParticular(Particular particular) {
        this.particular = particular;
    }

    public void setSigueA(Usuario SigueA) {
        this.SigueA = SigueA;
    }

    public void setSeguidoPor(Usuario SeguidoPor) {
        this.SeguidoPor = SeguidoPor;
    }

    public void setAlbumFav(Album albumFav) {
        this.albumFav = albumFav;
    }

    public void setTemasFAV(Tema temasFAV) {
        this.temasFAV = temasFAV;
    }

    public void setPlayFav(Playlist playFav) {
        this.playFav = playFav;
    }
    
    
}
