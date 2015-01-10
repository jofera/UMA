<%-- 
    Document   : filmList
    Created on : Nov 16, 2014, 4:39:12 PM
    Author     : Gonzalo
--%>

<%@page import="java.util.List"%>
<%@page import="entity.Usuario"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Boolean conectado = (Boolean) request.getSession().getAttribute("loged");
    String usuario = null;
    if (conectado != null && conectado) {
        usuario = (String) request.getSession().getAttribute("logedUser");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Catálogo de películas</title>
        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">
        <script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
        <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
    </head>
    <body>
        <div class="container">
            <%
                if (usuario == null) {
            %>
            <c:redirect url="/login.jsp"/>
            <%            }
            %>
            <h1>Catálogo de películas</h1>
            <p class="navbar-text navbar-left">Conectado como <% out.print(usuario);%></p>
            <input type="button" class="btn btn-danger navbar-btn navbar-right" name="salir" value="salir">
            <div id="clonar" class="">

            </div>
            <script>
                $("input[name=salir]").on("click", function() {
                    $.ajax({
                        url: "logoutServlet",
                        type: "get",
                        success: function(response) {
                            if (response === "true")
                                window.location.replace("http://localhost:8080/clienteWeb/login.jsp");
                        }
                    });
                });
            </script>

            <p/>

            <% List<services.Film> listaPelis = (List<services.Film>) request.getAttribute("pelis");%>

            <table class="table">
                <tr>
                    <th>Título</th>
                    <th>Año</th>
                    <th></th>
                </tr>
                <% for (services.Film peli : listaPelis) {%>
                <tr>
                    <td><% out.print(peli.getTitle());%></td>
                    <td><% out.print(peli.getReleaseYear());%></td>
                    <td> 
                        <form action="getFilmDetailsServlet">
                            <button name="filmId" class="btn btn-primary" value="<% out.print(peli.getFilmId());%>">Ver</button>
                        </form>
                    </td>
                </tr>

                <% }%>

            </table>
        </div>
    </body>
</html>
