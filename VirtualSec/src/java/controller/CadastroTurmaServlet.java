/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.TurmaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Turma;
import model.Usuario;

/**
 *
 * @author aldo_neto
 */
public class CadastroTurmaServlet extends HttpServlet {

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
        Erro erros = new Erro();
        String serie = request.getParameter("serie");
        String turno = request.getParameter("turno");
        int sala = Integer.parseInt(request.getParameter("sala"));
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        int qtdAluno = Integer.parseInt(request.getParameter("quantidade_alunos"));

        Turma turma = new Turma();
        TurmaDAO dao = new TurmaDAO();

        turma.setNome(serie);
        turma.setNumerosala(sala);
        turma.setTurno(turno);
        turma.setIdturma(codigo);
        turma.setQtdAluno(qtdAluno);

        Turma turmaVerifica = dao.inserir(turma);
        if (turmaVerifica != null) {
            erros.add("Turma cadastrada");
        } else {
            erros.add("Turma não cadastrada");
        }
        request.getSession().setAttribute("mensagens", erros);
        response.sendRedirect("Menu?acao=cadastrar_turma");
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
