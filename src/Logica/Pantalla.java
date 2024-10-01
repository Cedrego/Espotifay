/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica;

import Persistencia.ControladoraPersistencia;
import Capa_Presentacion.Dashboard;

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
        Dashboard ventana = new Dashboard();
        ventana.setVisible(true);
    }
}
