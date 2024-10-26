/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.ClienteJpaController;
import Persistencia.SuscripcionJpaController;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author User
 */
public class CrearSuscripcion {
    Factory fabric =Factory.getInstance();
    ICtrl ctrl = fabric.getICtrl();
     public SuscripcionJpaController suscripJpaController = new SuscripcionJpaController();
    // Obtenemos el EntityManager desde la fábrica
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pantallaPU");
    EntityManager em = emf.createEntityManager();
    
    public CrearSuscripcion(String Estado,String diaS,String mesS, String anioS, String Tipo, String Cli ){
        // Convertir de String a int
        int dia = Integer.parseInt(diaS);
        int mes = Integer.parseInt(mesS);
        int anio = Integer.parseInt(anioS);
        DTFecha fecha = new DTFecha(dia, mes, anio);
        // Buscar el cliente usando el nickname
        ClienteJpaController clienteJpaController = new ClienteJpaController();
        Cliente cliente = clienteJpaController.findCliente(Cli);
        Suscripcion.estado estado = Suscripcion.estado.valueOf(Estado);
        Suscripcion.tipo tipo = Suscripcion.tipo.valueOf(Tipo);   
        Suscripcion NuevoSus = new Suscripcion(estado ,fecha,tipo ,cliente);
        try {
            suscripJpaController.create(NuevoSus);
        } catch (Exception e) {
            System.out.println("Error al guardar la Suscripcion: " + e.getMessage());
        }
    }
}
