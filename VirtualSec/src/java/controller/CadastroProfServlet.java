/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.EnderecoDAO;
import DAO.PessoaDAO;
import DAO.ProfessorDAO;
import DAO.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Endereco;
import model.Pessoa;
import model.Professores;
import model.Usuario;

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
    
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        String nome = request.getParameter("nome");
        String nascimento = request.getParameter("data_nascimento");
        String endereco = request.getParameter("endereco");
        int telefone = Integer.parseInt(request.getParameter("telefone"));
        String email = request.getParameter("email");
        int cpf = Integer.parseInt(request.getParameter("cpf"));
        String rg = request.getParameter("rg");
        String disciplina = request.getParameter("disciplina");
        String login = "prof";
        String senha = "prof";
        
        Professores profCadastrado = new Professores();
        Pessoa pessoa = new Pessoa(); 
        Endereco end = new Endereco();
        
        PessoaDAO pessoaDao = new PessoaDAO();
        EnderecoDAO enderecoDao = new EnderecoDAO();
        UsuarioDAO usuarioDao = new UsuarioDAO();
        ProfessorDAO professorDao = new ProfessorDAO();
         
       // end.setCep(cep);
       // end.setCidade(cidade);
       // end.setNumero(numero);
        end.setRua(endereco);
       // end.setUf(UF);
        enderecoDao.inserir(end);
        
        pessoa.setCpf(cpf);
         pessoa.setEmail(email);
         pessoa.setEnderecoIdendereco(end);
         pessoa.setIdpessoas(2);
         pessoa.setNomecompleto(nome);
         pessoa.setTelefone(telefone);
        pessoaDao.inserir(pessoa);
        
        Usuario user = new Usuario();
        user.setLogin(login);
        user.setPessoasIdpessoas(pessoa);
        user.setSenha(senha);
        user.setTipousuarios(2);
        Usuario userr  = usuarioDao.inserir(user);
        
         profCadastrado.setIdprofessores(codigo);
         profCadastrado.setDisciplina(disciplina);
         profCadastrado.setUsuariosIdusuarios(user);
         professorDao.inserir(profCadastrado);
         
         
                 
                
       
        
        RequestDispatcher rd = request.getRequestDispatcher("ListarProfServlet");
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
