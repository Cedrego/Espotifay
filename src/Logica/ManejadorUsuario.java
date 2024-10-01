/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.ArtistaJpaController;
import Persistencia.ClienteJpaController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Franco
 */
public class ManejadorUsuario {
    private List<Artista> artistasGen;
    private List<Cliente> clientesGen;
    private List<Cliente> seguidores;
    private List<Cliente> seguidos;
    
    private ClienteJpaController cliJpa = new ClienteJpaController();
    private ArtistaJpaController artJpa = new ArtistaJpaController();
    
    private static ManejadorUsuario instancia = null;
    
    //inicializo ambas listas 
    private ManejadorUsuario(){
        artistasGen = new ArrayList<>();
        clientesGen = new ArrayList<>();
        seguidores = new ArrayList<>();
        seguidos = new ArrayList<>();
        
        /*
        datos de prueba originales
        DTFecha fech = new DTFecha (1,1,1);
        Cliente cliente1 = new Cliente("cliente1","cliente1","cliente1","cliente1",fech);
        Cliente cliente2 = new Cliente("cliente2","cliente2","cliente2","cliente2",fech);
        Cliente cliente3 = new Cliente("cliente3","cliente3","cliente3","cliente3",fech);
        
        Artista artista1 = new Artista("artista1", "artista1", "artista1", "artista1", fech, "artista1", "artista1");
        Artista artista2 = new Artista("artista2", "artista2", "artista2", "artista2", fech, "artista2", "artista2");
        Artista artista3 = new Artista("artista3", "artista3", "artista3", "artista3", fech, "artista3", "artista3");
        
        this.clientesGen.add(cliente1);
        this.clientesGen.add(cliente2);
        this.clientesGen.add(cliente3);
        
        this.artistasGen.add(artista1);
        this.artistasGen.add(artista2);
        this.artistasGen.add(artista3);
        */
    }
    
    //creo una instancia si no existe una, de lo contrario devuelvo la existente (solo existe una)
    public static ManejadorUsuario getInstance(){
        if (instancia == null){
            instancia = new ManejadorUsuario();
        }
        return instancia;
    }
    
    //agrego un artista a la coleccion de artistas
    public void addArtista(Artista art){
        this.artistasGen.add(art);
    }
    
    //agrego un cliente a la coleccion de clientes
    public void addCliente(Cliente cli){
        this.clientesGen.add(cli);
    }
    
//agrego un cliente a la coleccion de clientes
    public void addSeguidor(Cliente cli, Cliente seg){
        this.seguidores.add(seg);
        this.seguidos.add(cli);
    }
    
    //busco un artista en la colección usando su nickname (creo)
    public Artista buscarArtista(String nick){
        if(artJpa.findArtista(nick)!=null){
            return artJpa.findArtista(nick);
        }
        return null;
    }
    
    //busco un cliente en la colección usando su nickname (creo)
    public Cliente buscarCliente(String nick){
        if(cliJpa.findCliente(nick)!=null){
            return cliJpa.findCliente(nick);
        }
        return null;
    }
    
    public List<Artista> getAllArtista(){
        return artJpa.findArtistaEntities(); //puede que tenga que devolver un array?
    }
    
    public List<Cliente> getAllCliente(){
        return cliJpa.findClienteEntities(); //puede que tenga que devolver un array?
    }
}
