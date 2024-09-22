/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

import Persistencia.AlbumJpaController;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Camilo
 */

@Entity
@Table(name = "Artista")
public class Artista extends Usuario {
    
    //VER BIEN COMO FUNCIONA CON CLASES EXTENDIDAS
    @Column (name="SITIO_WEB")
    private String SitioWeb;
    @Column (name="BIOGRAFIA")
    private String Biografia;
    //aca va una join table
    @OneToMany
    private List<Album> albumes;
    
    @ManyToMany(fetch = FetchType.EAGER,mappedBy = "artSigueA")
    private List<Cliente> seguidoPorA;
    
    public Artista() {
    }

    public Artista(String nick, String nom, String ape, String mail, DTFecha fech, String bio, String webSite) {
        super(nick, nom, ape, mail, fech);
        this.SitioWeb = webSite;
        this.Biografia = bio;
        this.albumes = new ArrayList<>(); //inicializa lista de albumes
        this.seguidoPorA = new ArrayList<>(); //inicializa lista de albumes
    }
    
    //Get variables
    public String getSitioWeb() {
        return SitioWeb;
    }
    
    public String getBiografia() {
        return Biografia;
    }
    
    public List<Album> getAlbumes(){
        return albumes;
    }
    public List<Cliente> getSeguidoPorA(){
        return seguidoPorA;
    }
    
    //Set variables
    public void setSitioWeb(String webSite) {
        this.SitioWeb = webSite;
    }
    
    public void setBiografia(String bio){
        this.Biografia=bio;
    }
    
    public void setAlbumes(List<Album> alb){
        this.albumes = alb;
    }
    
    public void setSeguidoPorA(List<Cliente> seg){
        this.seguidoPorA = seg;
    }
    
    //agregar a lista
    public void addAlbum(Album alb){
        this.albumes.add(alb);
    }
    
    public void addSeguidoPorA(Cliente seg){
        this.seguidoPorA.add(seg);
    }
}
