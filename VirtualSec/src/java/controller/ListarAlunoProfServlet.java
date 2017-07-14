/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.AlunoDAO;
import DAO.TurmaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Turma;

/**
 *
 * @author aldo_neto
 */
public class ListarAlunoProfServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    List listTurma;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Erro erros = new Erro();
        int idTurma = Integer.parseInt(request.getParameter("id"));

        AlunoDAO alunoDAO = new AlunoDAO();

        TurmaDAO turmaDAO = new TurmaDAO();

        listTurma = turmaDAO.getSingleList(idTurma);

        Turma turma = (Turma) listTurma.get(0);

        List listAluno = alunoDAO.listarTurma(turma);
        if (listAluno.isEmpty()) {
            erros.add("Não há alunos cadastrados na turma");
            request.setAttribute("mensagens", erros);
        } else {
            request.setAttribute("listaAlunoProf",listAluno);
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/view/listar_alunos_prof.jsp");
        dispatcher.forward(request, response);

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

        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/view/listar_alunos_prof.jsp");
        dispatcher.forward(request, response);
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
