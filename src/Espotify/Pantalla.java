/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Espotify;

import Persistencia.ControladoraPersistencia;

/**
 *
 * @author Camilo
 */
public class Pantalla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControladoraPersistencia ctrl = new ControladoraPersistencia();
        ventana espotify = new ventana();
        espotify.setVisible(true);
    }
}
