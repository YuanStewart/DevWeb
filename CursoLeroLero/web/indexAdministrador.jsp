<%-- 
    Document   : indexAdministrador
    Created on : 16/02/2020, 18:15:03
    Author     : yuan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<meta charset="utf-8" />
<html>

<head>

    <title>Curso Lero Lero</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
        integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
        integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
        integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
        crossorigin="anonymous"></script>
    </head>

    <body>
        <!--NavBar-->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand">Curso Lero Lero</a>
        <form class="form-inline my-2 my-lg-0">
            <ul class="navbar-nav mr-auto ">
                
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Tipo de Usuário
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="#">Administrador</a>
                        <a class="dropdown-item" href="#">Instrutor</a>
                        <a class="dropdown-item" href="#">Aluno</a>
                    </div>
                </li>

            </ul>
            <input class="form-control mr-sm-2" type="text" placeholder="Usuário" aria-label="Usuário">
            <input class="form-control mr-sm-2" type="password" placeholder="Senha" aria-label="Senha">
            <button class="btn btn-outline-primary my-2 my-sm-0" type="submit">Log in</button>
        </form>
</nav>

<br>
<div class="container">
<h1> Seja bem-vindo, (fulano) </h1>

    <div class="card">
        <div class="card-body">
          Informações do adm
        </div>
      </div>
  </div>


    </body>
    
    </html>