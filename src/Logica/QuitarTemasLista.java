/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.ParticularJpaController;
import Persistencia.TemaJpaController;
import Persistencia.porDefectoJpaController;
import javax.persistence.EntityManager;

/**
 *
 * @author User
 */
public class QuitarTemasLista {
    Factory fabric =Factory.getInstance();
    ICtrl ctrl = fabric.getICtrl();
    
    public QuitarTemasLista (String Tipo, String NomPlay, String NomTema, String nom ){
        ManejadorPlaylist mp = ManejadorPlaylist.getInstance();
        ManejadorMusica mm = ManejadorMusica.getInstance(); //consigo instancia de manejador de playlist
        ManejadorUsuario mu = ManejadorUsuario.getInstance(); //consigo instancia de manejador de Usuario
        boolean delete = false;//para que no siga recorriendo los for
        String[] NombreTema=NomTema.split("-");
        Tema tema = ctrl.obtenerTema(NombreTema[0], NombreTema[1]);
        
        if("Particular".equals(Tipo)){
            //Agrego tema a la lista del cliente
            Cliente cliente = mu.buscarCliente(nom); //nom es el nombre del cliente
            //Busco la playlist en su lista
            for(Particular Par : cliente.getParticular()){
                if(Par.getNombre().equalsIgnoreCase(NomPlay)){//Encuentro la playlist particular del cliente
                    ParticularJpaController particularJpaController = new ParticularJpaController();
                    EntityManager em = particularJpaController.getEntityManager();
                    
                    try {
                        em = particularJpaController.getEntityManager();
                        em.getTransaction().begin();

                        // Asegúrate de que ambos clientes están gestionados
                        tema = em.merge(tema);
                        Par = em.merge(Par);
                        cliente = em.merge(cliente);

                        // Inserta en la tabla de unión
                        em.createNativeQuery("DELETE FROM particular_tema WHERE NOMBRE = ? AND CLIENTE_NICK = ? AND temas_IDTEMA = ?")
                                .setParameter(1, Par.getNombre())
                                .setParameter(2, cliente.getNickname())
                                .setParameter(3, ctrl.obtenerIdTema(tema.getNombre(),tema.getAlbum().getNombre()))
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
                    EntityManager em = porDefJpa.getEntityManager();
                    
                    try {
                        em = porDefJpa.getEntityManager();
                        em.getTransaction().begin();

                        // Asegúrate de que ambos clientes están gestionados
                        tema = em.merge(tema);
                        Def = em.merge(Def);

                        // Inserta en la tabla de unión
                        em.createNativeQuery("DELETE FROM pordefecto_tema WHERE porDefecto_NOMBRE = ? AND temas_IDTEMA = ?")
                                .setParameter(1, Def.getNombre())
                                .setParameter(2, tema.getIdTema())
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
