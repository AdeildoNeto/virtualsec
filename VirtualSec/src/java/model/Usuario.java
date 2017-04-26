/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aldo_neto
 */
public class Usuario {
    
    private String login;
    private String senha;
    private int tipoUsuario;
    
    public Usuario(String login, String senha)
    {
        this.login = login;
        this.senha = senha;
    }
    
    public Usuario()
    {
        
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void setTipoUsuario(int tipo)
    {
        this.tipoUsuario = tipo;
    }
    
    public int getTipoUsuario()
    {
        return tipoUsuario;
    }
}
