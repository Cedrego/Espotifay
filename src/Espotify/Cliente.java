/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

import Persistencia.ClienteJpaController;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Camilo
 */
@Entity
@Table(name = "Cliente")
public class Cliente extends Usuario {

    @OneToMany
    private List<Particular> particular; //coleccion
    
     // Relación autoreferencial para seguir a otros clientes
    @ManyToMany
    @JoinTable(
        name = "cliente_sigue_cliente",
        joinColumns = @JoinColumn(name = "cliente_id"),
        inverseJoinColumns = @JoinColumn(name = "sigue_a_id")
    )
    private List<Cliente> cliSigueA;
    
    @ManyToMany(mappedBy = "cliSigueA")
    private List<Cliente> seguidoPor;
    
    @ManyToMany
    @JoinTable(
        name = "ARTISTAS_SEGUIDOS",
        joinColumns = @JoinColumn(name = "CLIENTE"),
        inverseJoinColumns = @JoinColumn(name = "ARTISTA")
    )
    private List<Artista> artSigueA;
    
    @OneToMany
    private List<Album> albumFav; //coleccion
    
    @OneToMany
    private List<Tema> temasFAV; //coleccion
    
    @OneToMany
    private List<porDefecto> playFavPD; //coleccion
    
    @JoinColumn
    private List<Particular> playFavPart; //coleccion

    public Cliente() {
    }

    public Cliente(String nick, String nom, String ape, String mail, DTFecha fech) {
        super(nick, nom, ape, mail, fech);
        this.particular = new ArrayList();
        this.cliSigueA = new ArrayList();
        this.artSigueA = new ArrayList();
        this.seguidoPor = new ArrayList();
        this.albumFav = new ArrayList();
        this.temasFAV = new ArrayList();
        this.playFavPD = new ArrayList();
        this.playFavPart = new ArrayList();
    }
    
    //setters
    public void setParticular(List<Particular> particular) {
        this.particular = particular;
    }

    public void setCliSigueA(List<Cliente> sigueA) {
        this.cliSigueA = sigueA;
    }
    
    public void setArtSigueA(List<Artista> artSigueA) {
        this.artSigueA = artSigueA;
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

    public void setPlayFavPD(List<porDefecto> playFavPD) {
        this.playFavPD = playFavPD;
    }

    public void setPlayFavPart(List<Particular> playFavPart) {
        this.playFavPart = playFavPart;
    }
    
    //gettersssss
    public List<Particular> getParticular() {
        return particular;
    }

    public List<Cliente> getCliSigueA() {
        return cliSigueA;
    }
    public List<Artista> getArtSigueA() {
        return artSigueA;
    }

    public List<Cliente> getSeguidoPor() {
        ClienteJpaController clijpa = new ClienteJpaController();
        return clijpa.findCliente(this.getNickname()).seguidoPor;
    }

    public List<Album> getAlbumFav() {
        return albumFav;
    }

    public List<Tema> getTemasFAV() {
        return temasFAV;
    }

    public List<porDefecto> getPlayFavPD() {
        return playFavPD;
    }

    public List<Particular> getPlayFavPart() {
        return playFavPart;
    }
    
    //adderssssssssss
    public void addParticular(Particular part){
        this.particular.add(part);
    }
    
    public void addTemaFav(Tema tem){
        this.temasFAV.add(tem);
    }
    
    public void addAlbumFav(Album alb){
        this.albumFav.add(alb);
    }
    
    public void addParticularFav(Particular part){
        this.playFavPart.add(part);
    }
    
    public void addPDFav(porDefecto pd){
        this.playFavPD.add(pd);
    }
    
    //busquersssssssssssssss
    public Particular buscarListPFav(String nom){
        for (Particular part : this.playFavPart){
            if(part.getNombre().equalsIgnoreCase(nom)){
                return part;
            }
        }
        return null;
    }
    
    public porDefecto buscarListPDFav(String nom){
        for (porDefecto pd : this.playFavPD){
            if(pd.getNombre().equalsIgnoreCase(nom)){
                return pd;
            }
        }
        return null;
    }
    
    public Album buscarAlbumFav(String nom){
        for (Album alb : this.albumFav){
            if(alb.getNombre().equalsIgnoreCase(nom)){
                return alb;
            }
        }
        return null;
    }
    
    public Tema buscarTemaFav(String nom){
        for (Tema tem : this.temasFAV){
            if(tem.getNombre().equalsIgnoreCase(nom)){
                return tem;
            }
        }
        return null;
    }
    
    //rimuversssssssssssssssssssss ss
    public void removeTemaFav(Tema tem){
        this.temasFAV.remove(tem);
    }
    
    public void removePlayPartFav(Particular part){
       this.playFavPart.remove(part);
    }

    public void removePlayPDFav(porDefecto pd){
       this.playFavPD.remove(pd);
    }

    public void removeAlbumFav(Album alb){
       this.albumFav.remove(alb);
    }
    
}
