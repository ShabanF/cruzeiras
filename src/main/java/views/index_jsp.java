package views;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n\t<title>Cruzeiras</title>\n\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n\n\t<link href=\"//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/css/bootstrap-combined.min.css\" rel=\"stylesheet\" media=\"screen\">\n\n\t<style type=\"text/css\">\n      body {\n        padding-top: 40px;\n        padding-bottom: 40px;\n        background-color: #f5f5f5;\n      }\n    </style>\n</head>\n<body>\n<div class=\"container\">\n\n<form class=\"form-horizontal\" method=\"post\" action=\"/home\">\n\t<div class=\"control-group\">\n\t  <label class=\"control-label\" for=\"inputEmail\">Email</label>\n\t  <div class=\"controls\">\n\t    <input type=\"text\" id=\"inputEmail\" name=\"email\" placeholder=\"Email\">\n\t  </div>\n\t</div>\n\t<div class=\"control-group\">\n\t  <label class=\"control-label\" for=\"inputPassword\">Password</label>\n\t  <div class=\"controls\">\n\t    <input type=\"password\" id=\"inputPassword\" name=\"password\" placeholder=\"Password\">\n\t  </div>\n\t</div>\n\t<div class=\"control-group\">\n\t  <div class=\"controls\">\n\t    <label class=\"checkbox\">\n");
      out.write("\t      <input type=\"checkbox\"> Remember me\n\t    </label>\n\t    <button type=\"submit\" class=\"btn\">Sign in</button>\n\t  </div>\n   </div>\n</form>\n\n</div>\n\n</body>\n</html>");
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
