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
import model.Professor;

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
    
    public Professor fazerCadastro(int codigo, String nome,String nascimento, String endereco, String telefone, String
            email, String cpf, String rg, String disciplina){
         Professor profCadastrado = new Professor();
         
         
         profCadastrado.setCodigo(codigo);
         profCadastrado.setNome(nome);
         profCadastrado.setCPF(cpf);
         profCadastrado.setDisciplina(disciplina);
         profCadastrado.setEmail(email);
         profCadastrado.setEndereco(endereco);
         profCadastrado.setNascimento(nascimento);
         profCadastrado.setRG(rg);
         profCadastrado.setTelefone(Integer.parseInt(telefone));
                 
         
          return profCadastrado;
     }
    
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
        String nome = request.getParameter("nome");
        String nascimento = request.getParameter("data_nascimento");
        String endereco = request.getParameter("endereco");
        String telefone = request.getParameter("telefone");
        String email = request.getParameter("email");
        String cpf = request.getParameter("cpf");
        String rg = request.getParameter("rg");
        String disciplina = request.getParameter("disciplina");
        

                
        sc.setAttribute("ProfCadastrado", fazerCadastro(codigo, nome, nascimento, endereco, telefone, email, cpf, rg, disciplina));
         Object profCadastrado = sc.getAttribute("ProfCadastrado");
        request.setAttribute("profCadastrado", profCadastrado);
        
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
