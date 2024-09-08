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
public class Ctrl{

    
    public Ctrl(){}
    
    
    
    //crear un objeto de tipo album 
    public Album CrearAlbum (String nombreA, int anioA, List<Genero> generosA, List<Tema> temasA){
        ManejadorMusica mm = ManejadorMusica.getInstance(); //creo que esto va afuera porque es un control
        if(mm.buscarAlbum(nombreA)!=null){
             System.out.println("El album " +nombreA +" ya existe");
        }else{
        
            Album albumNuevo = new Album(nombreA,anioA); //creo un album, ya inicializa las listas de genero y temas

            for (Genero genero : generosA){
                albumNuevo.addGenero(genero);
            }

            for (Tema tema : temasA){
                albumNuevo.addTemas(tema);
            }

            mm.addAlbum(albumNuevo); //puede que esto vaya afuera también
            return albumNuevo;
        }
        return null;
    };
    
    public Tema CrearTema (String nomT, String duraT, int ordT, List<Genero> generosT){
        Tema temaNuevo = new Tema(nomT, duraT, ordT);
        
        for (Genero gen : generosT){
            temaNuevo.addGenero(gen);
        }
        
        return temaNuevo;
    }
    
    public Genero crearGenero(String nomG, Genero padre){
        Genero generoNuevo = new Genero(nomG);
        
        generoNuevo.setPadre(padre);
        
        return generoNuevo;
    }
    
}
