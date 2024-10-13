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
    
    
    public GuardarTLA(String tipo, String fav, String nickCliente){
        Cliente cli = clienteController.findCliente(nickCliente);
        
        if(tipo.equalsIgnoreCase("Tema")){
            Tema tem = temaJpaController.findTema(fav);
            cli.addTemaFav(tem);
        }
        
        if(tipo.equalsIgnoreCase("Album")){
            Album alb = albumJpaController.findAlbum(fav);
            cli.addAlbumFav(alb);
        }
        
        if(tipo.equalsIgnoreCase("Particular")){
            Particular part = particularJpaController.findParticular(fav, ctrl.obtenerDuenioPart(fav));
            cli.addParticularFav(part);
        }
        
        if(tipo.equalsIgnoreCase("Por Defecto")){
            porDefecto pd = porDefectoJpaController.findporDefecto(fav);
            cli.addPDFav(pd);
        }
    }
}
