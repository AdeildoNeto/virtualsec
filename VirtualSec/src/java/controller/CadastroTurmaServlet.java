/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
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
public class CadastroTurmaServlet extends HttpServlet {
    
     public Turma fazerCadastro(int codigo, String turnoT,String serieT, int salaT, int qtdAlunoT ){
         Turma turmaCadastrada = new Turma();
         
         turmaCadastrada.setCodigo(codigo);
         turmaCadastrada.setSerie(serieT);
         turmaCadastrada.setSala(salaT);
         turmaCadastrada.setTurno(turnoT);
         turmaCadastrada.setQtdAluno(qtdAlunoT);
          return turmaCadastrada;
     }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        
        ServletContext sc = request.getServletContext();
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        String turno = request.getParameter("turno");
        String serie = request.getParameter("serie");
        int sala = Integer.parseInt(request.getParameter("sala"));
        int qtdAluno = Integer.parseInt(request.getParameter("quantidade_alunos"));
        

                
        sc.setAttribute("TurmaCadastrada", fazerCadastro(codigo, turno, serie, sala, qtdAluno));
         Object turmaCadastrada = sc.getAttribute("TurmaCadastrada");
        request.setAttribute("turmaCadastrada", turmaCadastrada);
        
        RequestDispatcher rd = request.getRequestDispatcher("ListarTurmaServlet");
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
