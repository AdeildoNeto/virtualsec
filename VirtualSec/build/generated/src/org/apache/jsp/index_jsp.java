package org.apache.jsp;

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

      out.write("\n");
      out.write("//\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>VirtualSec</title>\n");
      out.write("\t\t<meta charset=\"utf-8\" />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("\t\t<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<!-- Wrapper -->\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div id=\"wrapper\" class=\"col-sm-12\">\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Intro -->\n");
      out.write("\t\t\t\t\t<section id=\"intro\" class=\"\">\n");
      out.write("\t\t\t\t\t\t<div id=\"teste\" class=\"col-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t<img id=\"imagem_titulo\" alt=\"logo VirtualSec\" src=\"imagens/LOGO1.png\" >\n");
      out.write("\t\t\t\t\t\t\t<h1 id=\"titulo_login\">VirtualSec</h1>\n");
      out.write("\t\t\t\t\t\t\t<p id=\"titulo_login\">Gerenciamento acadêmico</p>\n");
      out.write("\t\t\t\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t\t\t\t\t<form method=\"post\" action=\"inicial.html\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"control-label\" id=\"nomeCaixa\">Login:</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" name=\"login\" id=\"login\" value=\"\" placeholder=\"Insira seu login\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"control-label\" id=\"nomeCaixa\">Senha:</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"password\" name=\"login\" id=\"login\" value=\"\" placeholder=\"Insira sua senha\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"submit\" value=\"Entrar\" class=\"btn btn-default\" /></li>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<footer id=\"footer\" class=\"col-sm-12\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t\t\t\t\t<p id=info><span ></span>&copy; VirtualSec. All rights reserved.</p>\n");
      out.write("          \t\t\t\t\t\t<p id=info><span ></span>WEB 2</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</footer>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t<!-- Scripts -->\n");
      out.write("\t\t<!--\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.scrollex.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.scrolly.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/skel.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/util.js\"></script>\n");
      out.write("\t\t\t[if lte IE 8]><script src=\"assets/js/ie/respond.min.js\"></script><![endif]-->\n");
      out.write("\n");
      out.write("\t\t\t<script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("\t\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("  \t\t\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\t</body>\n");
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
