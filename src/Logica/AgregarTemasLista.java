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
        ManejadorPlaylist mp = ManejadorPlaylist.getInstance();
        ManejadorMusica mm = ManejadorMusica.getInstance(); //consigo instancia de manejador de playlist
        ManejadorUsuario mu = ManejadorUsuario.getInstance(); //consigo instancia de manejador de Usuario
        
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
            //Agergo Tema a las lista de playlist particulares
            for(porDefecto Def : mp.getListPorDefecto()){
                if(Def.getNombre().equalsIgnoreCase(NomPlay)){//Encuentro la playlist por defecto
                    
                     for(Album alb : mm.getAlbumes()){//lista de albunes
                        for (Tema tem : alb.getTemas()){//Los temas se almacenanan en albunes
                            if(tem.getNombre().equalsIgnoreCase(NomTema)){
                                Def.addTema(tem);
                                //Persistir los cambios
                                porDefectoJpaController porDefectoJpaController = new porDefectoJpaController();
                                try {
                                    porDefectoJpaController.edit(Def); // Actualizar el cliente en la base de datos
                                } catch (Exception e) {
                                    e.printStackTrace(); // Manejo de errores
                                }
                                break;
                            }
                        }
                    }
                }
                
            }
        }
    }   
}
