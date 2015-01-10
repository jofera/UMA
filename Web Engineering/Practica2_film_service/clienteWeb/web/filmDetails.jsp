<%-- 
    Document   : filmDetails
    Created on : 21-nov-2014, 12:45:34
    Author     : Antonio
--%>

<%@page import="java.util.List"%>
<%@page import="entity.Comentario"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalles pelicula</title>
        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">
        <script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
        <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
    </head>
    <body>
        <div class="container">
            <div class="page-header">
                <h1>Detalles de la película</h1>
            </div>
            <% services.Film peli = (services.Film) request.getAttribute("peli");%>
            <table class="table">
                <tr>
                    <th>ID</th>
                    <th>Título</th>
                    <th>Descripción</th>
                    <th>A&ntilde;o</th>
                    <th>Rental rate</th>
                    <th>Duración</th>
                    <th>Rep_cost</th>
                    <th>Valoración</th>
                    <th>Special features</th>
                    <th>Last update</th>
                    <th>Lenguaje</th>
                </tr>
                <tr>
                    <td><%= peli.getFilmId()%></td>
                    <td><%= peli.getTitle()%></td>
                    <td><%= peli.getDescription()%></td>
                    <td><%= peli.getReleaseYear().toString()%></td>
                    <td><%= peli.getRentalRate()%></td>
                    <td><%= peli.getRentalDuration()%></td>
                    <td><%= peli.getReplacementCost()%></td>
                    <td><%= peli.getRating()%></td>
                    <td><%= peli.getSpecialFeatures()%></td>
                    <td><%= peli.getLastUpdate().toString()%></td>
                    <td><%= peli.getLanguageId().getName()%></td>
                </tr>        
            </table>
            <p/><p/>
            <%
                session.setAttribute("filmCommentId", peli.getFilmId()) ; 
            %>
            <a class="btn btn-primary" href="http://localhost:8080/clienteWeb/createComment.jsp">Añadir comentario</a> 

            <p/><p/>
            <% List<Comentario> comentarios = (List<Comentario>) request.getAttribute("comentarios");

                if (comentarios.size() > 0) {%>

            <table border="1">
                <tr>
                    <th>Usuario</th>
                    <th>Comentario</th>
                    <th>Fecha</th>
                    <th></th>
                </tr>
                <% for (Comentario coment : comentarios) {%>
                <tr>
                    <td><%= coment.getUsuarioIdusuario().getNombre()%></td>
                    <td><%= coment.getComentario()%></td>
                    <td><%= coment.getFecha().toString()%></td>
                    <td> <form action="editCommentServlet">
                            <button name="comentarioId" class="btn btn-primary" value="<% out.print(coment.getIdcomentario());%>">Editar</button>
                        </form></td>
                </tr>        
                <% }%>      
            </table>
            <%}%>
        </div>
    </body>
</html>
