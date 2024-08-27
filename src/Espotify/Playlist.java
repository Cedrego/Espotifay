/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

/**
 *
 * @author cedre
 */
public class Playlist {
    protected String nombre;
    //imagen;
    public Playlist(){}
    public Playlist(String NuevoNombre){
        nombre = NuevoNombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String NuevoNombre){
        nombre = NuevoNombre;
    }
}
