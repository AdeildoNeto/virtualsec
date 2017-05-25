/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_antigo;

/**
 *
 * @author aldo_neto
 */
public class Autenticador {
    
    public String autenticar(String login, String senha)
    {
        if(("admin".equalsIgnoreCase(login) && "123".equals(senha)))
        {
            return "adm";
        }
        else if(("professor".equalsIgnoreCase(login) && "123".equals(senha)))
        {
            return "prof";
        }
        else if(("responsavel".equalsIgnoreCase(login) && "123".equals(senha)))
        {
            return "resp";
        }
        else
        {
            return "erro";
        }
        
    }
}
