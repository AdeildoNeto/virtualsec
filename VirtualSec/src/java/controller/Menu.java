/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.AlunoDAO;
import DAO.ProfessorDAO;
import DAO.ResponsavelDAO;
import DAO.TurmaDAO;
import java.io.IOException;
import java.util.List;
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

        Usuario usuario = (Usuario) request.getSession().getAttribute("usuarioLogado");

        String acao = request.getParameter("acao");

        RequestDispatcher rd = null;
        switch (usuario.getTipousuarios()) {
            case 1:
                Erro erros = new Erro();
                ProfessorDAO ProfDao = new ProfessorDAO();
                TurmaDAO TurmaDao = new TurmaDAO();
                AlunoDAO AlunoDao = new AlunoDAO();
                ResponsavelDAO RespDao = new ResponsavelDAO();
                switch (acao) {
                    case "Home":
                        rd = request.getRequestDispatcher("WEB-INF/view/menu_admin.jsp");
                        rd.forward(request, response);
                        break;
                    case "cadastrar_turma":
                        Object confir_cadastro_turma = request.getSession().getAttribute("mensagens");
                        request.setAttribute("mensagens", confir_cadastro_turma);
                        rd = request.getRequestDispatcher("WEB-INF/view/cadastrar_turmas_admin.jsp");
                        rd.forward(request, response);
                        request.getSession().setAttribute("mensagens", null);
                        break;
                    case "alterar_turmas":
                        Object confir_excluir_Turma = request.getSession().getAttribute("mensagens");
                        request.setAttribute("mensagens", confir_excluir_Turma);
                        request.setAttribute("listaTurma", TurmaDao.listar());
                        rd = request.getRequestDispatcher("WEB-INF/view/alterar_turmas_admin.jsp");
                        rd.forward(request, response);
                        request.getSession().setAttribute("mensagens", null);
                        break;
                    case "editar_turma":
                        Integer codigo_turma = Integer.parseInt(request.getParameter("codigo"));
                        List listEditaTurma = TurmaDao.getSingleList(codigo_turma);
                        if (listEditaTurma.isEmpty()) {
                            erros.add("Erro ao tentar editar turma");
                            request.setAttribute("mensagens", erros);
                            rd = request.getRequestDispatcher("WEB-INF/view/alterar_turmas_admin.jsp");
                        } else {
                            request.getSession().setAttribute("turma_editada", TurmaDao.getSingleID(codigo_turma));
                            request.setAttribute("turmaEditar", listEditaTurma);
                            rd = request.getRequestDispatcher("WEB-INF/view/editar_turma_admin.jsp");
                        }
                        rd.forward(request, response);
                        break;
                    case "listar_turmas":
                        request.setAttribute("listaTurma", TurmaDao.listar());
                        rd = request.getRequestDispatcher("WEB-INF/view/listar_turmas_admin.jsp");
                        rd.forward(request, response);
                        break;
                    case "cadastrar_prof":
                        Object confir_cadastro_prof = request.getSession().getAttribute("mensagens");
                        request.setAttribute("mensagens", confir_cadastro_prof);
                        request.setAttribute("listaTurmas", TurmaDao.listar());
                        rd = request.getRequestDispatcher("WEB-INF/view/cadastrar_professor_admin.jsp");
                        rd.forward(request, response);
                        request.getSession().setAttribute("mensagens", null);
                        break;
                    case "alterar_prof":
                        Object confir_excluir_Prof = request.getSession().getAttribute("mensagens");
                        request.setAttribute("mensagens", confir_excluir_Prof);
                        request.setAttribute("listaProf", ProfDao.listar());
                        rd = request.getRequestDispatcher("WEB-INF/view/alterar_professor_admin.jsp");
                        rd.forward(request, response);
                        request.getSession().setAttribute("mensagens", null);
                        break;
                    case "listar_prof":

                        request.setAttribute("listaProf", ProfDao.listar());
                        rd = request.getRequestDispatcher("WEB-INF/view/listar_professor_admin.jsp");
                        rd.forward(request, response);
                        break;
                    case "cadastrar_aluno":
                        Object confir_cadastro_aluno = request.getSession().getAttribute("mensagens");
                        request.setAttribute("mensagens", confir_cadastro_aluno);
                        request.setAttribute("listaTurmas", TurmaDao.listar());
                        rd = request.getRequestDispatcher("WEB-INF/view/cadastrar_aluno_admin.jsp");
                        rd.forward(request, response);
                        request.getSession().setAttribute("mensagens", null);
                        break;
                    case "alterar_alunos":
                        Object confir_excluir_aluno = request.getSession().getAttribute("mensagens");
                        request.setAttribute("mensagens", confir_excluir_aluno);
                        request.setAttribute("listaTurmas", TurmaDao.listar());
                        rd = request.getRequestDispatcher("WEB-INF/view/alterar_aluno_admin.jsp");
                        rd.forward(request, response);
                        request.getSession().setAttribute("mensagens", null);
                        break;
                    case "listar_alunos":
                        request.setAttribute("listaTurmas", TurmaDao.listar());
                        rd = request.getRequestDispatcher("WEB-INF/view/listar_alunos_admin.jsp");
                        rd.forward(request, response);
                        break;
                }
                break;
            case 2:
                ProfessorDAO ProfDao1 = new ProfessorDAO();
                TurmaDAO TurmaDao1 = new TurmaDAO();
                AlunoDAO AlunoDao1 = new AlunoDAO();
                switch (acao) {
                    case "Home":
                        rd = request.getRequestDispatcher("WEB-INF/view/menu_professor.jsp");
                        rd.forward(request, response);
                        break;
                    case "listar_turmas_prof":

                        rd = request.getRequestDispatcher("ListarTurmaProfServlet");
                        rd.forward(request, response);
                        break;
                    case "ListarNotaServlet":

                        rd = request.getRequestDispatcher("ListarNotaServlet");
                        rd.forward(request, response);
                        break;
                }
                break;
            case 3:
                switch (acao) {
                    case "Home":
                        rd = request.getRequestDispatcher("WEB-INF/view/menu_responsavel.jsp");
                        rd.forward(request, response);
                        break;
                    case "listar_atributos":
                        rd = request.getRequestDispatcher("ListarAtributoRespServlet");
                        rd.forward(request, response);
                        break;
                }
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
