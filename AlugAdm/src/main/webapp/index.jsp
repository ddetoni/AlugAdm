<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>AlugAdm</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
    </head>
    <body>
        <nav class="navbar navbar-default topo">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand icon" href="/AlugAdm" style="color: #fff;" alt="AlugAdm"><img src="icon.svg"></a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse menu" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <form name="form_visualizarImovel" action="VisualizarImovel.adm" method="post">
                                <a type="submit" class="btn btn-info">
                                    <input type="hidden" name="action" value="mostrar_imoveis" />
                                    <span style="vertical-align: middle;">Visualizar Imovel</span>
                                </a>
                            </form>
                            <!--<a href="VisualizarImovel.adm" style="color: #fff;">Visualizar Imóveis</a>-->
                        </li>
                        <form name="form_visualizarImovel" action="VisualizarImovel.adm" method="post">
                            <a type="submit" class="btn btn-info">
                                <input type="hidden" name="action" value="mostrar_imoveis" />
                                <span style="vertical-align: middle;">Visualizar Imovel</span>
                            </a>
                        </form>
                        <!--<li><a href="VisualizarLocatario.adm" style="color: #fff;">Visualizar Locatários</a></li>-->
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>

        <div id="main" class="container text-center" style="margin-top: 50px">
            <div id="top" class="row">
                <div class="col-sm-3">

                </div>
                <div class="col-sm-6">
                    <div class="input-group h2">
                        <input name="data[search]" class="form-control" id="search" type="text" placeholder="Pesquisar...">
                        <span class="input-group-btn">
                            <button class="btn btn-primary" type="submit">
                                <span class="glyphicon glyphicon-search"></span>
                            </button>
                        </span>
                    </div>
                </div>
                <div class="col-sm-3">
                    <form action="RealizarLocacao.adm" method="post">
                        <a type="submit" class="btn btn-info">
                            <input type="hidden" name="action" value="cadastrar" />
                            <span style="vertical-align: middle;">Informar Locação</span>
                        </a>
                    </form>
                    <!--<a href="RealizarLocacao.adm" class="btn btn-primary pull-right h2">Informar Locação</a>-->
                </div>
            </div> <!-- /#top -->
            <hr />
            <div id="list" class="row">
                <div class="table-responsive col-md-12">
                    <h3 class="titulo">Visualizar Locações Ativas</h3>
                    <table class="table table-striped" cellspacing="0" cellpadding="0">
                        <thead>
                            <tr>
                                <th class="text-center">Codigo Imovel</th>
                                <th class="text-center">Codigo Locatario</th>
                                <th class="text-center">N° do Contrato</th>
                                <th class="text-center">Inicio</th>
                                <th class="text-center">Termino</th>
                                <th class="text-center">Dia do Vencimento</th>
                                <th class="text-center">Valor do Alguel</th>
                                <th class="text-center">Tolerancia Dias</th>
                                <th class="actions text-center">Ações</th>
                            </tr>
                        </thead>
                        <tbody>                           
                        <c:forTokens var="locacao" items="${listaLocacoes}">
                            <tr>
                                <td>${locacao.codigoImovel}</td>
                                <td>${locacao.codigoLocatario}</td>
                                <td>${locacao.numContrato}</td>
                                <td>${locacao.inicioContrato}</td>
                                <td>${locacao.terminoContrato}</td>
                                <td>${locacao.diaVencimento}</td>
                                <td>${locacao.valorAluguel}</td>
                                <td>${locacao.toleranciaDias}</td>                                 
                                <td class="actions">
                                    <a class="btn btn-success btn-xs" href="/visualizarLocacao">Visualizar</a>
                                    <a class="btn btn-warning btn-xs" href="/editarLocacao">Editar</a>
                                    <a class="btn btn-danger btn-xs"  href="#" data-toggle="modal" data-target="#delete-modal">Excluir</a>
                                </td>
                            </tr>
                        </c:forTokens>
                        </tbody>
                    </table>
                </div>
            </div> <!-- /#list -->
            <!--            <div id="bottom" class="row">
                            <div class="col-md-12">
                                <ul class="pagination">
                                    <li class="disabled"><a>&lt; Anterior</a></li>
                                    <li class="disabled"><a>1</a></li>
                                    <li><a href="#">2</a></li>
                                    <li class="next"><a href="#" rel="next">Próximo &gt;</a></li>
                                </ul> /.pagination 
                            </div>
                        </div>  /#bottom -->
        </div> <!-- /#main -->
        <!-- Modal -->
        <div class="modal fade" id="delete-modal" tabindex="-1" role="dialog" aria-labelledby="modalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Fechar"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="modalLabel">Excluir Aluguel</h4>
                    </div>
                    <div class="modal-body">
                        Deseja realmente excluir esta locaçaõ?
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary">Sim</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">N&atilde;o</button>
                    </div>
                </div>
            </div>
        </div>
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>