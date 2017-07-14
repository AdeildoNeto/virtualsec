/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.EnderecoDAO;
import DAO.ProfessorDAO;
import DAO.TurmaDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Endereco;
import model.Professores;

/**
 *
 * @author aldo_neto
 */
public class CadastroProfServlet extends HttpServlet {

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

        int id_turma = Integer.parseInt(request.getParameter("id_turma"));
        String nome = request.getParameter("nome");
        String nascimento = request.getParameter("data_nascimento");
        String endereco = request.getParameter("endereco");
        int telefone = Integer.parseInt(request.getParameter("telefone"));
        String email = request.getParameter("email");
        Float cpf = Float.parseFloat(request.getParameter("cpf"));
        String rg = request.getParameter("rg");
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        String confirma_senha = request.getParameter("confirma_senha");
        int cep = Integer.parseInt(request.getParameter("cep"));
        String cidade = request.getParameter("cidade");
        int numero = Integer.parseInt(request.getParameter("numero"));
        String UF = request.getParameter("UF");

        ProfessorDAO professorDao = new ProfessorDAO();

        if (!senha.equals(confirma_senha)) {
            erros.add("Os campos de senha e confirmar senha estão diferentes");
        }
        if (!erros.isExisteErros()) {
            Professores user = professorDao.getSingle(login);
            if (user != null) {
                erros.add("Login já cadastrado");
            } else {
                Professores profCadastrado = new Professores();
                Endereco end = new Endereco();
                TurmaDAO turma = new TurmaDAO();
                EnderecoDAO enderecoDao = new EnderecoDAO();

                end.setCep(cep);
                end.setCidade(cidade);
                end.setNumero(numero);
                end.setRua(endereco);
                end.setUf(UF);

                profCadastrado.setCpf(cpf);
                profCadastrado.setRg(rg);
                profCadastrado.setEmail(email);
                profCadastrado.setEnderecoIdendereco(enderecoDao.inserir(end));
                profCadastrado.setNomecompleto(nome);
                profCadastrado.setTelefone(telefone);

                profCadastrado.setLogin(login);
                profCadastrado.setSenha(senha);
                profCadastrado.setTipousuarios(2);
                profCadastrado.setTurma(turma.getSingleID(id_turma));
                profCadastrado.setDataNascimento(nascimento);

                professorDao.inserir(profCadastrado);
                erros.add("Usuário Cadastrado");

            }
        }

        // RequestDispatcher rd = request.getRequestDispatcher("ListarProfServlet");
        // rd.forward(request, response);
        request.getSession().setAttribute ("mensagens", erros);
        response.sendRedirect("Menu?acao=cadastrar_prof");
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
