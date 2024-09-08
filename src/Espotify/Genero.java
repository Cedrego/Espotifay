/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.OneToOne;

/**
 *
 * @author Franco
 */
@Entity
public class Genero implements Serializable{
    @Id
    @Column (name="NOMBRE")
    private String nombre;
    @Column (name="SUBGENERO DE")
    @OneToOne
    private Genero padre;
    
    public Genero(String nom){
        this.nombre=nom;
        this.padre = null;
    }
    
    //getters
    public String getNombre(){
        return nombre;
    }
    public Genero getPadre(){
        return padre; 
    }
    
    //setters
    public void setNombre(String nom){
        this.nombre = nom;
    }
    public void setPadre(Genero gen){
        this.padre=gen;
    }
}
