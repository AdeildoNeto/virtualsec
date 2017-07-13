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
import model.Aluno;
import model.Relatorioparental;

/**
 *
 * @author carlo
 */
public class RelatorioDAO implements DAO<Relatorioparental> {

    private final static EntityManagerFactory EMF = Persistence.createEntityManagerFactory("VirtualSecPU");

    @Override
    public Relatorioparental getSingle(Relatorioparental id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Relatorioparental getSingle(int id) {
        EntityManager em = EMF.createEntityManager();

        String jpa = "SELECT u FROM Relatorioparental u where u.idRelatorioParental = ?1";
        Query query = em.createQuery(jpa);
        query.setParameter(1, id);

        try {
            Relatorioparental relatorioparental = (Relatorioparental) query.getSingleResult();
            return relatorioparental;
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public Relatorioparental getSingle(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Relatorioparental getSingleID(Aluno matricula) {
        EntityManager em = EMF.createEntityManager();

        String jpa = "SELECT u FROM Relatorioparental u where u.alunosMatricula = ?1";
        Query query = em.createQuery(jpa);
        query.setParameter(1, matricula);

        try {
            Relatorioparental relatorioparental = (Relatorioparental) query.getSingleResult();
            return relatorioparental;
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public List<Relatorioparental> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Relatorioparental inserir(Relatorioparental entity) {
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
    public void deletar(Relatorioparental entity) {
        EntityManager em = null;
        EntityTransaction et = null;

        try {
            em = EMF.createEntityManager();
            et = em.getTransaction();

            et.begin();
            Relatorioparental relatorioparental = em.merge(entity);
            em.remove(relatorioparental);
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
    public Relatorioparental atualizar(Relatorioparental entity) {
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
