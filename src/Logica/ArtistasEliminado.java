/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "artista_eliminados")
public class ArtistasEliminado implements Serializable {
    //Datos basicos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincremental
    private int IdEliminado;
    @Column (name="NICK")
    private String nickname;
    @Column (name="NOMBRE")
    private String nombre;
    @Column (name="APELLIDO")
    private String apellido;
    @Column (name="MAIL")
    private String correo;
    @JoinColumn (name="FECNAC")
    private DTFecha fecha;
    
    @Column (name="ALBUMES")
    private String albumes;//List<Album> albumes;
    @Column (name="TEMAS")
    private String temas;//List<Tema> temas;
    
    //Fecha de Eliminacion hare que sea tipo dd/mm/aaaa
    @Column (name="FECHELIMINADO")
    private String Eliminado;

    //Estos datos no me parecieron como basicos
    /*@Column
    private String picture;*/
     /*@Column (name="CONTRASENIA")
    private String password;
    //Datos basicos x2
    @Column (name="SITIO_WEB")
    private String SitioWeb;
    @Column (name="BIOGRAFIA", length = 3000)
    private String Biografia;*/
    public ArtistasEliminado() {
    }
    public ArtistasEliminado (String nick, String nom, String ape, String mail, DTFecha fech, String Alb, String Tem, String Eliminad){
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

    public void setIdEliminado(int IdEliminado) {
        this.IdEliminado = IdEliminado;
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

    public int getIdEliminado() {
        return IdEliminado;
    }

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
