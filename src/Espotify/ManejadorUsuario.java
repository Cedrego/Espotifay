/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

import java.util.Map;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author Franco
 */
public class ManejadorUsuario {
    private Map<String, Artista> artistasGen;
    private Map<String, Cliente> clientesGen;
    
    private static ManejadorUsuario instancia = null;
    
    //inicializo ambas colecciones en formato de mapa para guardar junto con sus nicknames
    private ManejadorUsuario(){
        artistasGen = new HashMap<String, Artista>();
        clientesGen = new HashMap<String, Cliente>();
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
        String nickname = art.getNickname();
        artistasGen.put(nickname, art);
    }
    
    //agrego un cliente a la coleccion de clientes
    public void addCliente(Cliente cli){
        String nickname = cli.getNickname();
        clientesGen.put(nickname, cli);
    }
    
    //busco un artista en la colección usando su nickname (creo)
    public Artista buscarArtista(String nick){
        return ((Artista) artistasGen.get(nick));
    }
    
    //busco un cliente en la colección usando su nickname (creo)
    public Cliente buscarCliente(String nick){
        return ((Cliente) clientesGen.get(nick));
    }
}
