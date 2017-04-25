package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>VirtualSec</title>\r\n");
      out.write("\t\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("\t\t<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t<div id=\"wrapper\" class=\"\">\r\n");
      out.write("            <div id=\"logo\" class=\"\">\r\n");
      out.write("                <img id=\"imagem_titulo\" alt=\"logo VirtualSec\" src=\"imagens/LOGO1.png\" >\r\n");
      out.write("                <h1 id=\"titulo_login\">VirtualSec</h1>\r\n");
      out.write("                <p id=\"titulo_login\">Gerenciamento acadêmico</p>\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t  \t<div class=\"container-fluid\">\r\n");
      out.write("\t\t    \t<div class=\"row\">\r\n");
      out.write("\t\t      \t\t<nav class=\"navbar navbar-default\">\r\n");
      out.write("\t\t        \t\t<div class=\"navbar-reader\">\r\n");
      out.write("\t\t          \t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navBar\">\r\n");
      out.write("\t\t            \t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t            \t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t            \t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t          \t\t\t</button>\r\n");
      out.write("\t\t        \t\t</div>\r\n");
      out.write("\t\t        \t\t<div class=\"collapse navbar-collapse\" id=\"navBar\">\r\n");
      out.write("\t\t          \t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t            <li id=\"opcaoNav\"><a href=\"index.html\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t            <li id=\"opcaoNav\"><a href=\"#\">Atributos</a></li>\r\n");
      out.write("\t\t\t\t\t        </ul>\r\n");
      out.write("\t\t        \t\t</div>\r\n");
      out.write("\t\t      \t\t</nav>\r\n");
      out.write("\t\t    \t</div>\r\n");
      out.write("\t\t  \t</div>  \r\n");
      out.write("\t\t  \t<div id=\"conteudo\">\r\n");
      out.write("\t\t  \t\t\r\n");
      out.write("\r\n");
      out.write("\t\t  \t</div>          \r\n");
      out.write("            <footer id=\"footer\" class=\"\">\r\n");
      out.write("                <div class=\"inner\">\r\n");
      out.write("                    <p id=info><span ></span>&copy; VirtualSec. All rights reserved.</p>\r\n");
      out.write("                    <p id=info><span ></span>WEB 2</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("  \t\t\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
