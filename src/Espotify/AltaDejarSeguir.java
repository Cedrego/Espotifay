/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;
//import Espotify.Usuario;
/**
 *
 * @author Camilo
 */
public class AltaDejarSeguir {
    private ICtrl ictrl;
            
    public AltaDejarSeguir(ICtrl ic, String usuario, String seguidor){
        ManejadorUsuario mu = ManejadorUsuario.getInstance();
        ictrl = ic;
        
        Cliente cli = mu.buscarCliente(usuario);
        Artista art = mu.buscarArtista(usuario);
        Cliente seg = mu.buscarCliente(seguidor);
        if(cli!=null){
            ictrl.dejarSeguidorC(cli, seg);
        }else{
            ictrl.dejarSeguidorA(art, seg);
        }
    }
}