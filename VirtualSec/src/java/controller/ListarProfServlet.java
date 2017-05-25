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
import model_antigo.Professor;

/**
 *
 * @author aldo_neto
 */
public class ListarProfServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     *
     */
    
     List listaProf = new ArrayList();
     
     boolean bloqueado = false;
     
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
    
        
       
       if(bloqueado == false)
       {
       Professor prof = new Professor();
       
       prof.setNome("Ramide");
       prof.setCPF("999.999.999-00");
       prof.setEmail("abc@cde.com");
       prof.setEndereco("IFPE");
       prof.setTelefone(99999999);
       prof.setNascimento("10/10/1950");
       prof.setRG("0000000");
       prof.setDisciplina("Web II");
       listaProf.add(prof);
       
       bloqueado = true;
       } 
        
    ServletContext context = request.getSession().getServletContext();
        context.setAttribute("professor", listaProf);
        Object professor = context.getAttribute("professor");
        request.setAttribute("listaProfessor", professor);
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/listar_professor_admin.jsp");
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
        
         ServletContext context = request.getSession().getServletContext();

        Professor profCadastrado = (Professor) request.getAttribute("profCadastrado");
        
        listaProf.add(profCadastrado);
        
        context.setAttribute("Professor", listaProf);
        Object professor = context.getAttribute("Professor");
        request.setAttribute("profCadastrado", professor);
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/listar_professor_admin.jsp");
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
