/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

/**
 *
 * @author Camilo
 */
public class Artista extends Usuario {
    
    private String SitioWeb;
    private String Biografia;
    //private puntero Compone;
    
    
    public Artista() {
    }

    public Artista(String webSite, String bio) {
        SitioWeb = webSite;
        Biografia = bio;
        //Compone = composes;
    }
    
    //Get variables
    public String getSitioWeb() {
        return SitioWeb;
    }
    
    public String getBiografia() {
        return Biografia;
    }
    
    //Set variables
    public void setSitioWeb(String webSite) {
        SitioWeb = webSite;
    }
}
