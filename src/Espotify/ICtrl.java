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
    public abstract Tema CrearTema(String nomT, String duraT, int ordT, List<Genero> generosT);
    public abstract Genero crearGenero(String nomG, Genero padre);
    public abstract Cliente crearCliente(String nick, String nom, String ape, String mail, int dia, int mes, int anio);
    public abstract Artista crearArtista(String nick, String nom, String ape, String mail, int dia, int mes, int anio, String bio, String web);

    public abstract Particular CrearListParticular(String nombre);
    public abstract porDefecto CrearListPorDefecto(String nombre, String genero);
}
