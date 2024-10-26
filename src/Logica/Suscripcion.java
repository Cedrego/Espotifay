/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author User
 */

@Entity
@Table(name = "suscripcion")
public class Suscripcion implements Serializable  {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private estado Estado;
    @Enumerated(EnumType.STRING)
    private tipo Tipo;
    private DTFecha UltimaModificacion;
    @OneToOne
    private Cliente cliente;
    public Suscripcion(){ 
    }
    public Suscripcion(estado Estado, DTFecha UltimaModificacion, tipo Tipo, Cliente Cli) {
        this.Estado = Estado;
        this.UltimaModificacion = UltimaModificacion;
        this.Tipo = Tipo;
        this.cliente = Cli;
    }
    public Long getId(){
        return id;
    }
    public estado getEstado() {
        return Estado;
    }

    public tipo getTipo() {
        return Tipo;
    }

    public String getCliente() {
        return cliente.getNickname();
    }

    public DTFecha getUltimaModificacion() {
        return UltimaModificacion;
    }

    public void setEstado(estado Estado) {
        this.Estado = Estado;
    }

    public void setUltimaModificacion(DTFecha UltimaModificacion) {
        this.UltimaModificacion = UltimaModificacion;
    }
    public enum estado{
        Cancelada, Pendiente, Vencida, Vigente;
    }
    public enum tipo{
        Semanal,Mensual,Anual;
    }
    
}
