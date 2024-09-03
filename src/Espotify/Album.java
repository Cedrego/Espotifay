/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

import java.io.Serializable;

/**
 *
 * @author Franco
 */
//@Entity
public class Album implements Serializable{
    //@Id
    //@Column (name="NOMBRE");
    private String nombre;
    //@Column (name="CREACION");
    private DTFecha creacion;
    //punteros a tema y genero?
    
    public Album() {
    }

    public Album(String nombreAlbum,DTFecha fechaCreacion) {
        nombre = nombreAlbum;
        creacion = fechaCreacion;  
    }
    
    //Get variables
    public String getNombre() {
        return nombre;
    }
    
    //Get variables
    public DTFecha getCreacion() {
        return creacion;
    }
    
    //Set variables
    public void setNombre(String nom) {
        nombre = nom;
    }
    
    public void setFecha(DTFecha fech) {
        creacion = fech;
    }
}
