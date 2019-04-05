package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<style>\n");
      out.write("    #heading{font-style: oblique; font-size-adjust: 16px;}\n");
      out.write("</style>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("<br><br><center><span id=\"heading\">Registration Form:</span><br>\n");
      out.write("    <form method=\"post\" action=\"Reg\">\n");
      out.write("    <table>\n");
      out.write("        <tr><th>Enter First Name:</th><td><input type=\"text\" name=\"fname\"></td></tr>\n");
      out.write("        <tr><th>Enter Surname Name:</th><td><input type=\"text\" name=\"lname\"></td></tr>\n");
      out.write("        <tr><th>Enter Email:</th><td><input type=\"text\" name=\"email\"></td></tr>\n");
      out.write("        <tr><th>Enter Phone number:</th><td><input type=\"text\" name=\"phone\"></td></tr>\n");
      out.write("        <tr><th>Enter Password:</th><td><input type=\"text\" id=\"password\" name=\"password\"></td></tr>\n");
      out.write("        <tr><th>Enter Type:</th><td><table><tr><th><input type=\"radio\" name=\"typee\" value=\"seller\">&nbsp;Seller</th><th><input type=\"radio\" name=\"typee\" value=\"buyer\">&nbsp;Buyer</th></tr></table></td></tr>\n");
      out.write("        <tr><th>Enter Retype Password:</th><td><input type=\"text\" id=\"confirm_password\" onchange=\"check_pass();\"></td></tr>\n");
      out.write("        <!--<tr><th>Enter :</th><td><input type=\"text\" name=\"email\"></td></tr>-->\n");
      out.write("        <tr><th></th><td><input type=\"submit\" id=\"submit\" disabled=\"true\"></td></tr>\n");
      out.write("    </table>\n");
      out.write("</form></center>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("<script>\n");
      out.write("    function check_pass() {\n");
      out.write("    if (document.getElementById('password').value ===\n");
      out.write("            document.getElementById('confirm_password').value) {\n");
      out.write("        document.getElementById('submit').disabled = false;\n");
      out.write("    } else {\n");
      out.write("        document.getElementById('submit').disabled = true;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script>");
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
