/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

import Persistencia.ArtistaJpaController;
import Persistencia.ClienteJpaController;
import Persistencia.ParticularJpaController;
import Persistencia.TemaJpaController;
import Persistencia.porDefectoJpaController;
import javax.persistence.EntityManager;

/**
 *
 * @author User
 */
public class QuitarTemasLista {
    
    public QuitarTemasLista (String Tipo, String NomPlay, String NomTema, String nom ){
        ManejadorPlaylist mp = ManejadorPlaylist.getInstance();
        ManejadorMusica mm = ManejadorMusica.getInstance(); //consigo instancia de manejador de playlist
        ManejadorUsuario mu = ManejadorUsuario.getInstance(); //consigo instancia de manejador de Usuario
        boolean delete = false;//para que no siga recorriendo los for
        if("Particular".equals(Tipo)){
            //Agrego tema a la lista del cliente
            Cliente cliente = mu.buscarCliente(nom); //nom es el nombre del cliente
            //Busco la playlist en su lista
            for(Particular Par : cliente.getParticular()){
                if(Par.getNombre().equalsIgnoreCase(NomPlay)){//Encuentro la playlist particular del cliente
                    ParticularJpaController particularJpaController = new ParticularJpaController();
                    TemaJpaController temJpa = new TemaJpaController();
                    EntityManager em = particularJpaController.getEntityManager();
                    Tema tema = temJpa.findTema(NomTema);
                    try {
                        em = particularJpaController.getEntityManager();
                        em.getTransaction().begin();

                        // Asegúrate de que ambos clientes están gestionados
                        tema = em.merge(tema);
                        Par = em.merge(Par);
                        cliente = em.merge(cliente);

                        // Inserta en la tabla de unión
                        em.createNativeQuery("DELETE FROM particular_tema WHERE NOMBRE = ? AND temas_NOMBRE = ? AND CLIENTE_NICK = ?")
                                .setParameter(1, Par.getNombre())
                                .setParameter(2, tema.getNombre())
                                .setParameter(3, cliente.getNickname())
                                .executeUpdate();

                        em.getTransaction().commit();
                        em.refresh(tema);
                        em.refresh(Par);
                        delete = true; // Marcamos que se eliminó el tema
                    } catch (Exception e) {
                        if (em.getTransaction().isActive()) {
                            em.getTransaction().rollback();
                        }
                        e.printStackTrace();
                    } finally {
                        em.close();
                    }
                    delete = true;
                    
                }      
                if(delete == true){
                    break;
                }
            }
            
        } 
        else{
            //Agergo Tema a las lista de playlist particulares
            for(porDefecto Def : mp.getListPorDefecto()){
                if(Def.getNombre().equalsIgnoreCase(NomPlay)){//Encuentro la playlist por defecto
                    porDefectoJpaController porDefJpa = new porDefectoJpaController();
                    TemaJpaController temJpa = new TemaJpaController();
                    EntityManager em = porDefJpa.getEntityManager();
                    Tema tema = temJpa.findTema(NomTema);
                    try {
                        em = porDefJpa.getEntityManager();
                        em.getTransaction().begin();

                        // Asegúrate de que ambos clientes están gestionados
                        tema = em.merge(tema);
                        Def = em.merge(Def);

                        // Inserta en la tabla de unión
                        em.createNativeQuery("DELETE FROM pordefecto_tema WHERE porDefecto_NOMBRE = ? AND temas_NOMBRE = ?")
                                .setParameter(1, Def.getNombre())
                                .setParameter(2, tema.getNombre())
                                .executeUpdate();

                        em.getTransaction().commit();
                        em.refresh(tema);
                        em.refresh(Def);
                        delete = true; // Marcamos que se eliminó el tema
                    } catch (Exception e) {
                        System.out.println("Error al actualizar la playlist: " + e.getMessage());
                    }
                    delete = true;
                }
                if(delete == true){
                    break;
                }
            }
        }
    }
    
}
