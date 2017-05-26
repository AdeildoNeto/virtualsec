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
import model.Pessoa;

/**
 *
 * @author Aluno
 */
public class PessoaDAO implements DAO<Pessoa>{
    private final static EntityManagerFactory EMF = Persistence.createEntityManagerFactory("VirtualSecPU");
    
    @Override
    public Pessoa getSingle(Pessoa id) {
        EntityManager em = EMF.createEntityManager();
        
        String jpql = "FROM Usuario u Where u.idUsuario > ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, id);
        return (Pessoa) query.getSingleResult();
    }
    
    // adicionado
    public Pessoa getSingle(int id) {
        EntityManager em = EMF.createEntityManager();
        
        String jpa = "FROM Usuario u Where u.idUsuario > ?1";
        Query query = em.createQuery(jpa);
        query.setParameter(1, id);
        return (Pessoa) query.getSingleResult();
    }
    
    @Override
    public Pessoa getSingle(String login) {
         EntityManager em = EMF.createEntityManager();
        
        String jpql = "SELECT u FROM Usuario u where u.login = ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, login);

        return (Pessoa) query.getSingleResult();
    }

    @Override
    public List<Pessoa> listar() {
        EntityManager em = EMF.createEntityManager();
        
        String jpa = "FROM Usuario";
        Query query = em.createQuery(jpa);

        return (List<Pessoa>) query.getResultList();
    }

    @Override
    public Pessoa inserir(Pessoa entity) {
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
    
    public int insere(Pessoa entity) {
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

        return entity.getIdpessoas();
    }

    @Override
    public void deletar(Pessoa entity) {
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
    public Pessoa atualizar(Pessoa entity) {
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
