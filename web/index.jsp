<%-- 
    Document   : index
    Created on : 03-sep-2017, 13:19:06
    Author     : rodo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Log In</title>
    </head>
    <body>
        <h1>Welcome</h1>
        <form action="login.do" method="POST">       
            <table border="1">          
                <tbody>
                    <tr>
                        <td>Usuario: </td>
                        <td><input type="text" name="usuario" value="" /></td>
                    </tr>
                    <tr>
                        <td>Contraseña: </td>
                        <td><input type="password" name="pass" value="" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <input type="submit" value="Ingresar"  />
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>
        <%
            String error = (String) request.getAttribute("error");
            if (error != null) {
                    out.println(error);
                }
            %>
    </body>
</html>
