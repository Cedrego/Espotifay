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

    public AltaSeguirUsuario(ICtrl ic, String usuario, String seguidor) {
        ManejadorUsuario mu = ManejadorUsuario.getInstance();
        ictrl = ic;

        Cliente cli = mu.buscarCliente(usuario);
        Cliente seg = mu.buscarCliente(seguidor);
        Artista art = mu.buscarArtista(usuario);

        // Verificar si el seguidor existe
        if (seg == null) {
            System.out.println("ERROR: Seguidor no encontrado");
            return;
        }

        // Verificar si es cliente
        if (cli != null) {
            ictrl.agregarSeguidorC(cli, seg);
        } 
        // Verificar si es artista
        else if (art != null) {
            ictrl.agregarSeguidorA(art, seg);
        } 
        // Si no es ni cliente ni artista
        else {
            System.out.println("ERROR: Usuario no encontrado");
        }
    }
}