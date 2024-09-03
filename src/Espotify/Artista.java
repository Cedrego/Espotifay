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
public class Artista extends Usuario {
    
    //VER BIEN COMO FUNCIONA CON CLASES EXTENDIDAS
    //@Column (name="SITIO WEB");
    private String SitioWeb;
    //@Column (name="BIOGRAFIA");
    private String Biografia;
    //@OneToMany
    //aca va una join table
    private Album compone;
    
    
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
