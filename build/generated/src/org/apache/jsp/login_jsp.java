package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<style>\n");
      out.write("    .loginReq{font-size: 20px; color: red;margin-top: 40px;}\n");
      out.write("    #login{background: #3c6ab7; border-radius: 5px 50px; height: 30px; width: 75px;}\n");
      out.write("</style>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write('\n');
      out.print("<span class=loginReq><center>You need to Login to Proceed</center></span>");
      out.write("\n");
      out.write("<br><br>\n");
      out.write("<center><form action=\"Login\">\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <td>Enter Email:</td>\n");
      out.write("        \n");
      out.write("            <td>&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"mail\"></td>\n");
      out.write("        </tr><tr><td></td><td></td></tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Enter Password:</td>\n");
      out.write("            <td>&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"password\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("        <table><tr><td><input type=\"submit\" value=\"Login\" id=\"login\"></td></tr></table>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("</form>\n");
      out.write("</center>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
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
