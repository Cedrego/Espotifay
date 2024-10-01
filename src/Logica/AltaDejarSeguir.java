/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
//import Espotify.Usuario;
/**
 *
 * @author Camilo
 */
public class AltaDejarSeguir {
    private ICtrl ictrl;

    public AltaDejarSeguir(ICtrl ic, String usuario, String seguidor) {
        ManejadorUsuario mu = ManejadorUsuario.getInstance();
        ictrl = ic;

        // Buscar al usuario y al seguidor
        Cliente cli = mu.buscarCliente(usuario);
        Artista art = mu.buscarArtista(usuario);
        Cliente seg = mu.buscarCliente(seguidor);

        // Verificar que el seguidor no sea nulo
        if (seg == null) {
            System.out.println("Error: El seguidor no existe.");
            return;
        }

        // Verificar el tipo de usuario y realizar la operación correspondiente
        if (cli != null && seg != null) {
            // Si el usuario es un cliente, dejar de seguir
            ictrl.dejarSeguidorC(cli, seg);
        } else if (art != null && seg != null) {
            // Si el usuario es un artista, dejar de seguir
            ictrl.dejarSeguidorA(art, seg);
        } else {
            // Si el usuario no es ni cliente ni artista
            System.out.println("Error: El usuario no es ni cliente ni artista.");
        }
    }
}
