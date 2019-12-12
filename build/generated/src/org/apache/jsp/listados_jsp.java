package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class listados_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 align=\"center\">Listado de Usuarios</h1>\n");
      out.write("        <table border=\"1\" width=\"600\" align=\"center\">\n");
      out.write("            <tr bgcolor=\"skyblue\">\n");
      out.write("                <th colspan=\"5\"> Mantenimiento de Usuarios</th>\n");
      out.write("                <th> \n");
      out.write("                    <a href=\"nuevo.jsp\">\n");
      out.write("                        <img src=\"iconos/li.jpg\" width=\"100\"></th>\n");
      out.write("                    </a>\n");
      out.write("            </tr>\n");
      out.write("            <tr bgcolor=\"skyblue\">\n");
      out.write("                <th>Codigo</th><th>Nombre</th>\n");
      out.write("                <th>Edad</th><th>Sexo</th>\n");
      out.write("                <th>Password</th>\n");
      out.write("                <th>Acciones</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                Connection cnx = null;
                Statement sta = null;
                ResultSet rs = null;
                //inicializar driver y cadena de conexion
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    cnx = DriverManager.getConnection("jdbc:mysql://localhost/cursojsp?user=root&password=");

                    //inicializar la consulta por statement
                    sta = cnx.createStatement();
                    //ejecutar sentencia sql
                    rs = sta.executeQuery("select * from usuarios");

                    //guardar datos en tabla
                    while (rs.next()) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <th>");
      out.print(rs.getString(1));
      out.write("</th>\n");
      out.write("                <th>");
      out.print(rs.getString(2));
      out.write("</th>\n");
      out.write("                <th>");
      out.print(rs.getString(3));
      out.write("</th>\n");
      out.write("                <th>");
      out.print(rs.getString(4));
      out.write("</th>\n");
      out.write("                <th>");
      out.print(rs.getString(5));
      out.write("</th>\n");
      out.write("                <th>\n");
      out.write("                    <img src=\"iconos/editar.jpg\" width=\"50\">\n");
      out.write("                    <img src=\"iconos/eliminar.png\" width=\"50\">\n");
      out.write("                </th>\n");
      out.write("            </tr>   \n");
      out.write("            ");

                    }
                    //cerrar conexion
                    sta.close();
                    rs.close();
                    cnx.close();
                } catch (Exception e) {
                }

            
      out.write("\n");
      out.write("        </table>\n");
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
