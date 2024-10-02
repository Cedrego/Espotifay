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

public class DataParticular  {

    private boolean privado;
    private DataCliente Datacliente;

    private  String nombre;
    private List<DataTema> Datatemas;
    
    public DataParticular(){}
    
    public DataParticular(String NuevoNombre, DataCliente DataCli, List<DataTema> DataTem){
        this.nombre = NuevoNombre;
        this.privado = true;
        this.Datacliente = DataCli;
        this.Datatemas = DataTem;
    }   
    public DataParticular(String NuevoNombre){
        this.nombre = NuevoNombre;
        this.privado = true;
        this.Datacliente = null ;
        this.Datatemas = new ArrayList();
    }  
    //Setters

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public void setDatacliente(DataCliente Datacliente) {
        this.Datacliente = Datacliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDatatemas(List<DataTema> Datatemas) {
        this.Datatemas = Datatemas;
    }
    //Getters

    public boolean isPrivado() {
        return privado;
    }

    public DataCliente getDatacliente() {
        return Datacliente;
    }

    public String getNombre() {
        return nombre;
    }

    public List<DataTema> getDatatemas() {
        return Datatemas;
    }
  
}