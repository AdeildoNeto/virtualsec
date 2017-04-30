/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Usuario;


/**
 *
 * @author pibicf16
 */
public class Menu extends HttpServlet {

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

        HttpSession session = request.getSession();
        Usuario usuario =  (Usuario) session.getAttribute("tipoUsuario");
        String acao = request.getParameter("acao");
        //System.out.println("esse é o comando " +acao);
        RequestDispatcher rd = null;
        switch (usuario.getTipoUsuario()) {
            case 1:
                switch(acao)
                {
                    case "Home":
                        rd = request.getRequestDispatcher("WEB-INF/view/menu_admin.jsp");
                        rd.forward(request, response);
                        break;
                    case "cadastrar_turma":
                        rd = request.getRequestDispatcher("WEB-INF/view/cadastrar_turmas_admin.jsp");
                        rd.forward(request, response);
                        break;
                    case "alterar_turmas":
                        rd = request.getRequestDispatcher("WEB-INF/view/alterar_turmas_admin.jsp");
                        rd.forward(request, response);
                        break;
                    case "listar_turmas":
                        rd = request.getRequestDispatcher("WEB-INF/view/listar_turmas_admin.jsp");
                        rd.forward(request, response);
                        break;
                    case "cadastrar_prof":
                        rd = request.getRequestDispatcher("WEB-INF/view/cadastrar_professor_admin.jsp");
                        rd.forward(request, response);
                        break;
                    case "alterar_prof":
                        rd = request.getRequestDispatcher("WEB-INF/view/alterar_professor_admin.jsp");
                        rd.forward(request, response);
                        break;
                    case "listar_prof":
                        rd = request.getRequestDispatcher("WEB-INF/view/listar_professor_admin.jsp");
                        rd.forward(request, response);
                        break;
                    case "cadastrar_aluno":
                        rd = request.getRequestDispatcher("WEB-INF/view/cadastrar_aluno_admin.jsp");
                        rd.forward(request, response);
                        break;
                    case "alterar_alunos":
                        rd = request.getRequestDispatcher("WEB-INF/view/alterar_aluno_admin.jsp");
                        rd.forward(request, response);
                        break;
                    case "listar_alunos":
                        rd = request.getRequestDispatcher("WEB-INF/view/listar_alunos_admin.jsp");
                        rd.forward(request, response);
                        break;
                    default:
                    rd = request.getRequestDispatcher("WEB-INF/view/erro.jsp");
                    rd.forward(request, response);
                    break;
                }   break;
            case 2:
                switch(acao)
                {
                    case "Home":
                        rd = request.getRequestDispatcher("WEB-INF/view/menu_professor.jsp");
                        rd.forward(request, response);
                        break;
                    case "listar_turmas_prof":
                        rd = request.getRequestDispatcher("WEB-INF/view/listar_turmas_prof.jsp");
                        rd.forward(request, response);
                        break;
                    default:
                    rd = request.getRequestDispatcher("WEB-INF/view/erro.jsp");
                    rd.forward(request, response);
                    break;
                }
                break;
            case 3:
                switch(acao)
                {
                    case "Home":
                        rd = request.getRequestDispatcher("WEB-INF/view/menu_responsavel.jsp");
                        rd.forward(request, response);
                        break;
                    case "listar_atributos":
                        rd = request.getRequestDispatcher("WEB-INF/view/listar_atributos_resp.jsp");
                        rd.forward(request, response);
                        break;
                    default:
                    rd = request.getRequestDispatcher("WEB-INF/view/erro.jsp");
                    rd.forward(request, response);
                    break;
                }
                break;
            default:
                rd = request.getRequestDispatcher("WEB-INF/view/erro.jsp");
                rd.forward(request, response);
                break;
        }
        
        
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
