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
public class AltaAlbum {
    /*
    private JTextField nombreAlbum;
    private JTextField anioAlbum;
    private JTextField generosAlbum;
    private JTextField temasAlbum;
    private JLabel ingresarNombre;
    private JLabel ingresarAnio;
    private JLabel ingresarGeneros;
    private JLabel ingresarTemas;
    */
    public Album AltaAlbum (Artista artista, String nombreA, int anioA, List<Genero> generosA, List<Tema> temasA){
        Album nuevoAlbum = new Album(nombreA,anioA);
        
        for (Genero genero : generosA){
            nuevoAlbum.addGenero(genero);
        }
        
        for (Tema tema : temasA){
            nuevoAlbum.addTemas(tema);
        }
        
        artista.addAlbum(nuevoAlbum);
        return nuevoAlbum;
    };
}
