/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author cedre
 */
@Entity
@PrimaryKeyJoinColumn(name = "NOMBRE_PLAYLIST")
public class Particular extends Playlist {
    @Column (name="PRIVADO")
    private boolean privado;
    
    public Particular(){}
    
    public Particular(String NuevoNombre){
        nombre = NuevoNombre;
        privado = true;
        this.temas = new ArrayList();
    }   
    
    public boolean getPrivado(){
        return privado;
    }
    public void removerTema(String NomTema){
       for(Tema tem : this.temas){
           if(tem.getNombre().equalsIgnoreCase(NomTema)){
               this.temas.remove(tem);
           }
       }
    }
    public void setPrivado(boolean EsPrivado){
        this.privado = EsPrivado;
    }
    public void addTema(Tema tem){
        this.temas.add(tem);
    }
}