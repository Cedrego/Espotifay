/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

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
    private Genero subgeneroDe; //en  realidad es una lista, ver despues
    
    public String getNombre(){
        return nombre;
    }
    public Genero getSubgenero(){
        return subgeneroDe; //tengo que ver como se devuelve una lista en java
    }
    
    public void setNombre(String nom){
        this.nombre = nom;
    }
    public void setSubgenero(Genero gen){
        //add subgenero a la lista
    }
}
