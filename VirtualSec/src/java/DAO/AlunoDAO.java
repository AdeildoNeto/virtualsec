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
import model.Turma;

/**
 *
 * @author carlo
 */
public class AlunoDAO implements DAO<Aluno>{
     private final static EntityManagerFactory EMF = Persistence.createEntityManagerFactory("VirtualSecPU");
    
    @Override
    public Aluno getSingle(Aluno id) {
        EntityManager em = EMF.createEntityManager();
        
        String jpql = "FROM Aluno u Where u.idAluno > ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, id);
        return (Aluno) query.getSingleResult();
    }
    
    // adicionado
    public Aluno getSingle(int id) {
        EntityManager em = EMF.createEntityManager();
        
        String jpa = "SELECT u FROM Aluno u where u.matricula = ?1";
        Query query = em.createQuery(jpa);
        query.setParameter(1, id);
        return (Aluno) query.getSingleResult();
    }
    
    @Override
    public Aluno getSingle(String login) {
         EntityManager em = EMF.createEntityManager();
        
        String jpql = "SELECT u FROM Aluno u where u.login = ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, login);

        return (Aluno) query.getSingleResult();
    }

    @Override
    public List<Aluno> listar() {
        EntityManager em = EMF.createEntityManager();
        
        String jpa = "SELECT u FROM Aluno u";
        Query query = em.createQuery(jpa);

        return (List<Aluno>) query.getResultList();
    }
    
     public List<Aluno> listarTurma(Turma x) {
        EntityManager em = EMF.createEntityManager();
        
        String jpa = "SELECT u FROM Aluno u where u.idTurma = ?1";
        Query query = em.createQuery(jpa);
         query.setParameter(1, x);

        return (List<Aluno>) query.getResultList();
    }
     
     public List<Aluno> listarAluno(int x) {
        EntityManager em = EMF.createEntityManager();
        
        String jpa = "SELECT u FROM Aluno u where u.matricula = ?1";
        Query query = em.createQuery(jpa);
         query.setParameter(1, x);

        return (List<Aluno>) query.getResultList();
    }
    
    
    @Override
    public Aluno inserir(Aluno entity) {
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
    public void deletar(Aluno entity) {
        EntityManager em = null;
        EntityTransaction et = null;

        try {
            em = EMF.createEntityManager();
            et = em.getTransaction();

            et.begin();
            Aluno user = em.merge(entity);
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
    public Aluno atualizar(Aluno entity) {
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
