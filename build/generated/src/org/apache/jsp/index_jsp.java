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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("<title>Free Aditii Website Template | Home :: w3layouts</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:400,700' rel='stylesheet' type='text/css'>\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("<!-- start slider -->\t\t\n");
      out.write("\t<link href=\"css/slider.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/modernizr.custom.28468.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.cslider.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(function() {\n");
      out.write("\t\t\t$('#da-slider').cslider();\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\t\t<!-- Owl Carousel Assets -->\n");
      out.write("\t\t<link href=\"css/owl.carousel.css\" rel=\"stylesheet\">\n");
      out.write("\t\t     <!-- Owl Carousel Assets -->\n");
      out.write("\t\t    <!-- Prettify -->\n");
      out.write("\t\t    <script src=\"js/owl.carousel.js\"></script>\n");
      out.write("\t\t        <script>\n");
      out.write("\t\t    $(document).ready(function() {\n");
      out.write("\t\t\n");
      out.write("\t\t      $(\"#owl-demo\").owlCarousel({\n");
      out.write("\t\t        items : 4,\n");
      out.write("\t\t        lazyLoad : true,\n");
      out.write("\t\t        autoPlay : true,\n");
      out.write("\t\t        navigation : true,\n");
      out.write("\t\t\t    navigationText : [\"\",\"\"],\n");
      out.write("\t\t\t    rewindNav : false,\n");
      out.write("\t\t\t    scrollPerPage : false,\n");
      out.write("\t\t\t    pagination : false,\n");
      out.write("    \t\t\tpaginationNumbers: false,\n");
      out.write("\t\t      });\n");
      out.write("\t\t\n");
      out.write("\t\t    });\n");
      out.write("\t\t    </script>\n");
      out.write("\t\t   <!-- //Owl Carousel Assets -->\n");
      out.write("\t\t<!-- start top_js_button -->\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("\t\t   <script type=\"text/javascript\">\n");
      out.write("\t\t\t\tjQuery(document).ready(function($) {\n");
      out.write("\t\t\t\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\t\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "slide.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "content.jsp", out, false);
      out.write("\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
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
