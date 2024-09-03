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
//@Entity
public class Genero {
    //@Id
    //@Column (name="NOMBRE");
    private String nombre;
    //@Column (name="SUBGENERO DE");
    private List<Genero> subgeneroDe; 
    
    //getters
    public String getNombre(){
        return nombre;
    }
    public List<Genero> getSubgenero(){
        return subgeneroDe; 
    }
    
    //setters
    public void setNombre(String nom){
        this.nombre = nom;
    }
    public void setSubgenero(List<Genero> gen){
        this.subgeneroDe=gen;
    }
    
    //agregar a la lista
    public void addSubgenero(Genero gen){
        this.subgeneroDe.add(gen);
    }
}
