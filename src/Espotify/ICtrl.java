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
public interface ICtrl {
    
    public abstract Album CrearAlbum (String nombreA, int anioA, List<Genero> generosA, List<Tema> temasA);
    public abstract Genero crearGenero(String nomG, Genero padre);
}
