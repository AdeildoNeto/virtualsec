/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.EnderecoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Aluno;
import model.Responsavel;
import model.Endereco;
import DAO.ResponsavelDAO;
import DAO.AlunoDAO;
import DAO.RelatorioDAO;
import DAO.TurmaDAO;
import model.Relatorioparental;
import model.Turma;

/**
 *
 * @author aldo_neto
 */
public class CadastroAlunoServlet extends HttpServlet {

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

        int matricula = Integer.parseInt(request.getParameter("matricula"));
        String nome = request.getParameter("nome");
        String nascimento = request.getParameter("data_nascimento");
        int turma_aluno = Integer.parseInt(request.getParameter("id_turma"));
        String deficiencia = request.getParameter("deficiencia_aluno");

        String nome_resp = request.getParameter("nome_resp");
        String nascimento_resp = request.getParameter("data_nascimento_resp");
        String endereco_resp = request.getParameter("endereco_resp");
        int telefone_resp = Integer.parseInt(request.getParameter("telefone_resp"));
        String email_resp = request.getParameter("email_resp");
        int cpf_resp = Integer.parseInt(request.getParameter("cpf_resp"));
        String rg_resp = request.getParameter("rg_resp");
        String login_resp = request.getParameter("login_resp");
        String senha_resp = request.getParameter("senha_resp");
        String confirma_senha_resp = request.getParameter("confirma_senha_resp");
        int cep_resp = Integer.parseInt(request.getParameter("cep_resp"));
        String cidade_resp = request.getParameter("cidade_resp");
        int numero_resp = Integer.parseInt(request.getParameter("numero_resp"));
        String UF_resp = request.getParameter("UF_resp");
        String parentesco = request.getParameter("grau_parentesco_resp");

        ResponsavelDAO respDAO = new ResponsavelDAO();

        if (senha_resp.equals(confirma_senha_resp)) {
            erros.add("Os campos de senha e confirmar senha estão diferentes");
        }
        if (!erros.isExisteErros()) {
            Responsavel user = respDAO.getSingle(login_resp);
            if (user != null) {
                erros.add("Login já cadastrado");
            } else {

                Aluno aluno = new Aluno();
                Responsavel responsavel = new Responsavel();
                Endereco end = new Endereco();
                Relatorioparental relatorio = new Relatorioparental();
                
                TurmaDAO turma = new TurmaDAO();
                EnderecoDAO enderecoDao = new EnderecoDAO();
                AlunoDAO alunoDao = new AlunoDAO();
                RelatorioDAO relatorioDao = new RelatorioDAO();
                
               
                
                aluno.setMatricula(matricula);
                aluno.setDeficiencia(deficiencia);
                aluno.setNome(nome);
                aluno.setDataNascimento(nascimento);
                aluno.setTurma(turma.getSingleID(turma_aluno));
                relatorio.setAlunosMatricula(aluno);
                relatorioDao.inserir(relatorio);
              
                end.setCep(cep_resp);
                end.setCidade(cidade_resp);
                end.setNumero(numero_resp);
                end.setRua(endereco_resp);
                end.setUf(UF_resp);

                responsavel.setCpf(cpf_resp);
                responsavel.setEmail(email_resp);
                responsavel.setEnderecoIdendereco(enderecoDao.inserir(end));
                responsavel.setNomecompleto(nome_resp);
                responsavel.setTelefone(telefone_resp);
                responsavel.setParentesco(parentesco);

                responsavel.setLogin(login_resp);
                responsavel.setSenha(senha_resp);
                responsavel.setTipousuarios(3);
                responsavel.setDataNascimento(nascimento_resp);
                responsavel.setRg(rg_resp);
                responsavel.setAlunosMatricula(alunoDao.inserir(aluno));

                respDAO.inserir(responsavel);
               
                erros.add("Aluno Cadastrado");
               
            }
        }
        request.getSession().setAttribute ("mensagens", erros);
         response.sendRedirect("Menu?acao=cadastrar_aluno");
        
    }
        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
            
        
            () {
        return "Short description";
        }// </editor-fold>

    }
