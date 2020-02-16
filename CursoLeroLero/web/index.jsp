<!doctype html>

<html lang="pt">
<head>
  <meta charset="utf-8">

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
                        Tipo de Usu�rio
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="#">Administrador</a>
                        <a class="dropdown-item" href="#">Instrutor</a>
                        <a class="dropdown-item" href="#">Aluno</a>
                    </div>
                </li>

            </ul>
            <input class="form-control mr-sm-2" type="text" placeholder="Usu�rio" aria-label="Usu�rio">
            <input class="form-control mr-sm-2" type="password" placeholder="Senha" aria-label="Senha">
            <button class="btn btn-outline-primary my-2 my-sm-0" type="submit">Log in</button>
        </form>
</nav>
<br>
<div class="container">
<h1> Seja bem-vindo</h1>

    <div class="card">
        <div class="card-body">
         <h3>Sobre a Empresa</h3>
         <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur tristique urna vel maximus mattis. Praesent volutpat mi vel arcu dictum dictum. Maecenas tempor facilisis volutpat. Nam eu odio posuere lectus blandit congue. In arcu turpis, vestibulum et mi non, luctus cursus sem. Donec dui urna, dictum sit amet lectus sed, pretium sagittis sapien. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nullam mollis leo et arcu molestie tempor. Ut eget nisl quis orci facilisis tristique. Suspendisse accumsan id sapien non pretium. Maecenas et dignissim eros. Nam vestibulum ultrices purus, a pellentesque lacus laoreet vel. Donec varius laoreet lorem, nec cursus dolor porta ut. Vestibulum placerat ac neque in molestie. Vivamus mollis volutpat arcu a lacinia.</p>
            <br>
         <h2>Cursos Dispon�veis</h2>
         <br>
         <div class="accordion" id="accordionExample">
            <div class="card">
                <div class="card-header" id="headingOne">
                    <h2 class="mb-0">
                        <button class="btn btn-link " type="button" data-toggle="collapse" data-target="#collapseOne"
                            aria-expanded="false" aria-controls="collapseOne">
                            Curso de Desenvolvimento Web
                        </button>
                    </h2>
                </div>
    
                <div id="collapseOne" class="collapse" aria-labelledby="headingOne" data-parent="#accordionExample">
                    <div class="card-body">
                        <table class="table">
                            <thead class="thead-dark">
                              <tr>
                                <th scope="col">Turma</th>
                                <th scope="col">Instrutor</th>
                                <th scope="col">Ementa</th>
                                <th scope="col">Hor�rio</th>
                                <th scope="col">Pre�o</th>
                              </tr>
                            </thead>
                            <tbody>
                              <tr>
                                <th scope="row">1</th>
                                <td>Mark</td>
                                <td>Servlets</td>
                                <td>18h - 22h</td>
                                <td>R$100,00 por m�s</td>
                              </tr>
                              <tr>
                                <th scope="row">2</th>
                                <td>Sebasti�o</td>
                                <td>Bootstrap</td>
                                <td>18h - 22h</td>
                                <td>R$100,00 por m�s</td>
                              </tr>
                              <tr>
                                <th scope="row">3</th>
                                <td>Felipe</td>
                                <td>Cinema e audiovisual</td>
                                <td>18h - 22h</td>
                                <td>R$100,00 por m�s</td>
                              </tr>
                            </tbody>
                          </table>
                    </div>
                </div>
            </div>
            <div class="card">
                <div class="card-header" id="headingTwo">
                    <h2 class="mb-0">
                        <button class="btn btn-link collapsed" type="button" data-toggle="collapse"
                            data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                            Curso de UI/UX
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
            <div class="card">
                <div class="card-header" id="headingThree">
                    <h2 class="mb-0">
                        <button class="btn btn-link collapsed" type="button" data-toggle="collapse"
                            data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                            Curso de Design Avan�ado
                        </button>
                    </h2>
                </div>
                <div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordionExample">
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


</body>
</html>