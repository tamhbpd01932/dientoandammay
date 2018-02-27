package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class slide_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <div id=\"da-slider\" class=\"da-slider\">\n");
      out.write("\t\t\t\t<div class=\"da-slide\">\n");
      out.write("\t\t\t\t\t<h2>welcome to aditii</h2>\n");
      out.write("\t\t\t\t\t<p>When she reached the first hills of the Italic Mountains, she had a last view back on the skyline of her hometown Bookmarksgrove, the headline of Alphabet Village and the subline of her own road, the Line Lane.</p>\n");
      out.write("\t\t\t\t\t<a href=\"details.html\" class=\"da-link\">shop now</a>\n");
      out.write("\t\t\t\t\t<div class=\"da-img\"><img src=\"images/slider1.png\" alt=\"image01\" /></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"da-slide\">\n");
      out.write("\t\t\t\t\t<h2>Easy management</h2>\n");
      out.write("\t\t\t\t\t<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean.</p>\n");
      out.write("\t\t\t\t\t<a href=\"details.html\" class=\"da-link\">shop now</a>\n");
      out.write("\t\t\t\t\t<div class=\"da-img\"><img src=\"images/slider2.png\" alt=\"image01\" /></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"da-slide\">\n");
      out.write("\t\t\t\t\t<h2>Revolution</h2>\n");
      out.write("\t\t\t\t\t<p>A small river named Duden flows by their place and supplies it with the necessary regelialia. It is a paradisematic country, in which roasted parts of sentences fly into your mouth.</p>\n");
      out.write("\t\t\t\t\t<a href=\"details.html\" class=\"da-link\">shop now</a>\n");
      out.write("\t\t\t\t\t<div class=\"da-img\"><img src=\"images/slider3.png\" alt=\"image01\" /></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"da-slide\">\n");
      out.write("\t\t\t\t\t<h2>Quality Control</h2>\n");
      out.write("\t\t\t\t\t<p>Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life One day however a small line of blind text by the name of Lorem Ipsum decided to leave for the far World of Grammar.</p>\n");
      out.write("\t\t\t\t\t<a href=\"details.html\" class=\"da-link\">shop now</a>\n");
      out.write("\t\t\t\t\t<div class=\"da-img\"><img src=\"images/slider4.png\" alt=\"image01\" /></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<nav class=\"da-arrows\">\n");
      out.write("\t\t\t\t\t<span class=\"da-arrows-prev\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"da-arrows-next\"></span>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</div>\n");
      out.write("        </div>\n");
      out.write("<div class=\"wrap\">\n");
      out.write("<!----start-img-cursual---->\n");
      out.write("\t<div id=\"owl-demo\" class=\"owl-carousel\">\n");
      out.write("\t\t<div class=\"item\" onclick=\"location.href='details.html';\">\n");
      out.write("\t\t\t<div class=\"cau_left\">\n");
      out.write("\t\t\t\t<img class=\"lazyOwl\" data-src=\"images/c1.jpg\" alt=\"Lazy Owl Image\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"cau_left\">\n");
      out.write("\t\t\t\t<h4><a href=\"details.html\">branded shoes</a></h4>\n");
      out.write("\t\t\t\t<a href=\"details.html\" class=\"btn\">shop</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\n");
      out.write("\t\t<div class=\"item\" onclick=\"location.href='details.html';\">\n");
      out.write("\t\t\t<div class=\"cau_left\">\n");
      out.write("\t\t\t\t<img class=\"lazyOwl\" data-src=\"images/c2.jpg\" alt=\"Lazy Owl Image\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"cau_left\">\n");
      out.write("\t\t\t\t<h4><a href=\"details.html\">branded tees</a></h4>\n");
      out.write("\t\t\t\t<a href=\"details.html\" class=\"btn\">shop</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\n");
      out.write("\t\t<div class=\"item\" onclick=\"location.href='details.html';\">\n");
      out.write("\t\t\t<div class=\"cau_left\">\n");
      out.write("\t\t\t\t<img class=\"lazyOwl\" data-src=\"images/c3.jpg\" alt=\"Lazy Owl Image\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"cau_left\">\n");
      out.write("\t\t\t\t<h4><a href=\"details.html\">branded jeens</a></h4>\n");
      out.write("\t\t\t\t<a href=\"details.html\" class=\"btn\">shop</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\n");
      out.write("\t\t<div class=\"item\" onclick=\"location.href='details.html';\">\n");
      out.write("\t\t\t<div class=\"cau_left\">\n");
      out.write("\t\t\t\t<img class=\"lazyOwl\" data-src=\"images/c2.jpg\" alt=\"Lazy Owl Image\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"cau_left\">\n");
      out.write("\t\t\t\t<h4><a href=\"details.html\">branded tees</a></h4>\n");
      out.write("\t\t\t\t<a href=\"details.html\" class=\"btn\">shop</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\n");
      out.write("\t\t<div class=\"item\" onclick=\"location.href='details.html';\">\n");
      out.write("\t\t\t<div class=\"cau_left\">\n");
      out.write("\t\t\t\t<img class=\"lazyOwl\" data-src=\"images/c1.jpg\" alt=\"Lazy Owl Image\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"cau_left\">\n");
      out.write("\t\t\t\t<h4><a href=\"details.html\">branded shoes</a></h4>\n");
      out.write("\t\t\t\t<a href=\"details.html\" class=\"btn\">shop</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\n");
      out.write("\t\t<div class=\"item\" onclick=\"location.href='details.html';\">\n");
      out.write("\t\t\t<div class=\"cau_left\">\n");
      out.write("\t\t\t\t<img class=\"lazyOwl\" data-src=\"images/c2.jpg\" alt=\"Lazy Owl Image\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"cau_left\">\n");
      out.write("\t\t\t\t<h4><a href=\"details.html\">branded tees</a></h4>\n");
      out.write("\t\t\t\t<a href=\"details.html\" class=\"btn\">shop</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\n");
      out.write("\t\t<div class=\"item\" onclick=\"location.href='details.html';\">\n");
      out.write("\t\t\t<div class=\"cau_left\">\n");
      out.write("\t\t\t\t<img class=\"lazyOwl\" data-src=\"images/c3.jpg\" alt=\"Lazy Owl Image\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"cau_left\">\n");
      out.write("\t\t\t\t<h4><a href=\"details.html\">branded jeens</a></h4>\n");
      out.write("\t\t\t\t<a href=\"details.html\" class=\"btn\">shop</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\n");
      out.write("\t</div>\n");
      out.write("\t<!----//End-img-cursual---->\n");
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
