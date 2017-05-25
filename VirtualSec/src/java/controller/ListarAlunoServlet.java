/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model_antigo.Aluno;
import model_antigo.Responsavel;

/**
 *
 * @author aldo_neto
 */
public class ListarAlunoServlet extends HttpServlet {

    List lista = new ArrayList();
    boolean bloqueio = false;
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
    
     
        //List lista = new ArrayList();
        Aluno aldenio = new Aluno();
        //Aluno aldo = new Aluno();
        Responsavel aldenioPai = new Responsavel();
        
        
        if(bloqueio == false)
       {
        aldenioPai.setNome("AldenioPai");
        aldenioPai.setNascimento("20/03/1969");
        aldenioPai.setEmail("abc@gmail.com");
        aldenioPai.setTelefone(99999999);
        aldenioPai.setEndereco("Nazaré");
        aldenioPai.setCPF("999.999.999-99");
        aldenioPai.setRG("111111111");
        aldenioPai.setParentesco("Pai");
        
        aldenio.setCodigo(0);
        aldenio.setNome("Aldenio");
        aldenio.setNascimento("20");
        aldenio.setEndereço("Nazaré");
        aldenio.setMatricula("20152y6-rc0019");
        aldenio.setDeficiencia(false);
        aldenio.setResponsavel(aldenioPai);
        aldenio.setNascimento("11/03/1991");
        
        /*aldo.setNome("Aldo");
        aldo.setNascimento("19");
        aldo.setEndereço("Encruzilhada");
        aldo.setDeficiencia(false);
        aldo.setResponsavel(aldenioPai);
        aldo.setNascimento("18/12/1997");*/
        
        lista.add(aldenio);
        //lista.add(aldo);
        bloqueio = true;
       }
        ServletContext context = request.getSession().getServletContext();
        context.setAttribute("aluno", lista);
        Object aluno = context.getAttribute("aluno");
        request.setAttribute("aluno", aluno);
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/listar_alunos_admin.jsp");
        rd.forward(request, response);
    
    
    
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
        
        
        ServletContext context = request.getSession().getServletContext();

        Aluno alunoCadastrado = (Aluno) request.getAttribute("alunoCadastrado");
        
        lista.add(alunoCadastrado);
        
        context.setAttribute("aluno", lista);
        Object aluno = context.getAttribute("aluno");
        request.setAttribute("aluno", aluno);
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/listar_alunos_admin.jsp");
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
