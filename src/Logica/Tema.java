/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Franco
 */
@Entity
@Table(name = "tema")
//@IdClass(TemaId.class)
public class Tema implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincremental
    private int IdTema;
    
    private String nombre;
    private String duracion;
    private int ordenAlbum;
    private String guardadoEn;
    //@Id
    @ManyToOne
    //@JoinColumn(name = "ALBUM_PERTENECE", nullable = false)
    private Album album;
    
    @ManyToMany
    private List<Genero> generos;

    public Tema() {
    }

    public Tema(String nombreTema,Album alb,String duracionTema, int ordenAlbumT, String guardadoT) {
        this.nombre = nombreTema;
        this.duracion = duracionTema;
        this.ordenAlbum = ordenAlbumT;
        this.guardadoEn = guardadoT;
        this.generos = new ArrayList(); //inicializa lista de generos
        this.album = alb;
    }
    
    //Get variables
    public String getNombre() {
        return nombre;
    }
    public int getIdTema(){
        return IdTema;
    }
    public Album getAlbum() {
        return album;
    }
    
    public String getDuracion() {
        return duracion;
    }
    
    public int getOrdenAlbum() {
        return ordenAlbum;
    }

    public List<Genero> getGeneros() {
        return generos;
    }
    
    public String getDireccion(){
        return guardadoEn;
    }
    
    //Set variables
    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public void setDuracion(String dur) {
        this.duracion = dur;
    }
    
    public void setAlbum(Album alb) {
        this.album = alb;
    }
    
    public void setNombre(int orden) {
        this.ordenAlbum = orden;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }

    //agregar a la  lista
    public void addGenero(Genero gen){
        this.generos.add(gen);
    }
}
