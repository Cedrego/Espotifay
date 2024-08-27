/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;


/**
 *
 * @author Franco
 */
public class Tema {
    
    private String nombre;
    private String duracion;
    private int ordenAlbum;
    //puntero a genero?
    
    public Tema() {
    }

    public Tema(String nombreTema,String duracionTema, int ordenAlbumT) {
        this.nombre = nombreTema;
        this.duracion = duracionTema;
        this.ordenAlbum = ordenAlbumT;
    }
    
    //Get variables
    public String getNombre() {
        return nombre;
    }
    
    public String getDuracion() {
        return duracion;
    }
    
    public int getOrdenAlbum() {
        return ordenAlbum;
    }
    
    //Set variables
    public void setNombre(String nom) {
        nombre = nom;
    }

    public void setDuracion(String dur) {
        duracion = dur;
    }
    
    public void setNombre(int orden) {
        ordenAlbum = orden;
    }
}
