/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;


import Persistencia.ParticularJpaController;
import Persistencia.porDefectoJpaController;

/**
 *
 * @author User
 */
public class AgregarTemasLista {
 
    
    public AgregarTemasLista (String Tipo, String NomPlay, String NomTema, String nom ){
        ManejadorPlaylist mp = ManejadorPlaylist.getInstance();
        ManejadorMusica mm = ManejadorMusica.getInstance(); //consigo instancia de manejador de playlist
        ManejadorUsuario mu = ManejadorUsuario.getInstance(); //consigo instancia de manejador de Usuario
        boolean insertado = false;//para que no siga recorriendo los for
        if("Particular".equals(Tipo)){
            //Agrego tema a la lista del cliente
            Cliente cliente = mu.buscarCliente(nom); //nom es el nombre del cliente
            //Busco la playlist en su lista
            for(Particular Par : cliente.getParticular()){
                if(Par.getNombre().equalsIgnoreCase(NomPlay)){//Encuentro la playlist particular del cliente
                    
                    for(Album alb : mm.getAlbumes()){//lista de albunes
                        for (Tema tem : alb.getTemas()){//Los temas se almacenanan en albunes
                            if(tem.getNombre().equalsIgnoreCase(NomTema)){
                                Par.addTema(tem);
                                //Persistir los cambios
                                ParticularJpaController particularJpaController = new ParticularJpaController();
                                try {
                                    particularJpaController.edit(Par); // Actualizar el cliente en la base de datos
                                } catch (Exception e) {
                                    e.printStackTrace(); // Manejo de errores
                                } 
                                break;
                            }
                        }
                        if(insertado == true){
                            break;
                        }
                    }
                     
                }
                if(insertado == true){
                    break;
                }
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
                        if(insertado == true){
                            break;
                        }
                    }
                }
                if(insertado == true){
                    break;
                }
            }
        }
    }   
}
