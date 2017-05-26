/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Usuario;

/**
 *
 * @author joselima
 */
public class UsuarioDAO implements DAO<Usuario>{

    private final static EntityManagerFactory EMF = Persistence.createEntityManagerFactory("VirtualSecPU");
    
    @Override
    public Usuario getSingle(Usuario id) {
        EntityManager em = EMF.createEntityManager();
        
        String jpql = "FROM Usuario u Where u.idUsuario > ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, id);
        return (Usuario) query.getSingleResult();
    }
    
    // adicionado
    public Usuario getSingle(int id) {
        EntityManager em = EMF.createEntityManager();
        
        String jpa = "FROM Usuario u Where u.idUsuario > ?1";
        Query query = em.createQuery(jpa);
        query.setParameter(1, id);
        return (Usuario) query.getSingleResult();
    }
    
    @Override
    public Usuario getSingle(String login) {
         EntityManager em = EMF.createEntityManager();
        
        String jpql = "SELECT u FROM Usuario u where u.login = ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, login);

        return (Usuario) query.getSingleResult();
    }

    @Override
    public List<Usuario> listar() {
        EntityManager em = EMF.createEntityManager();
        
        String jpa = "FROM Usuario";
        Query query = em.createQuery(jpa);

        return (List<Usuario>) query.getResultList();
    }

    @Override
    public Usuario inserir(Usuario entity) {
        EntityManager em = null;
        EntityTransaction et = null;

        try {
            em = EMF.createEntityManager();
            et = em.getTransaction();

            et.begin();
            em.persist(entity);
            et.commit();
        } catch (Exception ex) {
            if (et != null && et.isActive()) {
                et.rollback();
            }
        } finally {
            if (em != null) {
                em.close();
            }
        }

        return entity;

    }
    
     public int insere(Usuario entity) {
        EntityManager em = null;
        EntityTransaction et = null;
        
        
        try {
            em = EMF.createEntityManager();
            et = em.getTransaction();

            et.begin();
            em.persist(entity);
            et.commit();
        } catch (Exception ex) {
            if (et != null && et.isActive()) {
                et.rollback();
            }
        } finally {
            if (em != null) {
                em.close();
            }
        }
        int idEntity = entity.getIdusuarios();
        
        return idEntity;

    }

    @Override
    public void deletar(Usuario entity) {
        EntityManager em = null;
        EntityTransaction et = null;

        try {
            em = EMF.createEntityManager();
            et = em.getTransaction();

            et.begin();
            em.remove(entity);
            et.commit();
        } catch (Exception ex) {
            if (et != null && et.isActive()) {
                et.rollback();
            }
        } finally {
            if (em != null) {
                em.close();
            }
        }

    }

    @Override
    public Usuario atualizar(Usuario entity) {
       EntityManager em = null;
        EntityTransaction et = null;

        try {
            em = EMF.createEntityManager();
            et = em.getTransaction();

            et.begin();
            em.merge(entity);
            et.commit();
        } catch (Exception ex) {
            if (et != null && et.isActive()) {
                et.rollback();
            }
        } finally {
            if (em != null) {
                em.close();
            }
        }

        return entity;
    }

 

 
}