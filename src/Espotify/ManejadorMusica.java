/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

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
    
    private static ManejadorMusica instancia = null;
    
    //inicializo ambas colecciones en formato de mapa para guardar junto con sus nicknames
    private ManejadorMusica(){
        this.albumesGen = new ArrayList<>();
        this.temasGen = new ArrayList<>();
        this.generosGen = new ArrayList<>();
        
        Genero gen = new Genero("Genero");
        this.generosGen.add(gen);
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
        for (Album alb : this.albumesGen){
            if(alb.getNombre().equalsIgnoreCase(nom)){
                return alb;
            }
        }
        return null;
    }
    
    public Tema buscarTema(String nom){
        for (Tema tem : this.temasGen){
            if(tem.getNombre().equalsIgnoreCase(nom)){
                return tem;
            }
        }
        return null;
    }
    
    public Genero buscarGenero(String nom){
        for (Genero gen : this.generosGen){
            if(gen.getNombre().equalsIgnoreCase(nom)){
                return gen;
            }
        }
        return null;
    }
    
    public List<Genero> getGeneros(){
        if(generosGen.isEmpty()){
            return null;
        }
        return generosGen;
    }
}
