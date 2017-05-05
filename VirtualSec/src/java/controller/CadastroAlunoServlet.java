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
import model.Aluno;
import model.Responsavel;
import model.Turma;

/**
 *
 * @author aldo_neto
 */
public class CadastroAlunoServlet extends HttpServlet {
    public Aluno fazerCadastro(int codigo, String nome,String nascimento, String matricula, String endereco){
         Aluno alunoCadastrado = new Aluno();
         
         alunoCadastrado.setCodigo(codigo);
         alunoCadastrado.setNome(nome);
         alunoCadastrado.setNascimento(nascimento);
        // alunoCadastrado.setTurma(turma);
         alunoCadastrado.setMatricula(matricula);
         alunoCadastrado.setEndereço(endereco);
       //  alunoCadastrado.setDeficiencia(deficiencia);
        // alunoCadastrado.setResponsavel(responsavel);
          return alunoCadastrado;
     }
    
   

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
        String nascimento = request.getParameter("nascimento");
        //String turma = request.getParameter("turma");
        String matricula = request.getParameter("matricula");
        String endereco = request.getParameter("endereco");
        //String deficiencia = request.getParameter("deficiencia");
       // String responsavel = request.getParameter("responsavel");

        

                
        sc.setAttribute("AlunoCadastrado", fazerCadastro(codigo, nome, nascimento, matricula, endereco));
         Object alunoCadastrado = sc.getAttribute("AlunoCadastrado");
        request.setAttribute("alunoCadastrado", alunoCadastrado);
        
        RequestDispatcher rd = request.getRequestDispatcher("ListarAlunoServlet");
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
