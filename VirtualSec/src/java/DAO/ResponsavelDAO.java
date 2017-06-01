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
import model.Aluno;
import model.Responsavel;

/**
 *
 * @author carlo
 */
public class ResponsavelDAO implements DAO<Responsavel>{
    
    private final static EntityManagerFactory EMF = Persistence.createEntityManagerFactory("VirtualSecPU");
    
    @Override
    public Responsavel getSingle(Responsavel id) {
        EntityManager em = EMF.createEntityManager();
        
        String jpql = "FROM Responsavel u Where u.idUsuario > ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, id);
        return (Responsavel) query.getSingleResult();
    }
    
    // adicionado
    public Responsavel getSingle(Aluno id) {
        EntityManager em = EMF.createEntityManager();
        
        String jpa = "SELECT u FROM Responsavel u Where u.alunosMatricula = ?1";
        Query query = em.createQuery(jpa);
        query.setParameter(1, id);
        return (Responsavel) query.getSingleResult();
    }
    
    @Override
    public Responsavel getSingle(String login) {
         EntityManager em = EMF.createEntityManager();
        
        String jpql = "SELECT u FROM Responsavel u where u.login = ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, login);

        return (Responsavel) query.getSingleResult();
    }

    @Override
    public List<Responsavel> listar() {
        EntityManager em = EMF.createEntityManager();
        
        String jpa = "SELECT u FROM Responsavel u";
        Query query = em.createQuery(jpa);

        return (List<Responsavel>) query.getResultList();
    }

    @Override
    public Responsavel inserir(Responsavel entity) {
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
    
     public int insere(Responsavel entity) {
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
    public void deletar(Responsavel entity) {
        EntityManager em = null;
        EntityTransaction et = null;

        try {
            em = EMF.createEntityManager();
            et = em.getTransaction();

            et.begin();
            Responsavel responsavel = em.merge(entity);
            em.remove(responsavel);
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
    public Responsavel atualizar(Responsavel entity) {
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
