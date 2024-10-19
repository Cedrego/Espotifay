/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.AlbumJpaController;
import Persistencia.ClienteJpaController;
import Persistencia.ParticularJpaController;
import Persistencia.TemaJpaController;
import Persistencia.porDefectoJpaController;
import javax.persistence.EntityManager;

/**
 *
 * @author Franco
 */
public class EliminarTLA {
    Factory fabric =Factory.getInstance();
    ICtrl ctrl = fabric.getICtrl();
    public TemaJpaController temaJpaController = new TemaJpaController();
    public AlbumJpaController albumJpaController = new AlbumJpaController();
    public ParticularJpaController particularJpaController = new ParticularJpaController();
    public porDefectoJpaController porDefectoJpaController = new porDefectoJpaController();
    public ClienteJpaController clienteController = new ClienteJpaController();
    
    public EliminarTLA(String tipo, String objeto, String nickCliente){
        Cliente cli = clienteController.findCliente(nickCliente);
        
        if(tipo.equalsIgnoreCase("Tema")){
            EntityManager em = temaJpaController.getEntityManager();
            String[] NombreTema=objeto.split("-");
            Tema tem = ctrl.obtenerTema(NombreTema[0], NombreTema[1]);
            
            try{
                em.getTransaction().begin();
                
                tem = em.merge(tem);
                cli = em.merge(cli);
                
                em.createNativeQuery("DELETE FROM cliente_tema WHERE Cliente_NICK = ? AND temasFAV_IDTEMA = ?")
                    .setParameter(1, cli.getNickname())
                    .setParameter(2, tem.getIdTema())
                    .executeUpdate();

                em.getTransaction().commit();
                em.refresh(tem);
                em.refresh(cli);
            }catch (Exception e) {
                if (em.getTransaction().isActive()) {
                    em.getTransaction().rollback();
                }
                e.printStackTrace();
            } finally {
                em.close();
            }
            //cli.removeTemaFav(tem);
        }
        
        if(tipo.equalsIgnoreCase("Album")){
            EntityManager em = albumJpaController.getEntityManager();
            Album alb = albumJpaController.findAlbum(objeto);
            
            try{
                em.getTransaction().begin();
                
                alb = em.merge(alb);
                cli = em.merge(cli);
                
                em.createNativeQuery("DELETE FROM cliente_album WHERE Cliente_NICK = ? AND albumFAV_NOMBRE = ?")
                    .setParameter(1, cli.getNickname())
                    .setParameter(2, alb.getNombre())
                    .executeUpdate();

                em.getTransaction().commit();
                em.refresh(alb);
                em.refresh(cli);
            }catch (Exception e) {
                if (em.getTransaction().isActive()) {
                    em.getTransaction().rollback();
                }
                e.printStackTrace();
            } finally {
                em.close();
            }
            //cli.removeAlbumFav(alb);
        }
        
        if(tipo.equalsIgnoreCase("Particular")){
            EntityManager em = particularJpaController.getEntityManager();
            Particular part = particularJpaController.findParticular(objeto, ctrl.obtenerDuenioPart(objeto));

            try{
                em.getTransaction().begin();

                part = em.merge(part);
                cli = em.merge(cli);

                em.createNativeQuery("DELETE FROM cliente_particular WHERE Cliente_NICK = ? AND NOMBRE = ?")
                    .setParameter(1, cli.getNickname())
                    .setParameter(2, part.getNombre())
                    .executeUpdate();

                em.getTransaction().commit();
                em.refresh(part);
                em.refresh(cli);
            }catch (Exception e) {
                if (em.getTransaction().isActive()) {
                    em.getTransaction().rollback();
                }
                e.printStackTrace();
            } finally {
                em.close();
            }
            //cli.removePlayPartFav(part);
        }   
            
        if(tipo.equalsIgnoreCase("Por Defecto")){
                EntityManager em = porDefectoJpaController.getEntityManager();
                porDefecto pd = porDefectoJpaController.findporDefecto(objeto);
                
                try{
                    em.getTransaction().begin();

                    pd = em.merge(pd);
                    cli = em.merge(cli);

                    em.createNativeQuery("DELETE FROM cliente_pordefecto WHERE Cliente_NICK = ? AND playFavPD_NOMBRE = ?")
                        .setParameter(1, cli.getNickname())
                        .setParameter(2, pd.getNombre())
                        .executeUpdate();

                    em.getTransaction().commit();
                    em.refresh(pd);
                    em.refresh(cli);
                }catch (Exception e) {
                    if (em.getTransaction().isActive()) {
                        em.getTransaction().rollback();
                    }
                    e.printStackTrace();
                } finally {
                    em.close();
                }
                //cli.removePlayPDFav(pd);
        }
    }
    
}

