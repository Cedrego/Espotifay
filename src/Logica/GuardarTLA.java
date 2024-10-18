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
public class GuardarTLA {
    Factory fabric =Factory.getInstance();
    ICtrl ctrl = fabric.getICtrl();
    public TemaJpaController temaJpaController = new TemaJpaController();
    public AlbumJpaController albumJpaController = new AlbumJpaController();
    public ParticularJpaController particularJpaController = new ParticularJpaController();
    public porDefectoJpaController porDefectoJpaController = new porDefectoJpaController();
    public ClienteJpaController clienteController = new ClienteJpaController();
    
    
    public GuardarTLA(String tipo, String objeto, String nickCliente, String duenioListaParticular){
        Cliente cli = clienteController.findCliente(nickCliente);
        
        if(tipo.equalsIgnoreCase("Tema")){
            Tema tem = ctrl.obtenerTema(objeto, duenioListaParticular);
            cli.addTemaFav(tem);
        }
        
        if(tipo.equalsIgnoreCase("Album")){
            Album alb = albumJpaController.findAlbum(objeto);
            cli.addAlbumFav(alb);
        }
        
        if(tipo.equalsIgnoreCase("Particular")){
            //EntityManager em = particularJpaController.getEntityManager();
            Particular part = particularJpaController.findParticular(objeto, duenioListaParticular);
            
            System.out.println("La lista se llama "+part.getNombre());
            System.out.println("El duenio es "+duenioListaParticular);
            System.out.println("El cliente al que le quiero agregar la lista es "+cli.getNickname());
            /*
            try{
                em.getTransaction().begin();

                part = em.merge(part);
                cli = em.merge(cli);

                em.createNativeQuery("INSERT INTO cliente_particular (Cliente_NICK, NOMBRE) VALUES (1, 2)")
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
            }*/
            cli.addParticularFav(part);
        }
        
        if(tipo.equalsIgnoreCase("Por Defecto")){
            porDefecto pd = porDefectoJpaController.findporDefecto(objeto);
            cli.addPDFav(pd);
        }
    }
}
