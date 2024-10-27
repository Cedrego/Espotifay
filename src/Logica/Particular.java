/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.ParticularJpaController;
import Persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author cedre
 */
@Entity
@Table(name = "particular")
@IdClass(PartId.class)
public class Particular extends Playlist implements Serializable {
    @Column (name="PRIVADO")
    private boolean privado;
    @Id
    @ManyToOne
    private Cliente cliente;
    @JoinColumn 
    private DTFecha fecha;
    
    public Particular(){}
    
    public Particular(String NuevoNombre, Cliente cli, DTFecha Fecha){
        this.nombre = NuevoNombre;
        this.privado = true;
        this.cliente = cli;
        this.temas = new ArrayList();
        this.fecha = Fecha;
    }   
    
    public boolean getPrivado(){
        return privado;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    public void removerTema(String NomTema){
       for(Tema tem : this.temas){
           if(tem.getNombre().equalsIgnoreCase(NomTema)){
               this.temas.remove(tem);
           }
       }
    }
    public void setPrivado(boolean EsPrivado){
        this.privado = EsPrivado;
        ParticularJpaController partJpa = new ParticularJpaController();
        try{
            partJpa.edit(this);
        } catch (NonexistentEntityException e) {
        } catch (Exception e) {}
    }
    
    public void setCliente (Cliente cli){
        this.cliente = cli;
    }
    public void addTema(Tema tem){
        this.temas.add(tem);
    }
}