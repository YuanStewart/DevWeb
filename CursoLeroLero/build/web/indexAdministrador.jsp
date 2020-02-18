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
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark d-flex justify-content-between">
            <a class="navbar-brand">Curso Lero Lero</a>
                <button class="btn btn-outline-primary my-2 my-sm-0" type="submit">
                    <a href="/CursoLeroLero">Sair da Conta</a></button>

            </form>
        </nav>

        <br>
        <div class="container">
            <h1> Seja bem-vindo(a), Adm </h1>

            <div class="card">
                <div class="card-body">
                    <div class="accordion" id="accordionExample">
                        <div class="card">
                            <div class="card-header" id="headingOne">
                                <h2 class="mb-0">
                                    <button class="btn btn-link" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                                        Alunos
                                    </button>
                                </h2>
                            </div>

                            <div id="collapseOne" class="collapse" aria-labelledby="headingOne" data-parent="#accordionExample">
                                <div class="card-body">
                                    <p>
                                        <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#listaAlunos" aria-expanded="false" aria-controls="listaAlunos">
                                            Listar Alunos
                                        </button>
                                        <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#addAlunos" aria-expanded="false" aria-controls="addAlunos">
                                            Adicionar novo Aluno
                                        </button>
                                        <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#alteraAlunos" aria-expanded="false" aria-controls="alteraAlunos">
                                            Alterar Aluno
                                        </button>
                                        <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#excluiAlunos" aria-expanded="false" aria-controls="excluiAlunos">
                                            Excluir 
                                        </button>
                                    </p>
                                    <div class="collapse" id="listaAlunos" data-parent="#collapseOne">
                                        <div class="card card-body" >
                                            lista os alunos
                                        </div>
                                    </div>
                                    <div class="collapse" id="addAlunos" data-parent="#collapseOne">
                                        <div class="card card-body">
                                            adiciona os alunos
                                        </div>
                                    </div>

                                    <div class="collapse" id="alteraAlunos" data-parent="#collapseOne">
                                        <div class="card card-body">
                                            altera os alunos
                                        </div>
                                    </div>

                                    <div class="collapse" id="excluiAlunos" data-parent="#collapseOne">
                                        <div class="card card-body">
                                            exclui os alunos
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="card">
                            <div class="card-header" id="headingTwo">
                                <h2 class="mb-0">
                                    <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                                        Instrutores
                                    </button>
                                </h2>
                            </div>
                            <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionExample">
                                <div class="card-body">
                                    <p>
                                        <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#listaAlunos" aria-expanded="false" aria-controls="listaAlunos">
                                            Listar Instrutores
                                        </button>
                                        <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#addAlunos" aria-expanded="false" aria-controls="addAlunos">
                                            Adicionar novo instrutor
                                        </button>
                                        <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#alteraAlunos" aria-expanded="false" aria-controls="alteraAlunos">
                                            Alterar instrutor
                                        </button>
                                        <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#excluiAlunos" aria-expanded="false" aria-controls="excluiAlunos">
                                            Excluir instrutor
                                        </button>
                                    </p>
                                    <div class="collapse" id="listaAlunos" data-parent="#collapseTwo">
                                        <div class="card card-body" >
                                            lista os instrutores
                                        </div>
                                    </div>
                                    <div class="collapse" id="addAlunos" data-parent="#collapseTwo">
                                        <div class="card card-body">
                                            adiciona os instrutores
                                        </div>
                                    </div>

                                    <div class="collapse" id="alteraAlunos" data-parent="#collapseTwo">
                                        <div class="card card-body">
                                            altera os instrutores
                                        </div>
                                    </div>

                                    <div class="collapse" id="excluiAlunos" data-parent="#collapseTwo">
                                        <div class="card card-body">
                                            exclui os instrutores
                                        </div>
                                    </div>  </div>
                            </div>
                        </div>
                        <div class="card">
                            <div class="card-header" id="headingThree">
                                <h2 class="mb-0">
                                    <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                                        Cursos
                                    </button>
                                </h2>
                            </div>
                            <div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordionExample">
                                <div class="card-body">
                                   <p>
                                        <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#listaAlunos" aria-expanded="false" aria-controls="listaAlunos">
                                            Listar Cursos
                                        </button>
                                        <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#addAlunos" aria-expanded="false" aria-controls="addAlunos">
                                            Adicionar novo Curso
                                        </button>
                                        <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#alteraAlunos" aria-expanded="false" aria-controls="alteraAlunos">
                                            Alterar Curso
                                        </button>
                                        <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#excluiAlunos" aria-expanded="false" aria-controls="excluiAlunos">
                                            Excluir Curso
                                        </button>
                                    </p>
                                    <div class="collapse" id="listaAlunos" data-parent="#collapseThree">
                                        <div class="card card-body" >
                                            lista os cursos
                                        </div>
                                    </div>
                                    <div class="collapse" id="addAlunos" data-parent="#collapseThree">
                                        <div class="card card-body">
                                            adiciona os cursos
                                        </div>
                                    </div>

                                    <div class="collapse" id="alteraAlunos" data-parent="#collapseThree">
                                        <div class="card card-body">
                                            altera os cursos
                                        </div>
                                    </div>

                                    <div class="collapse" id="excluiAlunos" data-parent="#collapseThree">
                                        <div class="card card-body">
                                            exclui os cursos
                                        </div>
                                    </div>  </div>
                            </div>
                        </div>
                        <div class="card">
                            <div class="card-header" id="headingFour">
                                <h2 class="mb-0">
                                    <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseFour" aria-expanded="false" aria-controls="collapseFour">
                                        Turmas
                                    </button>
                                </h2>
                            </div>
                            <div id="collapseFour" class="collapse" aria-labelledby="headingFour" data-parent="#accordionExample">
                                <div class="card-body">
                                   <p>
                                        <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#listaAlunos" aria-expanded="false" aria-controls="listaAlunos">
                                            Listar Turmas
                                        </button>
                                        <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#addAlunos" aria-expanded="false" aria-controls="addAlunos">
                                            Adicionar nova Turma
                                        </button>
                                        <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#alteraAlunos" aria-expanded="false" aria-controls="alteraAlunos">
                                            Alterar Turma
                                        </button>
                                        <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#excluiAlunos" aria-expanded="false" aria-controls="excluiAlunos">
                                            Excluir Turma
                                        </button>
                                    </p>
                                    <div class="collapse" id="listaAlunos" data-parent="#collapseFour">
                                        <div class="card card-body" >
                                            lista as Turmas
                                        </div>
                                    </div>
                                    <div class="collapse" id="addAlunos" data-parent="#collapseFour">
                                        <div class="card card-body">
                                            adiciona as Turmas
                                        </div>
                                    </div>

                                    <div class="collapse" id="alteraAlunos" data-parent="#collapseFour">
                                        <div class="card card-body">
                                            altera as Turmas
                                        </div>
                                    </div>

                                    <div class="collapse" id="excluiAlunos" data-parent="#collapseFour">
                                        <div class="card card-body">
                                            exclui as Turmas
                                        </div>
                                    </div>  </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>


    </body>

</html>