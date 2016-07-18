<%-- 
    Document   : navbar
    Created on : 18/07/2016, 15:29:26
    Author     : JuliannyAS
--%>

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
                    <a class="navbar-brand" href="/Login">AlugAdm</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse menu" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="/VisualizarLocacoes">Visualizar Locações Ativas</a></li>
                        <li><a href="/VisualziarImovel">Visualizar Imóveis</a></li>
                        <li><a href="/VisualizarLocatario">Visualizar Locatários</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Imóveis <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="/CadastrarImovel">Cadatrar</a></li>
                                <li><a href="/EditarImovel">Editar</a></li>
                                 <li><a href="/ExcluirImovel">Excluir</a></li>
                            </ul>
                        </li>
                         <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Locatários <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="/CadastrarLocatario">Cadatrar</a></li>
                                <li><a href="/EditarLocatario">Editar</a></li>
                                 <li><a href="/ExcluirLocatario">Excluir</a></li>
                            </ul>
                        </li>
                        <li><a href="/Logout">Sair</a></li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>
