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
import model.Professores;

/**
 *
 * @author Aluno
 */
public class ProfessorDAO implements DAO<Professores>{
    private final static EntityManagerFactory EMF = Persistence.createEntityManagerFactory("VirtualSecPU");
    
    @Override
    public Professores getSingle(Professores id) {
        EntityManager em = EMF.createEntityManager();
        
        String jpql = "FROM Usuario u Where u.idUsuario > ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, id);
        return (Professores) query.getSingleResult();
    }
    
    // adicionado
    public Professores getSingle(int id) {
        EntityManager em = EMF.createEntityManager();
        
        String jpa = "FROM Professores u Where u.idusuarios = ?1";
        Query query = em.createQuery(jpa);
        query.setParameter(1, id);
        return (Professores) query.getSingleResult();
    }
    
    @Override
    public Professores getSingle(String login) {
         EntityManager em = EMF.createEntityManager();
        
        String jpql = "SELECT u FROM Professores u where u.login = ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, login);

        return (Professores) query.getSingleResult();
    }

    @Override
    public List<Professores> listar() {
        EntityManager em = EMF.createEntityManager();
        
        String jpa = "SELECT u FROM Professores u";
        Query query = em.createQuery(jpa);

        return (List<Professores>) query.getResultList();
    }

    @Override
    public Professores inserir(Professores entity) {
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
    public void deletar(Professores entity) {
        EntityManager em = null;
        EntityTransaction et = null;

        try {
            em = EMF.createEntityManager();
            et = em.getTransaction();

            et.begin();
            Professores user = em.merge(entity);
            em.remove(user);
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
    public Professores atualizar(Professores entity) {
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
