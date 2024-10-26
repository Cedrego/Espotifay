/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Logica.Suscripcion;
import Persistencia.exceptions.PreexistingEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author User
 */
public class SuscripcionJpaController {

   public SuscripcionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public SuscripcionJpaController(){
        emf = Persistence.createEntityManagerFactory("pantallaPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    // Método para crear una nueva suscripción
    public void create(Suscripcion suscripcion) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(suscripcion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findSuscripcion(suscripcion.getId()) != null) {
                throw new Exception("Suscripción " + suscripcion + " ya existe.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Método para editar una suscripción existente
    public void edit(Suscripcion suscripcion) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            suscripcion = em.merge(suscripcion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            Long id = suscripcion.getId();
            if (findSuscripcion(id) == null) {
                throw new Exception("La suscripción con id " + id + " no existe.");
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Método para eliminar una suscripción por su id
    public void destroy(Long id) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Suscripcion suscripcion;
            try {
                suscripcion = em.getReference(Suscripcion.class, id);
                suscripcion.getId();
            } catch (Exception ex) {
                throw new Exception("La suscripción con id " + id + " no existe.", ex);
            }
            em.remove(suscripcion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Método para encontrar una suscripción por id
    public Suscripcion findSuscripcion(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Suscripcion.class, id);
        } finally {
            em.close();
        }
    }

    // Método para obtener todas las suscripciones
    public List<Suscripcion> findSuscripcionEntities() {
        return findSuscripcionEntities(true, -1, -1);
    }

    // Método para obtener una lista de suscripciones con límites (paginación)
    public List<Suscripcion> findSuscripcionEntities(int maxResults, int firstResult) {
        return findSuscripcionEntities(false, maxResults, firstResult);
    }

    private List<Suscripcion> findSuscripcionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Suscripcion.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    // Método para contar la cantidad de suscripciones
    public int getSuscripcionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Suscripcion> rt = cq.from(Suscripcion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
