/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

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
                    Par.removerTema(NomTema);    
                    delete = true;
                }      
                if(delete == true){
                    break;
                }
            }
            
        } 
        if("Por Defecto".equals(Tipo)){
            //Agergo Tema a las lista de playlist particulares
            for(porDefecto Def : mp.getListPorDefecto()){
                if(Def.getNombre().equalsIgnoreCase(NomPlay)){//Encuentro la playlist por defecto
                    Def.removerTema(NomTema);
                    delete = true;
                }
                if(delete == true){
                    break;
                }
            }
        }
    }
    
}
