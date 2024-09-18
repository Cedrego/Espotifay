/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

import Persistencia.ClienteJpaController;
import Persistencia.ArtistaJpaController;
import Persistencia.GeneroJpaController;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;

/**
 *
 * @author Franco
 */
public class Ctrl implements ICtrl{

    public GeneroJpaController generoJpaController = new GeneroJpaController();
    
    public Ctrl(){}
    
    
    
    //crear un objeto de tipo album
    @Override
    public Album CrearAlbum (String nombreA, int anioA, List<Genero> generosA, List<Tema> temasA){
        
        Album albumNuevo = new Album(nombreA,anioA); //creo un album, ya inicializa las listas de genero y temas

        for (Genero genero : generosA){
            albumNuevo.addGenero(genero);
        }

        for (Tema tema : temasA){
            albumNuevo.addTemas(tema);
        }
        return albumNuevo;
    };
    
    @Override
    public Tema CrearTema (String nomT, String duraT, int ordT, List<Genero> generosT){
        Tema temaNuevo = new Tema(nomT, duraT, ordT);
        
        for (Genero gen : generosT){
            temaNuevo.addGenero(gen);
        }
        return temaNuevo;
    }
    
    @Override
    public Genero crearGenero(String nomG, Genero padre){
        Genero generoNuevo = new Genero(nomG);
        
        if(padre!=null){
            generoNuevo.setPadre(padre);
        }else{
            generoNuevo.setPadre(generoJpaController.findGenero("Genero"));
        }
        
        try {
            generoJpaController.create(generoNuevo);
        } catch (Exception e) {
            System.out.println("Error al crear el genero: " + e.getMessage());
        }
        
        return generoNuevo;
    }
    
    @Override
    public Artista crearArtista(String nick, String nom, String ape, String mail, int dia, int mes, int anio, String bio, String web){
        
        DTFecha dtfecha = new DTFecha(dia, mes, anio);
        
        Artista nuevoArtista = new Artista(nick, nom, ape, mail, dtfecha, bio, web);
        
        ArtistaJpaController artistaJpaController = new ArtistaJpaController();
        
        try {
            artistaJpaController.create(nuevoArtista);
        } catch (Exception e) {
            System.out.println("Error al guardar el cliente: " + e.getMessage());
        }
        
        return nuevoArtista;
    }
    
    @Override
    public Cliente crearCliente(String nick, String nom, String ape, String mail, int dia, int mes, int anio){
        DTFecha dtfecha = new DTFecha(dia, mes, anio);
        
        Cliente nuevoCliente = new Cliente(nick, nom, ape, mail, dtfecha);
        
        ClienteJpaController clienteJpaController = new ClienteJpaController();
        
        try {
            // Intentar persistir el nuevo cliente en la base de datos
            clienteJpaController.create(nuevoCliente);
            System.out.println("Cliente guardado exitosamente en la base de datos");
        } catch (Exception e) {
            System.out.println("Error al guardar el cliente: " + e.getMessage());
            // Manejar la excepción si ocurre algún error durante la creación
        }
        return nuevoCliente;
    }
    
   
    @Override
    public void agregarSeguidorC(Cliente cliente, Cliente seguidor) {
        if(!seguidor.getCliSigueA().contains(cliente)){
            ClienteJpaController cliJpa = new ClienteJpaController();
            seguidor.getCliSigueA().add(cliente);
            cliente.getSeguidoPor().add(seguidor);
            try {
            cliJpa.edit(seguidor);
            cliJpa.edit(cliente);
            } catch (NonexistentEntityException e) {
            } catch (Exception e) {}
            System.out.println("ahora, "+seguidor.getNickname()+ " sigue a " +cliente.getNickname());
        } else {
            System.out.println(seguidor.getNickname() + " ya sigue a " + cliente.getNickname());
        }
    }
    @Override
    public void agregarSeguidorA(Artista artista, Cliente seguidor) {
        if (!seguidor.getArtSigueA().contains(artista)){
            ClienteJpaController cliJpa = new ClienteJpaController();
            ArtistaJpaController artJpa = new ArtistaJpaController();
            seguidor.getArtSigueA().add(artista);
            artista.getSeguidoPorA().add(seguidor);
            try {
            cliJpa.edit(seguidor);
            artJpa.edit(artista);
            } catch (NonexistentEntityException e) {
            } catch (Exception e) {}
            System.out.println("ahora, "+seguidor.getNickname()+ " sigue a " +artista.getNickname());
        } else {
            System.out.println(seguidor.getNickname() + " ya sigue a " + artista.getNickname());
        }
    }

    @Override
    public void dejarSeguidorC(Cliente usuario, Cliente seguidor) {
        ClienteJpaController cliJpa = new ClienteJpaController();
        try {
            System.out.println("Antes de eliminar: " + usuario.getSeguidoPor().size() + " seguidores.");
            usuario.getSeguidoPor().remove(seguidor);
            seguidor.getCliSigueA().remove(usuario);
            System.out.println("Después de eliminar: " + usuario.getSeguidoPor().size() + " seguidores.");

            cliJpa.edit(seguidor);
            cliJpa.edit(usuario);
        } catch (NonexistentEntityException e) {
        } catch (Exception e) {}
        System.out.println("ahora, "+seguidor.getNickname()+ " ya no sigue a " +usuario.getNickname());
    }

    @Override
    public void dejarSeguidorA(Artista usuario, Cliente seguidor) {
        if(seguidor.getArtSigueA().contains(usuario)){
            ClienteJpaController cliJpa = new ClienteJpaController();
            ArtistaJpaController artJpa = new ArtistaJpaController();
            usuario.getSeguidoPorA().remove(seguidor);
            seguidor.getArtSigueA().remove(usuario);
            try {
            cliJpa.edit(seguidor);
            artJpa.edit(usuario);
            } catch (NonexistentEntityException e) {
            } catch (Exception e) {}
            System.out.println("ahora, "+seguidor.getNickname()+ " ya no sigue a " +usuario.getNickname());
        } else {
            System.out.println("no puedes dejar de seguir a alguen que no sigues");
        }
    }
    
    @Override
    public Particular CrearListParticular(String nombre){
        Particular nuevoParticular = new Particular(nombre);
        return nuevoParticular;
    }
    @Override
    public porDefecto CrearListPorDefecto(String nombre, String genero){
        
        ManejadorMusica mm = ManejadorMusica.getInstance();
        Genero Gen = mm.buscarGenero(nombre);//Busco la instancia de genero
        porDefecto nuevoPorDefecto = new porDefecto(nombre,Gen);//Uso el constructor de pordefcto
        return nuevoPorDefecto;
    }
    @Override
    public void InfiniteVoid(){
        
    }
}
