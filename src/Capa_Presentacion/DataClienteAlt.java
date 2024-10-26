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
public class DataClienteAlt{

    private String nickname;
    private String nombre;
    private String apellido;
    private String correo;
    private DTFecha fecha;
    private List<DataParticular> DataPart; //coleccion
    private List<String> DataCliSeguido;
    private List<String> DataCliSeguidor;
    private List<String> DataArtSeguido;
    private List<DataAlbum> DataAlmFav; //coleccion
    private List<DataTema> DataTemaFav; //coleccion
    private List<DataPorDefecto> DataPorDefFav; //coleccion
    private List<DataParticular> DataPartFav; //coleccion
    private List<DataSuscripcion> DataSuscripcion; //coleccion
    
    public DataClienteAlt() {
    }

    public DataClienteAlt(String nick, String nom, String ape, String mail, DTFecha fech,List<DataParticular> DataP, List<String> DataCliSeguido,List<String> DataCliSeguidor, List<String> DataArtSeguido,List<DataAlbum> DataAlbFav, List<DataTema> DataTemaFav,List<DataPorDefecto> DataPorDefFav, List<DataParticular> DataPartFav, List<DataSuscripcion> DataSus) {
        this.nickname = nick;
        this.nombre = nom;
        this.apellido = ape;
        this.correo = mail;
        this.fecha = fech;
        this.DataPart = DataP;
        this.DataCliSeguido = DataCliSeguido;
        this.DataCliSeguidor = DataCliSeguidor;
        this.DataArtSeguido = DataArtSeguido;
        this.DataAlmFav = DataAlbFav;
        this.DataTemaFav = DataTemaFav;
        this.DataPorDefFav = DataPorDefFav;
        this.DataPartFav = DataPartFav;
        this.DataSuscripcion = DataSus;
    }
    public DataClienteAlt(String nick, String nom, String ape, String mail, DTFecha fech) {
        this.nickname = nick;
        this.nombre = nom;
        this.apellido = ape;
        this.correo = mail;
        this.fecha = fech;
        this.DataPart = new ArrayList();
        this.DataArtSeguido = new ArrayList();
        this.DataCliSeguidor = new ArrayList();
        this.DataArtSeguido = new ArrayList();
        this.DataAlmFav = new ArrayList();
        this.DataTemaFav = new ArrayList();
        this.DataPorDefFav = new ArrayList();
        this.DataPartFav = new ArrayList();
        this.DataSuscripcion = new ArrayList();
    }
    //setters

    public void setDataPart(List<DataParticular> DataPart) {
        this.DataPart = DataPart;
    }

    public void setDataCliSeguido(List<String> DataCliSeguido) {
        this.DataCliSeguido = DataCliSeguido;
    }

    public void setDataCliSeguidor(List<String> DataCliSeguidor) {
        this.DataCliSeguidor = DataCliSeguidor;
    }

    public void setDataArtSeguido(List<String> DataArtSeguido) {
        this.DataArtSeguido = DataArtSeguido;
    }

    public void setDataAlmFav(List<DataAlbum> DataAlmFav) {
        this.DataAlmFav = DataAlmFav;
    }

    public void setDataPorDefFav(List<DataPorDefecto> DataPorDefFav) {
        this.DataPorDefFav = DataPorDefFav;
    }

    public void setDataPartFav(List<DataParticular> DataPartFav) {
        this.DataPartFav = DataPartFav;
    }

    public void setDataSuscripcion(List<DataSuscripcion> DataSuscripcion) {
        this.DataSuscripcion = DataSuscripcion;
    }
    
    public String getNickname(){
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

    public List<DataParticular> getDataPart() {
        return DataPart;
    }

    public List<String> getDataCliSeguido() {
        return DataCliSeguido;
    }

    public List<String> getDataCliSeguidor() {
        return DataCliSeguidor;
    }

    public List<String> getDataArtSeguido() {
        return DataArtSeguido;
    }

    public List<DataAlbum> getDataAlmFav() {
        return DataAlmFav;
    }

    public List<DataTema> getDataTemaFav() {
        return DataTemaFav;
    }

    public List<DataPorDefecto> getDataPorDefFav() {
        return DataPorDefFav;
    }

    //getters
    public List<DataParticular> getDataPartFav() {    
        return DataPartFav;
    }

    public List<DataSuscripcion> getDataSuscripcion() {
        return DataSuscripcion;
    }
    
}