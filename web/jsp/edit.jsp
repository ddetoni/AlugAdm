<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>CRUD - Alunos</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top barra">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">CRUDAlunos</a>
                </div>
                <!--                <div id="navbar" class="navbar-collapse collapse">
                                    <ul class="nav navbar-nav navbar-right" style="color: #ffffff;">
                                        <li><a href="#">In&iacute;cio</a></li>
                                        <li><a href="#">Op&ccedil;&oacute;es</a></li>
                                        <li><a href="#">Perfil</a></li>
                                        <li><a href="#">Ajuda</a></li>
                                    </ul>
                                </div>-->
            </div>
        </nav>
        <div id="main" class="container">
            <h3 class="page-header">Editar Aluno :</h3>
            <form action="index.jsp">
                <div class="row">
                    <div class="col-md-2"></div>
                    <div class="form-group col-md-2">
                        <label for="exampleInputEmail1 text-center">Matricula</label>
                        <input type="email" class="form-control" id="exampleInputEmail1" placeholder="">
                    </div>
                    <div class="form-group col-md-6 text-left">
                        <label for="exampleInputEmail1">Nome</label>
                        <input type="email" class="form-control" id="exampleInputEmail1">
                    </div>
                    <div class="col-md-2"></div>
                </div>
                <div class="row">
                    <div class="col-md-2"></div>
                    <div class="form-group col-md-2">
                        <label for="exampleInputEmail1 text-center">Data de Nascimento</label>
                        <input type="email" class="form-control" id="exampleInputEmail1">
                    </div>
                    <div class="form-group col-md-6 text-left">
                        <label for="exampleInputEmail1">Email</label>
                        <input type="email" class="form-control" id="exampleInputEmail1">
                    </div>
                    <div class="col-md-2"></div>
                </div>
                <hr/>
                <div class="row">
                    <div class="row">
                        <div class="col-md-12 text-center">
                            <button type="submit" class="btn btn-primary">Atualizar</button>
                            <a href="index.jsp" class="btn btn-default">Cancelar</a>
                        </div>
                    </div>
                </div>
            </form>
        </div>

        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>