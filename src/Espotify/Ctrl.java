/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

import Persistencia.AlbumJpaController;
import Persistencia.ClienteJpaController;
import Persistencia.ArtistaJpaController;
import Persistencia.GeneroJpaController;
import Persistencia.ParticularJpaController;
import Persistencia.TemaJpaController;
import Persistencia.exceptions.NonexistentEntityException;
import Persistencia.porDefectoJpaController;
import java.util.List;

/**
 *
 * @author Franco
 */
public class Ctrl implements ICtrl{

    public GeneroJpaController generoJpaController = new GeneroJpaController();
    public TemaJpaController temaJpaController = new TemaJpaController();
    public AlbumJpaController albumJpaController = new AlbumJpaController();
    public ParticularJpaController particularJpaController = new ParticularJpaController();
    public porDefectoJpaController porDefectoJpaController = new porDefectoJpaController();
    public Ctrl(){}
    
    
    
    //crear un objeto de tipo album
    @Override
    public Album CrearAlbum (String nombreA, String artista, int anioA, List<Genero> generosA, List<Tema> temasA){
        
        Album albumNuevo = new Album(nombreA, artista ,anioA); //creo un album, ya inicializa las listas de genero y temas

        for (Genero genero : generosA){
            albumNuevo.addGenero(genero);
        }

        for (Tema tema : temasA){
            albumNuevo.addTemas(tema);
            //persistimos temas
            try {
                temaJpaController.create(tema);
            } catch (Exception e) {
                System.out.println("Error al crear el genero: " + e.getMessage());
            }
        }
        
        //persistimos albumes
        try {
            albumJpaController.create(albumNuevo);
        } catch (Exception e) {
            System.out.println("Error al guardar el album: " + e.getMessage());
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

        // Verificar que efectivamente el seguidor sigue al usuario
        if (seguidor.getCliSigueA().contains(usuario)) {
            try {
                // Mensajes de depuración para verificar el tamaño de las listas
                System.out.println("Antes de eliminar: " + usuario.getSeguidoPor().size() + " seguidores.");
                System.out.println("Antes de eliminar: " + seguidor.getCliSigueA().size() + " usuarios seguidos.");

                // Eliminar el seguidor de ambas listas
                usuario.getSeguidoPor().remove(seguidor);
                seguidor.getCliSigueA().remove(usuario);

                // Mensajes de depuración después de la eliminación
                System.out.println("Después de eliminar: " + usuario.getSeguidoPor().size() + " seguidores.");
                System.out.println("Después de eliminar: " + seguidor.getCliSigueA().size() + " usuarios seguidos.");

                // Persistir los cambios en la base de datos
                cliJpa.edit(seguidor);
                cliJpa.edit(usuario);

                System.out.println("ahora, "+seguidor.getNickname()+ " ya no sigue a " +usuario.getNickname());

            } catch (NonexistentEntityException e) {
                System.out.println("Error: El usuario o el seguidor no existen.");
            } catch (Exception e) {
                System.out.println("Error general: " + e.getMessage());
            }
        } else {
            // Si el seguidor no estaba siguiendo al usuario, mostrar mensaje adecuado
            System.out.println("No puedes dejar de seguir a alguien que no sigues.");
        }
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
    public Particular CrearListParticular(String nombre, String nomCliente){
        ManejadorUsuario mu = ManejadorUsuario.getInstance();
        Cliente cli = mu.buscarCliente(nomCliente);
        Particular nuevoParticular = new Particular(nombre, cli);
        
        try {
            particularJpaController.create(nuevoParticular);
        } catch (Exception e) {
            System.out.println("Error al guardar la lista particular: " + e.getMessage());
        }
        
        return nuevoParticular;
    }
    @Override
    public porDefecto CrearListPorDefecto(String nombre, String genero){
        
        ManejadorMusica mm = ManejadorMusica.getInstance();
        Genero Gen = mm.buscarGenero(nombre);//Busco la instancia de genero
        porDefecto nuevoPorDefecto = new porDefecto(nombre,Gen);//Uso el constructor de pordefcto
        
        try {
            porDefectoJpaController.create(nuevoPorDefecto);
        } catch (Exception e) {
            System.out.println("Error al guardar la lista por defecto: " + e.getMessage());
        }
        return nuevoPorDefecto;
    }
    @Override
    public void InfiniteVoid(){
        
    }
}
