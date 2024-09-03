/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camilo
 */

//@Entity
public class Artista extends Usuario {
    
    //VER BIEN COMO FUNCIONA CON CLASES EXTENDIDAS
    //@Column (name="SITIO WEB");
    private String SitioWeb;
    //@Column (name="BIOGRAFIA");
    private String Biografia;
    //@OneToMany
    //aca va una join table
    private List<Album> albumes;
    
    
    public Artista() {
    }

    public Artista(String webSite, String bio) {
        this.SitioWeb = webSite;
        this.Biografia = bio;
        this.albumes = new ArrayList<>(); //inicializa lista de albumes
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
    
    //agregar a lista
    public void addAlbum(Album alb){
        this.albumes.add(alb);
    }
}
