/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ProfessorDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Endereco;
import model.Professores;
import model.Turma;

/**
 *
 * @author carlo
 */
public class EditarProf extends HttpServlet {

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
        ProfessorDAO dao = new ProfessorDAO();
        Professores profEdit = new Professores();
        String nome = request.getParameter("nome");
        String data_nasc = request.getParameter("data_nascimento");
        String email = request.getParameter("email");
        String rg = request.getParameter("rg");
        Float cpf = Float.parseFloat(request.getParameter("cpf"));
        Integer telefone = Integer.parseInt(request.getParameter("telefone"));

        Professores profSessao = (Professores) request.getSession().getAttribute("professor_editado");
        profEdit.setCpf(cpf);
        profEdit.setDataNascimento(data_nasc);
        profEdit.setEmail(email);
        profEdit.setRg(rg);
        profEdit.setNomecompleto(nome);
        profEdit.setTelefone(telefone);
        profEdit.setLogin(profSessao.getLogin());
        profEdit.setIdusuarios(profSessao.getIdusuarios());
        Endereco end = profSessao.getEnderecoIdendereco();
        profEdit.setEnderecoIdendereco(end);
        Turma turma = profSessao.getTurma();
        profEdit.setTurma(turma);
        profEdit.setDtype("Professores");
        profEdit.setSenha(profSessao.getSenha());
        profEdit.setTipousuarios(profSessao.getTipousuarios());
        
        
        Professores professorVerifica = dao.atualizar(profEdit);
        if (professorVerifica != null) {
            erros.add("Usuaŕio atualizado");
        } else {
            erros.add("Usuário não foi atualizado");
        }
        request.getSession().setAttribute("mensagens", erros);
        rd = request.getRequestDispatcher("AlterarProfServlet");
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
