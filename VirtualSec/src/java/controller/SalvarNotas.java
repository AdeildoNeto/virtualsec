/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.RelatorioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Aluno;
import model.Relatorioparental;

/**
 *
 * @author carlo
 */
public class SalvarNotas extends HttpServlet {

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
        Integer id = Integer.parseInt(request.getParameter("id"));
        Float part = Float.parseFloat(request.getParameter("part"));
        Float fac = Float.parseFloat(request.getParameter("fac"));
        Float comp = Float.parseFloat(request.getParameter("comp"));
        Float eqp = Float.parseFloat(request.getParameter("eqp"));
        Float lider = Float.parseFloat(request.getParameter("lider"));

        RelatorioDAO relatorioDao = new RelatorioDAO();
        Relatorioparental relatorioAtual = new Relatorioparental();
        Relatorioparental relatorioBD = relatorioDao.getSingle(id);

        Aluno aluno = relatorioBD.getAlunosMatricula();

        relatorioAtual.setIdRelatorioParental(id);
        relatorioAtual.setAlunosMatricula(aluno);
        relatorioAtual.setComportamento(comp);
        relatorioAtual.setFacilidadeComDisciplina(fac);
        relatorioAtual.setLideranca(lider);
        relatorioAtual.setTrabalhoEmEquipe(eqp);
        relatorioAtual.setParticipacaoEmAula(part);

        Relatorioparental relatorioVerifica = relatorioDao.atualizar(relatorioAtual);
        if (relatorioVerifica != null) {
            erros.add("Notas atualizadas");
        } else {
            erros.add("Notas não foram atualizadas");
        }
        request.getSession().setAttribute("mensagens", erros);
       // response.sendRedirect("Menu?acao=ListarNotaServlet");
       rd = request.getRequestDispatcher("ListarNotaServlet");
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
