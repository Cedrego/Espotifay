/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Presentacion;

import Logica.DTFecha;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camilo
 */
public class DataArtistaAlt  {
    private String nickname;
    private String nombre;
    private String apellido;
    private String correo;
    private DTFecha fecha;
    private String picture;
    private String SitioWeb;
    private String Biografia;  
    private List<DataAlbum> Dataalbumes;
    private List<String> DataseguidoPorA;
    
    public DataArtistaAlt() {
    }

    public DataArtistaAlt(String nick, String nom, String ape, String mail, DTFecha fech, String bio, String webSite, List<DataAlbum> DataAlb, List<String> DataCli,String pic) {
        this.nickname = nick;
        this.nombre = nom;
        this.apellido = ape;
        this.correo = mail;
        this.fecha = fech;
        this.SitioWeb = webSite;
        this.Biografia = bio;
        this.Dataalbumes = DataAlb; 
        this.DataseguidoPorA = DataCli; 
        this.picture = pic;
    }
    public DataArtistaAlt(String nick, String nom, String ape, String mail, DTFecha fech, String bio, String webSite){
        this.nickname = nick;
        this.nombre = nom;
        this.apellido = ape;
        this.correo = mail;
        this.fecha = fech;
        this.SitioWeb = webSite;
        this.Biografia = bio;
        this.Dataalbumes = new ArrayList();
        this.DataseguidoPorA = new ArrayList();
        this.picture = null;
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

    public void setSitioWeb(String SitioWeb) {
        this.SitioWeb = SitioWeb;
    }

    public void setBiografia(String Biografia) {
        this.Biografia = Biografia;
    }

    public void setDataalbumes(List<DataAlbum> Dataalbumes) {
        this.Dataalbumes = Dataalbumes;
    }

    public void setDataseguidoPorA(List<String> DataseguidoPorA) {
        this.DataseguidoPorA = DataseguidoPorA;
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

    public String getSitioWeb() {
        return SitioWeb;
    }

    public String getBiografia() {
        return Biografia;
    }

    public List<DataAlbum> getDataalbumes() {
        return Dataalbumes;
    }

    public List<String> getDataseguidoPorA() {
        return DataseguidoPorA;
    }

    public String getPicture() {
        return picture;
    }

}
