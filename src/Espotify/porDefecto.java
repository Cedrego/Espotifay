/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author cedre
 */
@Entity
@PrimaryKeyJoinColumn(name = "NOMBRE_PLAYLIST")
public class porDefecto extends Playlist {
    @OneToOne
    private Genero genero;

    public porDefecto() {}
     public porDefecto(String NuevoNombre, Genero Gen){
        this.genero = Gen;
        nombre = NuevoNombre;
        this.temas = new ArrayList();
    }   

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public void addTema(Tema tem){
        this.temas.add(tem);
    }

}