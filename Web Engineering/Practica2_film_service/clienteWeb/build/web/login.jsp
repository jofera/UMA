<%-- 
    Document   : login.jsp
    Created on : Nov 16, 2014, 3:18:24 PM
    Author     : Gonzalo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">
        <script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
        <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
    </head>
    <body>
        <div id="loginModal" class="modal show" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="alert alert-danger alert-dismissible" role="alert" id="loginFail" style="display:none">
            <a class="close" onclick="$('.alert').hide()">×</a>  
            <strong>¡Error!</strong> Parece que los datos de acceso son incorrectos. Inténtelo de nuevo.
        </div>
        <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="text-center">Login</h1>
            </div>
            <div class="modal-body">
                <form class="form col-md-12 center-block">
                    <div class="form-group">
                      <input type="text" name="email" class="form-control input-lg" placeholder="Email">
                    </div>
                    <div class="form-group">
                      <input type="password" name="password" class="form-control input-lg" placeholder="Password">
                    </div>
                    <div class="form-group">
                      <input type="button" class="btn btn-primary btn-lg btn-block" name="conectar" value="Conectar">
                    </div>
                </form>
            </div>
              <div class="modal-footer">
              </div>
          </div>
          </div>
        </div>
        <script>
            $("input[name='conectar']").click(function(){
                var username = $("input[name=email]").val();
                var password = $("input[name=password]").val();
                $.ajax({
                 url: "loginServlet",
                 type: "get",
                 data: {email: username, password: password},
                 success: function(response){
                    if(response === "false")
                        $("#loginFail").show();
                    else
                        window.location.replace("http://localhost:8080/clienteWeb/getFilmsServlet");
                 }  
               }); 
            });
        </script>
    </body>
</html>
