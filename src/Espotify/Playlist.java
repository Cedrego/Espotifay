/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 *
 * @author cedre
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Playlist implements Serializable {
    @Id
    @Column (name="NOMBRE")
    protected String nombre;
    @OneToMany
    private List<Tema> temas;
    //imagen;
    
    public Playlist(){
    }
    
    public Playlist(String NuevoNombre){
        nombre = NuevoNombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String NuevoNombre){
        this.nombre = NuevoNombre;
    }
    
}
