/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

import Persistencia.AlbumJpaController;
import Persistencia.GeneroJpaController;
import Persistencia.TemaJpaController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Franco
 */
public class ManejadorMusica {
    private List<Album> albumesGen;
    private List<Tema> temasGen;
    private List<Genero> generosGen;
    GeneroJpaController genJpa = new GeneroJpaController();
    TemaJpaController temJpa = new TemaJpaController();
    AlbumJpaController albJpa = new AlbumJpaController();
    private static ManejadorMusica instancia = null;
    
    //inicializo ambas colecciones en formato de mapa para guardar junto con sus nicknames
    private ManejadorMusica(){
        this.albumesGen = new ArrayList<>();
        this.temasGen = new ArrayList<>();
        this.generosGen = new ArrayList<>();
        
        /* datos de prueba og
        Genero genero1 = new Genero("genero1");
        Genero genero2 = new Genero("genero2");
        Genero genero3 = new Genero("genero3");
        this.generosGen.add(genero1);
        this.generosGen.add(genero2);
        this.generosGen.add(genero3);
        */
    }
    
    //creo una instancia si no existe una, de lo contrario devuelvo la existente (solo existe una)
    public static ManejadorMusica getInstance(){
        if (instancia == null){
            instancia = new ManejadorMusica();
        }
        return instancia;
    }
    
    
    public void addAlbum(Album alb){
        this.albumesGen.add(alb);
    }
    
    public void addTema(Tema tem){
        this.temasGen.add(tem);
    }
    
    public void addGenero(Genero gen){
        this.generosGen.add(gen);
    }
    
    public Album buscarAlbum(String nom){
        if(albJpa.findAlbum(nom)!=null){
            return albJpa.findAlbum(nom);
        }
        return null;
    }
    
    public Tema buscarTema(String nom){
        if(temJpa.findTema(nom)!=null){
            return temJpa.findTema(nom);
        }
        return null;
    }
    
    public Genero buscarGenero(String nom){
        if(genJpa.findGenero(nom)!=null){
            return genJpa.findGenero(nom);
        }
        return null;
    }
    
    public List<Genero> getGeneros(){
        return genJpa.findGeneroEntities();
    }
    
    public List<Tema> getTema(){
        return temJpa.findTemaEntities();
    }
    
    public List<Album> getAlbumes(){
        return albJpa.findAlbumEntities();
    }
}
