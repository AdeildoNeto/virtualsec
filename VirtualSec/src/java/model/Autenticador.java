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
public class Autenticador {
    
    public boolean autenticar(String login, String senha)
    {
        if(("adeildo".equalsIgnoreCase(login) && "senha".equals(senha)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
