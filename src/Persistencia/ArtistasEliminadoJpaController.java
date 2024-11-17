/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Logica.ArtistasEliminado;
import Persistencia.exceptions.PreexistingEntityException;
import java.io.Serializable;
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
public class ArtistasEliminadoJpaController implements Serializable {

    private EntityManagerFactory emf = null;

    public ArtistasEliminadoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public ArtistasEliminadoJpaController() {
        this.emf = Persistence.createEntityManagerFactory("pantallaPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    // Método para crear un nuevo registro de ArtistasEliminado
    public void create(ArtistasEliminado artista) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(artista);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findArtistasEliminado(artista.getIdEliminado()) != null) {
                throw new PreexistingEntityException("El artista eliminado con id " + artista.getIdEliminado() + " ya existe.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Método para editar un registro de ArtistasEliminado existente
    public void edit(ArtistasEliminado artista) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            artista = em.merge(artista);
            em.getTransaction().commit();
        } catch (Exception ex) {
            int id = artista.getIdEliminado();
            if (findArtistasEliminado(id) == null) {
                throw new Exception("El artista eliminado con id " + id + " no existe.");
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Método para eliminar un registro de ArtistasEliminado por su id
    public void destroy(int id) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ArtistasEliminado artista;
            try {
                artista = em.getReference(ArtistasEliminado.class, id);
                artista.getIdEliminado(); // Verifica si el objeto existe
            } catch (Exception ex) {
                throw new Exception("El artista eliminado con id " + id + " no existe.", ex);
            }
            em.remove(artista);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Método para encontrar un ArtistasEliminado por su id
    public ArtistasEliminado findArtistasEliminado(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ArtistasEliminado.class, id);
        } finally {
            em.close();
        }
    }

    // Método para obtener todas las entidades de ArtistasEliminado
    public List<ArtistasEliminado> findArtistasEliminadoEntities() {
        return findArtistasEliminadoEntities(true, -1, -1);
    }

    // Método para obtener una lista paginada de ArtistasEliminado
    public List<ArtistasEliminado> findArtistasEliminadoEntities(int maxResults, int firstResult) {
        return findArtistasEliminadoEntities(false, maxResults, firstResult);
    }

    private List<ArtistasEliminado> findArtistasEliminadoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ArtistasEliminado.class));
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

    // Método para contar la cantidad de entidades de ArtistasEliminado
    public int getArtistasEliminadoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ArtistasEliminado> rt = cq.from(ArtistasEliminado.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
}
