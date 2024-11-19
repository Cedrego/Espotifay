/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Presentacion;

import Logica.DTFecha;


/**
 *
 * @author franb
 */
public class DataArtistaEliminado {
    //Datos basico
    private String nickname;

    private String nombre;

    private String apellido;

    private String correo;

    private DTFecha fecha;

    private String albumes;//List<Album> albumes;
    private String temas;//List<Tema> temas;
    
    //Fecha de Eliminacion hare que sea tipo dd/mm/aaaa
    private String Eliminado;
    
    public DataArtistaEliminado(){}
    public DataArtistaEliminado(String nick, String nom, String ape, String mail, DTFecha fech, String Alb, String Tem, String Eliminad){
        this.nickname =nick;
        this.nombre = nom;
        this.apellido = ape;
        this.correo = mail;
        this.fecha = fech;
        this.albumes = Alb;
        this.temas = Tem;
        this.Eliminado = Eliminad;
    }
    //Setters

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setFecha(DTFecha fecha) {
        this.fecha = fecha;
    }

    public void setAlbumes(String albumes) {
        this.albumes = albumes;
    }

    public void setTemas(String temas) {
        this.temas = temas;
    }

    public void setEliminado(String Eliminado) {
        this.Eliminado = Eliminado;
    }
     
     //Getters
    public String getNickname() {
        return nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public DTFecha getFecha() {
        return fecha;
    }

    public String getAlbumes() {
        return albumes;
    }

    public String getTemas() {
        return temas;
    }

    public String getEliminado() {
        return Eliminado;
    }
     
     
}
