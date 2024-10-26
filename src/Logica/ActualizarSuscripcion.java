/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.SuscripcionJpaController;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author User
 */
public class ActualizarSuscripcion {
    Factory fabric =Factory.getInstance();
    ICtrl ctrl = fabric.getICtrl();
    // Obtenemos el EntityManager desde la fábrica
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pantallaPU");
    EntityManager em = emf.createEntityManager();
    public ActualizarSuscripcion (Long ID, Enum Estado) {
        SuscripcionJpaController suscripJpaController = new SuscripcionJpaController();
        List<Suscripcion> Suscrip = suscripJpaController.findSuscripcionEntities();
        for(Suscripcion sus: Suscrip){
            if(sus.getId().equals(ID)){
                LocalDate fechaActual = LocalDate.now();
                int dia = fechaActual.getDayOfMonth();
                int mes = fechaActual.getMonthValue();
                int anio = fechaActual.getYear();
                // Ahora puedes usar estos valores para crear un objeto DTFecha
                DTFecha fecha = new DTFecha(dia, mes, anio);
                sus.setUltimaModificacion(fecha);
                sus.setEstado((Suscripcion.estado) Estado);
                 // Cargar la suscripción directamente por ID
                try {
                    em.getTransaction().begin(); // Iniciar la transacción
                    sus.setUltimaModificacion(fecha);
                    sus.setEstado((Suscripcion.estado) Estado);
                // Actualizar en la base de datos
                suscripJpaController.edit(sus);
                } catch (Exception e) {
                    e.printStackTrace(); // Manejo de errores
                } finally {
                    // Cerrar el EntityManager y el EntityManagerFactory
                    em.close();
                    emf.close();
                }  
            }
        }
    }
}
