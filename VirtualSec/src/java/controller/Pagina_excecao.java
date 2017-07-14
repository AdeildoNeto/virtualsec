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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author carlo
 */
@WebServlet(name = "Pagina_excecao", urlPatterns = {"/Pagina_excecao"})
public class Pagina_excecao extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processError(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processError(request, response);
    }

    private void processError(HttpServletRequest request,
            HttpServletResponse response) throws IOException {
        // Analyze the servlet exception
        Throwable throwable = (Throwable) request
                .getAttribute("javax.servlet.error.exception");
        Integer statusCode = (Integer) request
                .getAttribute("javax.servlet.error.status_code");
        String servletName = (String) request
                .getAttribute("javax.servlet.error.servlet_name");
        if (servletName == null) {
            servletName = "Unknown";
        }
        String requestUri = (String) request
                .getAttribute("javax.servlet.error.request_uri");
        if (requestUri == null) {
            requestUri = "Unknown";
        }

        // Set response content type
          response.setContentType("text/html");
           PrintWriter out = response.getWriter();
          out.write("<html><head><title>Exception/Error Details</title></head><body>");
        if (statusCode != 500) {
 
                   out.write("<h3>Erro</h3>");
                    out.write("<strong>Código</strong>:" + statusCode + "<br>");
                    out.write("<strong>" + requestUri + "<br>");
                    out.write("<img id=\"imagem_404\" alt=\"Erro\" src=\"imagens/404.jpg\"> <br>");
        } else {

                    out.write("<h3>Detalhes</h3>");
            out.write("<strong>Código</strong>:" + statusCode + "<br>");
                   out.write("<li>" + throwable.getClass().getName() + "</li>");
                   out.write("<li>" + requestUri + "</li>");
                   out.write("</ul>");
        }

           out.write("<br><br>");
           out.write("<a href=\"WEB-INF/index.jsp\">Home Page</a>");
            out.write("</body></html>");
    }

}
