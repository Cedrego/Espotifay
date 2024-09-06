/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 *
 * @author Franco
 */
@Entity
public class Tema implements Serializable {
    @Id
    private String nombre;
    private String duracion;
    private int ordenAlbum;
    private List<Genero> generos;

    public Tema() {
    }

    public Tema(String nombreTema,String duracionTema, int ordenAlbumT) {
        this.nombre = nombreTema;
        this.duracion = duracionTema;
        this.ordenAlbum = ordenAlbumT;
        this.generos = new ArrayList<>(); //inicializa lista de generos
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
    
    public List<Genero> getGeneros(){
        return generos;
    }
    
    //Set variables
    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public void setDuracion(String dur) {
        this.duracion = dur;
    }
    
    public void setNombre(int orden) {
        this.ordenAlbum = orden;
    }
    
    public void setGeneros(List<Genero> gen){
        this.generos=gen;
    }
    
    //agregar a la  lista
    public void addGenero(Genero gen){
        this.generos.add(gen);
    }
}
