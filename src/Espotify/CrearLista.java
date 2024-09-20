/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

import Persistencia.ClienteJpaController;
import Persistencia.porDefectoJpaController;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            // Paso 4: Persistir los cambios
            ClienteJpaController clienteJpaController = new ClienteJpaController();
            try {
                clienteJpaController.edit(cliente); // Actualizar el cliente en la base de datos
            } catch (Exception e) {
                e.printStackTrace(); // Manejo de errores
}
        }else{
            porDefecto nuevoPorDefecto = ictrl.CrearListPorDefecto(name, GOP);
            
            porDefectoJpaController PorDefectoJPAController = new porDefectoJpaController();
            
            try {
                PorDefectoJPAController.create(nuevoPorDefecto);
            } catch (Exception ex) {
                Logger.getLogger(CrearLista.class.getName()).log(Level.SEVERE, null, ex);
            }
            Genero genero = mm.buscarGenero(GOP); // Busca el género
            if (genero != null) {
                nuevoPorDefecto.setGenero(genero); // Asigna el género
                // Necesitas buscar nuevamente el porDefecto para actualizarlo
                try {
                    porDefecto existente = PorDefectoJPAController.findporDefecto(nuevoPorDefecto.getNombre());
                    if (existente != null) {
                        existente.setGenero(genero); // Actualiza el género
                        PorDefectoJPAController.edit(existente); // Actualiza en la base de datos
                    }
                } catch (Exception ex) {
                    Logger.getLogger(CrearLista.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
           // mp.addPorDefecto(nuevoPorDefecto);//Agrego la instancia a la lista
        }
        
    }  
}