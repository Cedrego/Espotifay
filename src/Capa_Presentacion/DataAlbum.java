/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Presentacion;
import java.util.ArrayList;
import java.util.List;

public class DataAlbum {
    private String nombre;
    private String artista;
    private int creacion;
    private List<DataTema> temas;
    private List<DataGenero> generos;
    
    public DataAlbum() {
    }

    public DataAlbum(String nombre, String artista, int creacion) {
        this.nombre = nombre;
        this.artista = artista;
        this.creacion = creacion;
        this.temas = new ArrayList();
        this.generos = new ArrayList();
    }
    
    public DataAlbum(String nombre, String artista, int creacion,List<DataTema> Temas,List<DataGenero> Generos) {
        this.nombre = nombre;
        this.artista = artista;
        this.creacion = creacion;
        this.temas = Temas;
        this.generos = Generos;
    }
   
    //Get variables
    public String getNombre() {
        return nombre;
    }
    
    public String getArtista() {
        return artista;
    }
 
    public int getCreacion() {
        return creacion;
    }

    public List<DataTema> getDataTemas() {
        return temas;
    }

    public List<DataGenero> getDataGeneros() {
        return generos;
    }

    //Set variables
    public void setNombre(String nom) {
        this.nombre = nom;
    }
    
    public void setArtista(String art) {
        this.artista = art;
    }
    
    public void setFecha(int fech) {
        this.creacion = fech;
    }

    public void setDataTemas(List<DataTema> temas) {
        this.temas = temas;
    }

    public void setDataGeneros(List<DataGenero> Generos) {
        this.generos = Generos;
    }
}