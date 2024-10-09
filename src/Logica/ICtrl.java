/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;


import java.util.List;

/**
 *
 * @author Franco
 */
public interface ICtrl {
    
    public abstract Album CrearAlbum (String nombreA, String artista, int anioA, List<Genero> generosA, List<Tema> temasA);
    public abstract Tema CrearTema(String nomT, String duraT, int ordT, String guardadoT, List<Genero> generosT);
    public abstract Genero crearGenero(String nomG, Genero padre);
    public abstract Cliente crearCliente(String nick, String nom, String ape, String mail, int dia, int mes, int anio);
    public abstract Artista crearArtista(String nick, String nom, String ape, String mail, int dia, int mes, int anio, String bio, String web);
    public abstract void agregarSeguidorC(Cliente cliente, Cliente seguidor);
    public abstract void agregarSeguidorA(Artista artista, Cliente seguidor);
    public abstract void dejarSeguidorC(Cliente usuario, Cliente seguidor);
    public abstract void dejarSeguidorA(Artista usuario, Cliente seguidor);
    public abstract void InfiniteVoid();
    public abstract Particular CrearListParticular(String nombre, String nomCliente);
    public abstract porDefecto CrearListPorDefecto(String nombre, String genero);
    public abstract void Publicar(String lista,String cli);
    
    public abstract List<String> obtenerNombresDeGeneros();
    public abstract List<String> obtenerNombresDeCliente();
    public abstract boolean ExisListPartEnCliente(String NomList, String NomCliente);
    public abstract boolean ExisListPorDefEnGenero(String NomList);
    public abstract List<String> obtenerNombresDeListPart(String NomCliente);
    public abstract List<String> obtenerNombresDeListPD( String NomGenero);
    public abstract List<String> obtenerNombresTemaParaPartADD(String NomList, String NomCliente);
    public abstract List<String> obtenerNombresTemaParaPDADD(String NomList, String NomGen);
    public abstract void AddTemaList(String Tipo, String NomPlay, String NomTema, String nom );
}
