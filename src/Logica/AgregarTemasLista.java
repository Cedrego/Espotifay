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
 * @author User
 */
public class AgregarTemasLista {
    Factory fabric =Factory.getInstance();
    ICtrl ctrl = fabric.getICtrl();
    public TemaJpaController temaJpaController = new TemaJpaController();
    public AlbumJpaController albumJpaController = new AlbumJpaController();
    public ParticularJpaController particularJpaController = new ParticularJpaController();
    public porDefectoJpaController porDefectoJpaController = new porDefectoJpaController();
    public ClienteJpaController clienteController = new ClienteJpaController();
    
    public AgregarTemasLista (String Tipo, String NomPlay, String NomTema, String nom ){
        
        String[] NombreTema=NomTema.split("-");
        Tema tema = ctrl.obtenerTema(NombreTema[0], NombreTema[1]);
        System.out.println("\n\n==========================================================================");
        System.out.println("El tema es: "+tema.getNombre()+" del album " + tema.getAlbum().getNombre());
        System.out.println("==========================================================================\n\n");
        
        
        if("Particular".equals(Tipo)){
           //Encuentro la playlist particular del cliente
            Particular Par = particularJpaController.findParticular(NomPlay, nom);
            Par.addTema(tema);
            
            try {
                particularJpaController.edit(Par); // Actualizar el cliente en la base de datos
            } catch (Exception e) {
                e.printStackTrace(); // Manejo de errores
            }      
        }
             
        if("Por Defecto".equals(Tipo)){
            porDefecto Def = porDefectoJpaController.findporDefecto(NomPlay);
            Def.addTema(tema);
            
            //Persistir los cambios

            try {
                porDefectoJpaController.edit(Def); // Actualizar el cliente en la base de datos
            } catch (Exception e) {
                e.printStackTrace(); // Manejo de errores
            }
        }
   
    }   
}
