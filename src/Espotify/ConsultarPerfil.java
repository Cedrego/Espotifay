/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

/**
 *
 * @author cedre
 */
public class ConsultarPerfil {
    
    public ConsultarPerfil (ICtrl ic, String nombreG, String nombreP){
        ManejadorMusica mm = ManejadorMusica.getInstance(); //inicializar/obtener manejador
        ICtrl ictrl = ic; //inicializar controlador
        Genero Padre = mm.buscarGenero(nombreP); //busco el genero padre en la lista del manejador
        Genero generoNuevo = ictrl.crearGenero(nombreG, Padre); //creo la instancia de genero
        mm.addGenero(generoNuevo); //agrego la nueva instancia a la lista
    }
}
