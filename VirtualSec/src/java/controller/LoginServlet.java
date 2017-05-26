/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.UsuarioDAO;
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
 * @author Aldo-pc
 */
public class LoginServlet extends HttpServlet {

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

        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        RequestDispatcher rd = null;

        UsuarioDAO dao = new UsuarioDAO();

        Usuario usuario = dao.getSingle(login);

        if (usuario != null) {

            if (usuario.getSenha().equals(senha)) {
                HttpSession session = request.getSession();
                session.setAttribute("usuarioLogado", usuario);

                switch (usuario.getTipousuarios()) {
                    case 1:

                        rd = request.getRequestDispatcher("WEB-INF/view/menu_admin.jsp");
                        break;

                    case 2:

                        rd = request.getRequestDispatcher("WEB-INF/view/menu_professor.jsp");
                        break;

                    case 3:

                        rd = request.getRequestDispatcher("WEB-INF/view/menu_responsavel.jsp");
                        break;

                }

            } else {
                rd = request.getRequestDispatcher("WEB-INF/view/erro.jsp");
            }
        } else {
            rd = request.getRequestDispatcher("WEB-INF/view/erro.jsp");

        }

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
