/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model_antigo.Turma;

/**
 *
 * @author aldo_neto
 */
public class ListarTurmaServlet extends HttpServlet {

    
    List lista = new ArrayList();
    boolean bloqueio = false;
   

        
        
      
    
    
   
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

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
        processRequest(request, response);
        
        //List lista = new ArrayList();
       //ServletContext context = request.getSession().getServletContext();
       
       Turma turma1 = new Turma();
        
       if(bloqueio == false)
       {
       turma1.setCodigo(0);
       turma1.setQtdAluno(15);
       turma1.setSala(3);
       turma1.setSerie("Primeira Série");
       turma1.setTurno("Tarde");
       lista.add(turma1);
        
        bloqueio = true;
       }
         
 
       
        
       
       ServletContext context = request.getSession().getServletContext();
        context.setAttribute("lista", lista);
        Object turma = context.getAttribute("lista");
        request.setAttribute("turma", turma);
        //String acao = request.getParameter("acao");
        
        
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/listar_turmas_admin.jsp");
        rd.forward(request, response);
    
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
        processRequest(request, response);
        
        //List lista = new ArrayList();
        
        ServletContext context = request.getSession().getServletContext();

        Turma turmaCadastrada = (Turma) request.getAttribute("turmaCadastrada");
        
        lista.add(turmaCadastrada);
        
        context.setAttribute("turma", lista);
        Object turma = context.getAttribute("turma");
        request.setAttribute("turma", turma);
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/listar_turmas_admin.jsp");
        rd.forward(request, response);
        
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
