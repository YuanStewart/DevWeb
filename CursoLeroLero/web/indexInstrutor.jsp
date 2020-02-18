<!DOCTYPE html>
<meta charset="utf-8" />
<html lang="pt">

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
        <h1> Seja bem-vindo(a), Instrutor </h1>

        <div class="card">
            <div class="card-body">
                <!--Conteúdo principal -->
                <div class="card">
                    <div class="card-header">

                        Olá, Joaquim
                    </div>
                    <div class="card-body">
                        <div class="media">
                            <img src="assets/images/01.png" class="align-self-start mr-3" alt="Foto">
                            <div class="media-body">
                                <ul class="list-group list-group-flush">
                                    <li class="list-group-item"><b>Nome:</b> Joaquim Tavora</li>
                                    <li class="list-group-item"><b>E-mail:</b> joaquim.tavora@gmail.com</li>
                                    <li class="list-group-item"><b>Valor/Hora:</b> R$15,00</li>
                                    <li class="list-group-item"><b>Login:</b> joca_instrutor</li>
                                </ul>
                            </div>
                        </div>
                        <div class="d-flex justify-content-end">
                            <a href="/" class="btn btn-primary">Alterar Dados</a>
                        </div>

                    </div>
                </div>
                <br>
                <!--Valor por Hora-->
                <h2>Total Trabalhado</h2>
                <table class="table table-sm">
                    <thead>
                        <tr>
                            <th scope="col">Turma</th>
                            <th scope="col">Curso</th>
                            <th scope="col">Total de Horas</th>
                            <th scope="col">Valor final</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <th scope="row">1</th>
                            <td>Dev Web</td>
                            <td>10</td>
                            <td>R$150,00</td>
                        </tr>
                        <tr>
                            <th scope="row">2</th>
                            <td>Dev Web</td>
                            <td>10</td>
                            <td>R$150,00</td>
                        </tr>
                        <tr>
                            <th scope="row">3</th>
                            <td>Dev Web</td>
                            <td>10</td>
                            <td>R$150,00</td>
                        </tr>
                    </tbody>
                </table>
                <br>
                <!--Lista de Turmas-->
                <h2>Lista de Turmas</h2>
                <div class="accordion" id="accordionExample">
                    <div class="card">
                        <div class="card-header" id="headingOne">
                            <h2 class="mb-0">
                                <button class="btn btn-link " type="button" data-toggle="collapse" data-target="#collapseOne"
                                        aria-expanded="false" aria-controls="collapseOne">
                                    Turma 1 - Desenvolvimento Web
                                </button>
                            </h2>
                        </div>

                        <div id="collapseOne" class="collapse" aria-labelledby="headingOne" data-parent="#accordionExample">
                            <div class="card-body">
                                Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3
                                wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum
                                eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla
                                assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt
                                sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer
                                farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus
                                labore sustainable VHS.
                            </div>
                        </div>
                    </div>
                    <div class="card">
                        <div class="card-header" id="headingTwo">
                            <h2 class="mb-0">
                                <button class="btn btn-link collapsed" type="button" data-toggle="collapse"
                                        data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                                    Turma 2 - Desenvolvimento Web
                                </button>
                            </h2>
                        </div>
                        <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionExample">
                            <div class="card-body">
                                Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3
                                wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum
                                eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla
                                assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt
                                sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer
                                farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus
                                labore sustainable VHS.
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>






</body>

</html>