<%-- 
    Document   : createComment
    Created on : 23-nov-2014, 17:37:31
    Author     : Facundo
--%>

<%@page import="entity.Usuario"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo comentario</title>
        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">
        <script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
        <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
    </head>
    <body>
        <%
          Short filmId = (Short) session.getAttribute("filmCommentId");
        %>
        <div class="container">
            <h1>Añadir un comentario</h1>
            <form  action="createCommentServlet" method="POST">
                <table class="table">    
                    <tr>
                        <td>Descripción</td>
                        <td>
                            <textarea name="comentario" rows="5" cols="25" ></textarea>
                        </td>
                    </tr>
                </table>
                <br>
                <input class="btn btn-success pull-left" type="submit" value="Crear comentario" />
            </form>
            <a class="btn btn-primary pull-right" href="http://localhost:8080/clienteWeb/getFilmDetailsServlet?filmId=<%= filmId %>">Volver</a> 
        </div>
    </body>
</html>
