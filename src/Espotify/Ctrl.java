/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

import java.util.List;

/**
 *
 * @author Franco
 */
public class Ctrl implements ICtrl{

    
    public Ctrl(){}
    
    
    
    //crear un objeto de tipo album
    @Override
    public Album CrearAlbum (String nombreA, int anioA, List<Genero> generosA, List<Tema> temasA){
        
        Album albumNuevo = new Album(nombreA,anioA); //creo un album, ya inicializa las listas de genero y temas

        for (Genero genero : generosA){
            albumNuevo.addGenero(genero);
        }

        for (Tema tema : temasA){
            albumNuevo.addTemas(tema);
        }
        return albumNuevo;
    };
    
    @Override
    public Tema CrearTema (String nomT, String duraT, int ordT, List<Genero> generosT){
        Tema temaNuevo = new Tema(nomT, duraT, ordT);
        
        for (Genero gen : generosT){
            temaNuevo.addGenero(gen);
        }
        
        return temaNuevo;
    }
    
    @Override
    public Genero crearGenero(String nomG, Genero padre){
        Genero generoNuevo = new Genero(nomG);
        
        generoNuevo.setPadre(padre);
        
        return generoNuevo;
    }
    
    @Override
    public Artista crearArtista(String nick, String nom, String ape, String mail, int dia, int mes, int anio, String bio, String web){
        
        DTFecha dtfecha = new DTFecha(dia, mes, anio);
        
        Artista nuevoArtista = new Artista(nick, nom, ape, mail, dtfecha, bio, web);
        
        return nuevoArtista;
    }
    
    @Override
    public Cliente crearCliente(String nick, String nom, String ape, String mail, int dia, int mes, int anio){
        DTFecha dtfecha = new DTFecha(dia, mes, anio);
        
        Cliente nuevoCliente = new Cliente(nick, nom, ape, mail, dtfecha);
        
        return nuevoCliente;
    }
    
    @Override
    public Particular CrearListParticular(String nombre){
        Particular nuevoParticular = new Particular(nombre);
        return nuevoParticular;
    }
    @Override
    public porDefecto CrearListPorDefecto(String nombre, String genero){
        
        ManejadorMusica mm = ManejadorMusica.getInstance();
        Genero Gen = mm.buscarGenero(nombre);//Busco la instancia de genero
        porDefecto nuevoPorDefecto = new porDefecto(nombre,Gen);//Uso el constructor de pordefcto
        return nuevoPorDefecto;
    }
}
