/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-07-01 12:09:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\n");
      out.write("<html >\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Flat Login Form 3.0</title>\n");
      out.write("  \n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css\">\n");
      out.write("\n");
      out.write("  <link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900|RobotoDraft:400,100,300,500,700,900'>\n");
      out.write("<link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>\n");
      out.write("\n");
      out.write("      <link rel=\"stylesheet\" href=\"WEB-INF/css/style.css\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  \n");
      out.write("<!-- Form Mixin-->\n");
      out.write("<!-- Input Mixin-->\n");
      out.write("<!-- Button Mixin-->\n");
      out.write("<!-- Pen Title-->\n");
      out.write("<div class=\"pen-title\">\n");
      out.write("  <h1>Flat Login Form</h1><span>Pen <i class='fa fa-paint-brush'></i> + <i class='fa fa-code'></i> by <a href='http://andytran.me'>Andy Tran</a></span>\n");
      out.write("</div>\n");
      out.write("<!-- Form Module-->\n");
      out.write("<div class=\"module form-module\">\n");
      out.write("  <div class=\"toggle\"><i class=\"fa fa-times fa-pencil\"></i>\n");
      out.write("    <div class=\"tooltip\">Click Me</div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form\">\n");
      out.write("    <h2>Login to your account</h2>\n");
      out.write("    <form>\n");
      out.write("      <input type=\"text\" placeholder=\"Username\"/>\n");
      out.write("      <input type=\"password\" placeholder=\"Password\"/>\n");
      out.write("      <button>Login</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form\">\n");
      out.write("    <h2>Create an account</h2>\n");
      out.write("    <form>\n");
      out.write("      <input type=\"text\" placeholder=\"Username\"/>\n");
      out.write("      <input type=\"password\" placeholder=\"Password\"/>\n");
      out.write("      <input type=\"email\" placeholder=\"Email Address\"/>\n");
      out.write("      <input type=\"tel\" placeholder=\"Phone Number\"/>\n");
      out.write("      <button>Register</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"cta\"><a href=\"http://andytran.me\">Forgot your password?</a></div>\n");
      out.write("</div>\n");
      out.write("  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n");
      out.write("<script src='https://codepen.io/andytran/pen/vLmRVp.js'></script>\n");
      out.write("\n");
      out.write("    <script src=\"WEB-INF/js/index.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
