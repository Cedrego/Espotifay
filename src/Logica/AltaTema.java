/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import Capa_Presentacion.DataTema;
import Persistencia.GeneroJpaController;
import Persistencia.TemaJpaController;
/**
 *
 * @author Franco
 */
public class AltaTema {
    public TemaJpaController temaJpaController = new TemaJpaController();
    public GeneroJpaController generoJpaController = new GeneroJpaController();
    public AltaTema(DataTema dt){
        Tema temaNuevo = new Tema(dt.getNombre(), dt.getDuracion(), dt.getOrdenAlbum(), dt.getDireccion());
        
        for (String gen : dt.getGeneros()){
            temaNuevo.addGenero(generoJpaController.findGenero(gen));   
        }
        
        try {
            temaJpaController.create(temaNuevo);
            System.out.println("Se creo tema nuevo con: "+temaNuevo.getNombre()+ ", " +temaNuevo.getDuracion()+ ", " + temaNuevo.getOrdenAlbum() + "y " + temaNuevo.getDireccion());
            } catch (Exception e) {
                System.out.println("Error al guardar el tema: " + e.getMessage());
            }

    }
}
