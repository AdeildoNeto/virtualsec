/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.*;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Aldo-pc
 */
public class LoginServlet extends HttpServlet {

  

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
   
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nome = request.getParameter("login");
        String senha = request.getParameter("senha");
        RequestDispatcher rd = null;
        
       Autenticador aut = new Autenticador();
       
       
       switch(aut.autenticar(nome, senha))
       {
           case "adm":
               rd = request.getRequestDispatcher("WEB-INF/view/menu_admin.jsp");
               Usuario usuarioAdmin = new Usuario(nome, senha);  
               break;
           
           case "prof":
               rd = request.getRequestDispatcher("WEB-INF/view/menu_professor.jsp");
               Usuario usuarioProf = new Usuario(nome, senha);  
               break;
            
           case "resp":
               rd = request.getRequestDispatcher("WEB-INF/view/menu_responsavel.jsp");
               Usuario usuarioResp = new Usuario(nome, senha);  
               break;
            
           case "erro":
               rd = request.getRequestDispatcher("WEB-INF/view/erro.jsp");
               break;
       }
       
       rd.forward(request,response);
       
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
