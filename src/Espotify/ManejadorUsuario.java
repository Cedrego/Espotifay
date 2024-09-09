/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Franco
 */
public class ManejadorUsuario {
    private List<Artista> artistasGen;
    private List<Cliente> clientesGen;
    
    private static ManejadorUsuario instancia = null;
    
    //inicializo ambas listas 
    private ManejadorUsuario(){
        artistasGen = new ArrayList<>();
        clientesGen = new ArrayList<>();
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
    
    //busco un artista en la colección usando su nickname (creo)
    public Artista buscarArtista(String nick){
        for (Artista art : this.artistasGen){
            if(art.getNickname().equalsIgnoreCase(nick)){
                return art;
            }
        }
        return null;
    }
    
    //busco un cliente en la colección usando su nickname (creo)
    public Cliente buscarCliente(String nick){
        for (Cliente cli : this.clientesGen){
                if(cli.getNickname().equalsIgnoreCase(nick)){
                    return cli;
                }
            }
        return null;
    }
    
    public List<Artista> getAllArtista(){
        if(artistasGen.isEmpty()){
            return null;
        } else{
            return artistasGen; //puede que tenga que devolver un array?
        }
    }
    
    public List<Cliente> getAllCliente(){
        if(clientesGen.isEmpty()){
            System.out.print("lista vacia");
            return null;
        } else{
            System.out.print("lista llena");
            return clientesGen; //puede que tenga que devolver un array?
        }
    }
}
