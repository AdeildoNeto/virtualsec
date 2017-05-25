/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author joselima
 */
public interface DAO<T> {
    public T getSingle(T id);
    public T getSingle(String login);
    public List<T> listar();
    public T inserir(T entity);
    public void deletar(T entity);
    public T atualizar(T entity);
}
