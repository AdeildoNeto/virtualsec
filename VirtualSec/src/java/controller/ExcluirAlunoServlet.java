/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.AlunoDAO;
import DAO.RelatorioDAO;
import DAO.ResponsavelDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Aluno;

/**
 *
 * @author carlo
 */
public class ExcluirAlunoServlet extends HttpServlet {

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
         AlunoDAO dao = new AlunoDAO();
         ResponsavelDAO respDao = new ResponsavelDAO();
         RelatorioDAO relatorioDao = new RelatorioDAO();
         Erro erros = new Erro();
         
        int matricula = Integer.parseInt(request.getParameter("aluno"));
        Aluno aluno = dao.getSingle(matricula);
        respDao.deletar(respDao.getSingle(aluno));
        relatorioDao.deletar(relatorioDao.getSingleID(matricula));
        dao.deletar(aluno);
        
        
        if(dao.getSingle(matricula) != null)
        {
            erros.add("Aluno não excluído!");
        }
        else
        {
            erros.add("Aluno Excluído");
        }
         request.getSession().setAttribute ("mensagens", erros);
        response.sendRedirect("Menu?acao=alterar_alunos");
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
