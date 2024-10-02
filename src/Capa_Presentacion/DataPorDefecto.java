/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Presentacion;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author cedre
 */

public class DataPorDefecto  {
    private DataGenero Datagenero;
    private String nombre;
    private List<DataTema> Datatemas;
    //imagen;
    public DataPorDefecto() {}
    
    public DataPorDefecto(String NuevoNombre, DataGenero DataGen, List<DataTema> DataTem){
        this.Datagenero = DataGen;
        this.nombre = NuevoNombre;
        this.Datatemas = DataTem;
    }   
    public DataPorDefecto(String NuevoNombre){
        this.Datagenero = null;
        this.nombre = NuevoNombre;
        this.Datatemas = new ArrayList();
    }
   //Setters

    public void setDatagenero(DataGenero Datagenero) {
        this.Datagenero = Datagenero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDatatemas(List<DataTema> Datatemas) {
        this.Datatemas = Datatemas;
    }
    //Getters

    public DataGenero getDatagenero() {
        return Datagenero;
    }

    public String getNombre() {
        return nombre;
    }

    public List<DataTema> getDatatemas() {
        return Datatemas;
    }
    
}