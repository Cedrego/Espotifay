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
public class AltaSeguirUsuario {
    private ICtrl ictrl;
            
    public AltaSeguirUsuario(ICtrl ic, String usuario, String seguidor){
        ManejadorUsuario mu = ManejadorUsuario.getInstance();
        ictrl = ic;
        
        Cliente cli = mu.buscarCliente(usuario);
        Cliente seg = mu.buscarCliente(seguidor);
        ic.agregarSeguidor(cli, seg);
    }
}