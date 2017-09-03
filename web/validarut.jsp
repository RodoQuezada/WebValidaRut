<%-- 
    Document   : validarut
    Created on : 03-sep-2017, 13:32:50
    Author     : rodo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Valida Rut</title>
    </head>
    <body>
        <h1>Verificar Rut</h1>        
        <form action="verificarRut.do" method="POST">
            <table>           
                <tbody>
                    <tr>
                        <td>Rut: </td>
                        <td><input type="text" name="rut" value="" maxlength="8" size="8"/> - <input type="text" name="digito" value="" maxlength="1" size="1" />
                        </td>
                    </tr>
                    <tr>
                    <tr>
                        <td colspan="2" align="center"><input type="submit" value="Enviar" name="bt" /></td>                        
                    </tr>
                    </tr>
                </tbody>
            </table>
        </form>
        <%
            String error = (String) request.getAttribute("error");
            String ok = (String) request.getAttribute("ok");

            if (error != null) {
                out.println(error);
            }
            if (ok != null) {
                out.println(ok);
            }
        %>
    </body>
</html>
