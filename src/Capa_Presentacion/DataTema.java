/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Presentacion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Franco
 */
public class DataTema{
    private String nombre;
    private String duracion;
    private int ordenAlbum;
    private String guardadoEn;
    private List<String> generos;
    private String album;

    public DataTema(String nombreTema,String alb,String duracionTema, int ordenAlbumT, String guardadoT,List<String> Generos) {
        this.nombre = nombreTema;
        this.duracion = duracionTema;
        this.ordenAlbum = ordenAlbumT;
        this.guardadoEn = guardadoT;
        this.generos = Generos;
        this.album = alb;
        
        System.out.println("Se creo el data tema con: "+this.nombre+", "+this.duracion+" y "+this.ordenAlbum);
    }

    
    //Get variables
    public String getNombre() {
        return nombre;
    }
    
    public String getAlbum() {
        return album;
    }
    
    public String getDuracion() {
        return duracion;
    }
    
    public int getOrdenAlbum() {
        return ordenAlbum;
    }

    public List<String> getGeneros() {
        return generos;
    }
    
    public String getDireccion(){
        return guardadoEn;
    }
    
    //Set variables
    public void setNombre(String nom) {
        this.nombre = nom;
    }
    
    public void setAlbum(String alb) {
        this.album = alb;
    }

    public void setDuracion(String dur) {
        this.duracion = dur;
    }
    
    public void setNombre(int orden) {
        this.ordenAlbum = orden;
    }

    public void setDataGeneros(List<String> generos) {
        this.generos = generos;
    }
}
