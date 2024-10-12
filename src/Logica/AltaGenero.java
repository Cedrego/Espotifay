/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import Persistencia.GeneroJpaController;
/**
 *
 * @author Franco
 */
public class AltaGenero {
    public GeneroJpaController generoJpaController = new GeneroJpaController();
    
    public AltaGenero (String nombreG, String nombreP){
        Genero generoNuevo = new Genero(nombreG);
        Genero generoPadre = generoJpaController.findGenero(nombreP);
        
        if(nombreP!=null){
            generoNuevo.setPadre(generoPadre);
        }else{
            generoNuevo.setPadre(generoJpaController.findGenero("Genero"));
        }
        
        try {
            generoJpaController.create(generoNuevo);
            System.out.println("Genero creado con exito");
        } catch (Exception e) {
            System.out.println("Error al crear el genero: " + e.getMessage());
        }
    }
}
