/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Franco
 */
public class ManejadorMusica {
    private Map<String, Album> albumesGen;
    private Map<String, Tema> temasGen;
    private Map<String, Genero> generosGen;
    
    private static ManejadorMusica instancia = null;
    
    //inicializo ambas colecciones en formato de mapa para guardar junto con sus nicknames
    private ManejadorMusica(){
        albumesGen = new HashMap<String, Album>();
        temasGen = new HashMap<String, Tema>();
        generosGen = new HashMap<String, Genero>();
    }
    
    //creo una instancia si no existe una, de lo contrario devuelvo la existente (solo existe una)
    public static ManejadorMusica getInstance(){
        if (instancia == null){
            instancia = new ManejadorMusica();
        }
        return instancia;
    }
    
    
    public void addAlbum(Album alb){
        String nombre = alb.getNombre();
        albumesGen.put(nombre, alb);
    }
    
    public void addTema(Tema tem){
        String nombre = tem.getNombre();
        temasGen.put(nombre, tem);
    }
    
    public void addGenero(Genero gen){
        String nombre = gen.getNombre();
        generosGen.put(nombre, gen);
    }
    
    public Album buscarAlbum(String nom){
        return ((Album) albumesGen.get(nom));
    }
    
    public Tema buscarTema(String nom){
        return ((Tema) temasGen.get(nom));
    }
    
    public Genero buscarGenero(String nom){
        return ((Genero) generosGen.get(nom));
    }
}
