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
        Cliente seg = mu.buscarCliente(seguidor);
        ic.dejarSeguidor(cli, seg);
    }
}