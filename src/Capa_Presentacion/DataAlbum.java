/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Presentacion;
import java.util.ArrayList;
import java.util.List;

public class DataAlbum {
    private String pic;
    private String nombre;
    private String artista;
    private int creacion;
    private List<DataTema> temas;
    private List<String> generos;
    
    public DataAlbum() {
    }

    public DataAlbum(String picA,String nombre, String artista, int creacion) {
        this.pic=picA;
        this.nombre = nombre;
        this.artista = artista;
        this.creacion = creacion;
        this.temas = new ArrayList();
        this.generos = new ArrayList();
    }
    
    public DataAlbum(String picA, String nombre, String artista, int creacion,List<DataTema> Temas,List<String> Generos) {
        this.pic=picA;
        this.nombre = nombre;
        this.artista = artista;
        this.creacion = creacion;
        this.temas = Temas;
        this.generos = Generos;
    }
   
    //Get variables
    public String getPic() {
        return pic;
    }
    
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

    public List<String> getGeneros() {
        return generos;
    }

    //Set variables
    public void setPic(String pic) {
        this.pic = pic;
    }
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

    public void setDataGeneros(List<String> Generos) {
        this.generos = Generos;
    }
}