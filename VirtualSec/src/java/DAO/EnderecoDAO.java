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
import model.Endereco;

/**
 *
 * @author Aluno
 */
public class EnderecoDAO implements DAO<Endereco>{
    private final static EntityManagerFactory EMF = Persistence.createEntityManagerFactory("VirtualSecPU");
    
    @Override
    public Endereco getSingle(Endereco id) {
        EntityManager em = EMF.createEntityManager();
        
        String jpql = "FROM Usuario u Where u.idUsuario > ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, id);
        return (Endereco) query.getSingleResult();
    }
    
    // adicionado
    public Endereco getSingle(int id) {
        EntityManager em = EMF.createEntityManager();
        
        String jpa = "FROM Usuario u Where u.idUsuario > ?1";
        Query query = em.createQuery(jpa);
        query.setParameter(1, id);
        return (Endereco) query.getSingleResult();
    }
    
    @Override
    public Endereco getSingle(String login) {
         EntityManager em = EMF.createEntityManager();
        
        String jpql = "SELECT u FROM Usuario u where u.login = ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, login);

        return (Endereco) query.getSingleResult();
    }

    @Override
    public List<Endereco> listar() {
        EntityManager em = EMF.createEntityManager();
        
        String jpa = "FROM Usuario";
        Query query = em.createQuery(jpa);

        return (List<Endereco>) query.getResultList();
    }

    @Override
    public Endereco inserir(Endereco entity) {
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

    @Override
    public void deletar(Endereco entity) {
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
    public Endereco atualizar(Endereco entity) {
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
