/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.ClienteJpaController;
import Persistencia.porDefectoJpaController;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author User
 */
public class CrearLista {
     Factory fabric =Factory.getInstance();
    ICtrl ctrl = fabric.getICtrl();
    // Obtenemos el EntityManager desde la fábrica
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pantallaPU");
    EntityManager em = emf.createEntityManager();
    
    public CrearLista ( String name, String Tipo, String GOP, String Fecha){
        ManejadorPlaylist mp = ManejadorPlaylist.getInstance();
        ManejadorMusica mm = ManejadorMusica.getInstance(); //consigo instancia de manejador de playlist
        ManejadorUsuario mu = ManejadorUsuario.getInstance(); //consigo instancia de manejador de Usuario
        
        if("Particular".equals(Tipo)){
            // Buscar el cliente usando el nickname
            TypedQuery<Cliente> query = em.createQuery("SELECT c FROM Cliente c WHERE c.nickname = :nickname", Cliente.class);
            query.setParameter("nickname", GOP); // Establecemos el parámetro
            Cliente cliente = query.getSingleResult(); // Intentamos obtener un único cliente

            Particular nuevoPar = ctrl.CrearListParticular(name,cliente.getNickname(), Fecha);//Creo la instancia de playlist particular
            mp.addPartList(nuevoPar);//Agrego la instancia a la lista
            
             cliente.getParticular().add(nuevoPar); // Añadir la playlist particular al cliente
            //Persistir los cambios
            ClienteJpaController clienteJpaController = new ClienteJpaController();
            try {
                clienteJpaController.edit(cliente); // Actualizar el cliente en la base de datos
            } catch (Exception e) {
                e.printStackTrace(); // Manejo de errores
        }
            em.refresh(cliente); // Recargar el estado del cliente desde la base de datos
        }else{
            porDefecto nuevoPorDefecto = ctrl.CrearListPorDefecto(name, GOP);
 
        }
        
    }  
}