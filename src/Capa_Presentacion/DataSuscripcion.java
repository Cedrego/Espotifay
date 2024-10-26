/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Presentacion;

import Logica.DTFecha;
import Logica.Suscripcion;

/**
 *
 * @author User
 */
public class DataSuscripcion {

    private Long id;
    private Suscripcion.estado Estado;
    private Suscripcion.tipo Tipo;
    private DTFecha UltimaModificacion;
    private String cliente;
    
    public DataSuscripcion(){}
    public DataSuscripcion(Long id, Suscripcion.estado Estado, Suscripcion.tipo Tipo, DTFecha UltimaModificacion, String cliente) {
        this.id = id;
        this.Estado = Estado;
        this.Tipo = Tipo;
        this.UltimaModificacion = UltimaModificacion;
        this.cliente = cliente;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEstado(Suscripcion.estado Estado) {
        this.Estado = Estado;
    }

    public void setTipo(Suscripcion.tipo Tipo) {
        this.Tipo = Tipo;
    }

    public void setUltimaModificacion(DTFecha UltimaModificacion) {
        this.UltimaModificacion = UltimaModificacion;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public Suscripcion.estado getEstado() {
        return Estado;
    }

    public Suscripcion.tipo getTipo() {
        return Tipo;
    }

    public DTFecha getUltimaModificacion() {
        return UltimaModificacion;
    }

    public String getCliente() {
        return cliente;
    }
    
}
