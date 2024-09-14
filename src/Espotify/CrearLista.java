/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

import java.util.List;

/**
 *
 * @author User
 */
public class CrearLista {
     private ICtrl ictrl;
    
    public CrearLista (ICtrl ic, String name, String Tipo, String GOP){
        ManejadorPlaylist mp = ManejadorPlaylist.getInstance();
        ManejadorMusica mm = ManejadorMusica.getInstance(); //consigo instancia de manejador de playlist
        ManejadorUsuario mu = ManejadorUsuario.getInstance(); //consigo instancia de manejador de Usuario
        ictrl = ic; 
        
        if("Particular".equals(Tipo)){
            Particular nuevoPar = ictrl.CrearListParticular(name);//Creo la instancia de playlist particular
            mp.addPartList(nuevoPar);//Agrego la instancia a la lista
            // Buscar el cliente usando el nickname
            Cliente cliente = mu.buscarCliente(GOP);//Busco la instancia de cliente
            cliente.getParticular().add(nuevoPar); // Añadir la playlist particular al cliente
            
        }else{
            porDefecto nuevoPorDefecto = ictrl.CrearListPorDefecto(name, GOP);
            mp.addPorDefecto(nuevoPorDefecto);//Agrego la instancia a la lista
        }
        
    }  
}
