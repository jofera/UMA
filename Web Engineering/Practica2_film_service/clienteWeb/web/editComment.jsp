<%-- 
    Document   : editComment
    Created on : 21-nov-2014, 21:11:43
    Author     : Marcos
--%>

<%@page import="entity.Comentario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar comentario</title>
    </head>
    <body>
        <div class="container">
            <h1>Editar un comentario</h1>
            <form  action="editCommentServlet" method="POST">
                <% Comentario comentario = (Comentario) request.getAttribute("coment");
                request.setAttribute("coment", comentario);
                if (comentario != null) {%>


                <table border="1">
                    <tr>
                        <td>ID Comentario</td>
                        <td><input type="hidden" name="idComent" value="<%= comentario.getIdcomentario()%>" /><%= comentario.getIdcomentario()%></td>


                    </tr>
                    <tr>
                        <td>Descripcion</td>
                        <td><input type="text" name="descripcion" value="" /></td>

                    </tr>  

                </table>
                <p/>
                <input class="btn btn-success pull-left" type="submit" value="Fin edición"/>

                <%   
               }
                %>
            </form>
            <p/>
            <input class="btn btn-primary pull-right" type="submit" value="Cancelar" />
        </div>
    </body>
</html>
