/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.AlunoDAO;
import DAO.RelatorioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Relatorioparental;

/**
 *
 * @author carlo
 */
public class ListarNotaServlet extends HttpServlet {

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
        RequestDispatcher rd = null;
        Erro erros = new Erro();
        AlunoDAO alunoDao = new AlunoDAO();
        RelatorioDAO relatorioDao = new RelatorioDAO();
        Integer id_aluno = Integer.parseInt(request.getParameter("id"));
        Relatorioparental relatorio = relatorioDao.getSingleID(alunoDao.getSingle(id_aluno));
        if (relatorio != null) {
            List lista = new ArrayList();
            lista.add(0, relatorio);
            request.setAttribute("relatorioAluno", lista);
            request.setAttribute("mensagens", request.getSession().getAttribute("mensagens"));
            request.getSession().setAttribute("mensagens", null);
        }
        else{
            erros.add("Notas inseridas");
            request.setAttribute("mensagens", erros);
        }

        rd = request.getRequestDispatcher("WEB-INF/view/listar_notas_prof.jsp");
        rd.forward(request, response);
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
