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
import javax.persistence.NoResultException;
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
        
        String jpql = "SELECT u FROM Turma u Where u.idturma = ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, id);
        try{
        Turma turma = (Turma) query.getSingleResult(); 
        return turma;
        }catch(NoResultException e){
        return null;
        }
    }
    
    // adicionado
    public List<Turma> getSingle(int id) {
        EntityManager em = EMF.createEntityManager();
        
        String jpa = "SELECT u FROM Turma u Where u.idturma = ?1";
        Query query = em.createQuery(jpa);
        query.setParameter(1, id);

        try{
        List list = (List<Turma>) query.getResultList(); 
        return list;
        }catch(NoResultException e){
        return null;
        }
    }
    
    public Turma getSingleID(int id) {
        EntityManager em = EMF.createEntityManager();
        
        String jpa = "SELECT u FROM Turma u Where u.idturma = ?1";
        Query query = em.createQuery(jpa);
        query.setParameter(1, id);
        try{
        Turma turma = (Turma) query.getSingleResult(); 
        return turma;
        }catch(NoResultException e){
        return null;
        }
    }
    
    @Override
    public Turma getSingle(String login) {
         EntityManager em = EMF.createEntityManager();
        
        String jpql = "SELECT u FROM Turma u where u.login = ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, login);

        try{
        Turma turma = (Turma) query.getSingleResult(); 
        return turma;
        }catch(NoResultException e){
        return null;
        }
    }

    @Override
    public List<Turma> listar() {
        EntityManager em = EMF.createEntityManager();
        
        String jpa = "SELECT u FROM Turma u";
        Query query = em.createQuery(jpa);

        try{
        List list = (List<Turma>) query.getResultList(); 
        return list;
        }catch(NoResultException e){
        return null;
        }
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
            Turma turma = em.merge(entity);
            em.remove(turma);
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
