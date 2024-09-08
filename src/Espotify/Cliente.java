/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Camilo
 */
@Entity
@Table(name = "Cliente")
@PrimaryKeyJoinColumn(name = "NICK")
public class Cliente extends Usuario {

    @OneToMany
    private List<Particular> particular; //coleccion
    
     // Relación autoreferencial para seguir a otros clientes
    @ManyToMany
    @JoinTable(
        name = "cliente_sigue",
        joinColumns = @JoinColumn(name = "cliente_id"),
        inverseJoinColumns = @JoinColumn(name = "sigue_a_id")
    )
    private List<Cliente> sigueA;

    @ManyToMany(mappedBy = "sigueA")
    private List<Cliente> seguidoPor;
    
    @OneToMany
    private List<Album> albumFav; //coleccion
    
    @OneToMany
    private List<Tema> temasFAV; //coleccion
    
    @OneToMany
    private List<Playlist> playFav; //coleccion

    public Cliente() {
    }

    public Cliente(String nick, String nom, String ape, String mail, DTFecha fech) {
        super(nick, nom, ape, mail, fech);
        this.particular = new ArrayList();
        this.sigueA = new ArrayList();
        this.seguidoPor = new ArrayList();
        this.albumFav = new ArrayList();
        this.temasFAV = new ArrayList();
        this.playFav = new ArrayList();
    }

    public void setParticular(List<Particular> particular) {
        this.particular = particular;
    }

    public void setSigueA(List<Cliente> sigueA) {
        this.sigueA = sigueA;
    }

    public void setSeguidoPor(List<Cliente> seguidoPor) {
        this.seguidoPor = seguidoPor;
    }

    
    public void setAlbumFav(List<Album> albumFav) {
        this.albumFav = albumFav;
    }

    public void setTemasFAV(List<Tema> temasFAV) {
        this.temasFAV = temasFAV;
    }

    public void setPlayFav(List<Playlist> playFav) {
        this.playFav = playFav;
    
    }

    public List<Particular> getParticular() {
        return particular;
    }

    public List<Cliente> getSigueA() {
        return sigueA;
    }

    public List<Cliente> getSeguidoPor() {
        return seguidoPor;
    }

    public List<Album> getAlbumFav() {
        return albumFav;
    }

    public List<Tema> getTemasFAV() {
        return temasFAV;
    }

    public List<Playlist> getPlayFav() {
        return playFav;
    }
    
}
