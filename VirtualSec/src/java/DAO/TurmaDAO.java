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
import model.Turma;

/**
 *
 * @author joselima
 */
public class TurmaDAO implements DAO<Turma>{

    private final static EntityManagerFactory EMF = Persistence.createEntityManagerFactory("VirtualSecPU");
    
    @Override
    public Turma getSingle(Turma id) {
        EntityManager em = EMF.createEntityManager();
        
        String jpql = "FROM Turma u Where u.idTurma > ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, id);
        return (Turma) query.getSingleResult();
    }
    
    // adicionado
    public Turma getSingle(int id) {
        EntityManager em = EMF.createEntityManager();
        
        String jpa = "FROM Turma u Where u.idTurma > ?1";
        Query query = em.createQuery(jpa);
        query.setParameter(1, id);
        return (Turma) query.getSingleResult();
    }
    
    @Override
    public Turma getSingle(String login) {
         EntityManager em = EMF.createEntityManager();
        
        String jpql = "SELECT u FROM Turma u where u.login = ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, login);

        return (Turma) query.getSingleResult();
    }

    @Override
    public List<Turma> listar() {
        EntityManager em = EMF.createEntityManager();
        
        String jpa = "FROM Turma";
        Query query = em.createQuery(jpa);

        return (List<Turma>) query.getResultList();
    }

    @Override
    public Turma inserir(Turma entity) {
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
    public void deletar(Turma entity) {
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
    public Turma atualizar(Turma entity) {
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
