<%-- 
    Document   : listados
    Created on : 9/12/2019, 01:59:24 AM
    Author     : USUARIO
--%>


<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center">Listado de Usuarios</h1>
        <table border="1" width="600" align="center">
            <tr bgcolor="skyblue">
                <th colspan="5"> Mantenimiento de Usuarios</th>
                <th> 
                    <a href="nuevo.jsp">
                        <img src="iconos/li.jpg" width="100"></th>
                    </a>
            </tr>
            <tr bgcolor="skyblue">
                <th>Codigo</th><th>Nombre</th>
                <th>Edad</th><th>Sexo</th>
                <th>Password</th>
                <th>Acciones</th>
            </tr>
            <%
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
            %>
            <tr>
                <th><%=rs.getString(1)%></th>
                <th><%=rs.getString(2)%></th>
                <th><%=rs.getString(3)%></th>
                <th><%=rs.getString(4)%></th>
                <th><%=rs.getString(5)%></th>
                <th>
                    <img src="iconos/editar.jpg" width="50">
                    <img src="iconos/eliminar.png" width="50">
                </th>
            </tr>   
            <%
                    }
                    //cerrar conexion
                    sta.close();
                    rs.close();
                    cnx.close();
                } catch (Exception e) {
                }

            %>
        </table>
    </body>
</html>
