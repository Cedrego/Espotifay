/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
//import Espotify.Usuario;

import Persistencia.ClienteJpaController;
import Persistencia.ArtistaJpaController;

/**
 *
 * @author Camilo
 */
public class AltaUsuario {
    Factory fabric = Factory.getInstance();
    ICtrl ctrl = fabric.getICtrl();
            
    public AltaUsuario(String nick, String nom, String ape, String mail, String pass, DTFecha nac, String bio, String web){
        if(bio == null){
            Cliente nuevoCliente = new Cliente(nick, nom, ape, mail, pass, nac);

            ClienteJpaController JpaCliente = new ClienteJpaController();

            try {
                JpaCliente.create(nuevoCliente);
            } catch (Exception e) {
                System.out.println("Error al guardar el cliente: " + e.getMessage());
            }
        }else{
            Artista nuevoArtista = new Artista(nick, nom, ape, mail, pass, nac, bio, web);

            ArtistaJpaController artistaJpaController = new ArtistaJpaController();

            try {
                artistaJpaController.create(nuevoArtista);
            } catch (Exception e) {
                System.out.println("Error al guardar el cliente: " + e.getMessage());
            }
        }
    }
}