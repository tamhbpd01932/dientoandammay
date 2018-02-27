package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div class=\"header_bg\">\n");
      out.write("<div class=\"wrap\">\n");
      out.write("\t<div class=\"header\">\n");
      out.write("\t\t<div class=\"logo\">\n");
      out.write("\t\t\t<a href=\"index.html\"><img src=\"images/logo.png\" alt=\"\"/> </a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"h_icon\">\n");
      out.write("\t\t<ul class=\"icon1 sub-icon1\">\n");
      out.write("\t\t\t<li><a class=\"active-icon c1\" href=\"#\"><i>$300</i></a>\n");
      out.write("\t\t\t\t<ul class=\"sub-icon1 list\">\n");
      out.write("\t\t\t\t\t<li><h3>shopping cart empty</h3><a href=\"\"></a></li>\n");
      out.write("\t\t\t\t\t<li><p>if items in your wishlit are missing, <a href=\"contact.html\">contact us</a> to view them</p></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"h_search\">\n");
      out.write("    \t\t<form>\n");
      out.write("    \t\t\t<input type=\"text\" value=\"\">\n");
      out.write("    \t\t\t<input type=\"submit\" value=\"\">\n");
      out.write("    \t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"clear\"></div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"header_btm\">\n");
      out.write("<div class=\"wrap\">\n");
      out.write("\t<div class=\"header_sub\">\n");
      out.write("\t\t<div class=\"h_menu\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"index.html\">Home</a></li> |\n");
      out.write("\t\t\t\t<li><a href=\"sale.html\">sale</a></li> |\n");
      out.write("\t\t\t\t<li><a href=\"handbags.html\">handbags</a></li> |\n");
      out.write("\t\t\t\t<li><a href=\"accessories.html\">accessories</a></li> |\n");
      out.write("\t\t\t\t<li><a href=\"wallets.html\">wallets</a></li> |\n");
      out.write("\t\t\t\t<li><a href=\"sale.html\">sale</a></li> |\n");
      out.write("\t\t\t\t<li><a href=\"index.html\">mens store</a></li> |\n");
      out.write("\t\t\t\t<li><a href=\"shoes.html\">shoes</a></li> |\n");
      out.write("\t\t\t\t<li><a href=\"sale.html\">vintage</a></li> |\n");
      out.write("\t\t\t\t<li><a href=\"service.html\">services</a></li> |\n");
      out.write("\t\t\t\t<li><a href=\"contact.html\">Contact us</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"top-nav\">\n");
      out.write("\t          <nav class=\"nav\">\t        \t\n");
      out.write("\t    \t    <a href=\"#\" id=\"w3-menu-trigger\"> </a>\n");
      out.write("\t                  <ul class=\"nav-list\" style=\"\">\n");
      out.write("\t            \t        <li class=\"nav-item\"><a class=\"active\" href=\"index.html\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"sale.html\">Sale</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"handbags.html\">Handbags</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"accessories.html\">Accessories</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"shoes.html\">Shoes</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"service.html\">Services</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"contact.html\">Contact</a></li>\n");
      out.write("\t                 </ul>\n");
      out.write("\t           </nav>\n");
      out.write("\t             <div class=\"search_box\">\n");
      out.write("\t\t\t\t<form>\n");
      out.write("\t\t\t\t   <input type=\"text\" value=\"Search\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Search';}\"><input type=\"submit\" value=\"\">\n");
      out.write("\t\t\t    </form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t          <div class=\"clear\"> </div>\n");
      out.write("\t          <script src=\"js/responsive.menu.js\"></script>\n");
      out.write("         </div>\t\t  \n");
      out.write("\t<div class=\"clear\"></div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
