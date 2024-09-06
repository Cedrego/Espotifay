/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Franco
 */
@Entity
public class Album implements Serializable{
    @Id
    @Column (name="NOMBRE")
    private String nombre;
    @Column (name="CREACION")
    private int creacion;
    @Column (name="TEMAS")
    private List<Tema> temas;
    @Column (name="GENEROS")
    private List<Genero> generos;
    
    public Album() {
    }

    public Album(String nombreAlbum,int anioCreacion) {
        this.nombre = nombreAlbum;
        this.creacion = anioCreacion;
        this.temas = new ArrayList<>(); // Inicializa la lista de temas
        this.generos = new ArrayList<>(); // Inicializa la lista de generos
    }
    
    //Get variables
    public String getNombre() {
        return nombre;
    }
    
 
    public int getCreacion() {
        return creacion;
    }
    
    public List<Tema> getTemas(){
        return temas;
    }
    
    public List<Genero> getGeneros(){
        return generos;
    }
    
    
    //Set variables
    public void setNombre(String nom) {
        this.nombre = nom;
    }
    
    public void setFecha(int fech) {
        this.creacion = fech;
    }
    
    public void setTemas(List<Tema> tem){
        this.temas = tem;
    }
    
    public void setGeneros (List<Genero> gen){
        this.generos = gen;
    }
    
    //Agregar a listas
    
    public void addGenero(Genero gen){
        this.generos.add(gen);
    }
    
    public void addTemas(Tema tem){
        this.temas.add(tem);
    }
}
