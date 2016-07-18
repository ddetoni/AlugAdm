<%@include file="topo.jsp" %>

<div id="main" class="container text-center" style="margin-top: 50px">
    <div id="top" class="row">
        <div class="col-sm-3">

        </div>
        <div class="col-sm-6">
            <div class="input-group h2">
                <input name="data[search]" class="form-control" id="search" type="text" placeholder="Pesquisar imóveis">
                <span class="input-group-btn">
                    <button class="btn btn-primary" type="submit">
                        <span class="glyphicon glyphicon-search"></span>
                    </button>
                </span>
            </div>

        </div>
        <div class="col-sm-3">
            <a href="/RealizarLocacao" class="btn btn-primary pull-right h2">Informar Locação</a>
        </div>
    </div> <!-- /#top -->
    <hr />
    <div id="list" class="row">
        <div class="table-responsive col-md-12">
            <table class="table table-striped" cellspacing="0" cellpadding="0">
                <thead>
                    <tr>
                        <th class="text-center">Matricula</th>
                        <th class="text-center">Nome</th>
                        <th class="text-center">Idade</th>
                        <th class="text-center">Data Nascimento</th>
                        <th class="text-center">Email</th>
                        <th class="actions text-center">Ações</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>20131556</td>
                        <td>Julianny Alves da Silva</td>
                        <td>19</td>
                        <td>12/07/1996</td>
                        <td>julianny.alves@hotmail.com</td>
                        <td class="actions">
                            <a class="btn btn-success btn-xs" href="view.jsp">Visualizar</a>
                            <a class="btn btn-warning btn-xs" href="edit.jsp">Editar</a>
                            <a class="btn btn-danger btn-xs"  href="#" data-toggle="modal" data-target="#delete-modal">Excluir</a>
                        </td>
                    </tr>
                <c:forTokens var="aluno" items="${listaAlunos}">
                    <tr>
                        <td>${aluno.matricula}</td>
                        <td>${aluno.name}</td>
                        <td>${aluno.idade}</td>
                        <td>${aluno.dataNasc}</td>                               
                    </tr>
                </c:forTokens>
                </tbody>
            </table>
        </div>
    </div> <!-- /#list -->
    <div id="bottom" class="row">
        <div class="col-md-12">
            <ul class="pagination">
                <li class="disabled"><a>&lt; Anterior</a></li>
                <li class="disabled"><a>1</a></li>
                <!--<li><a href="#">2</a></li>-->
                <li class="next"><a href="#" rel="next">Próximo &gt;</a></li>
            </ul><!-- /.pagination -->
        </div>
    </div> <!-- /#bottom -->
</div> <!-- /#main -->
<!-- Modal -->
<div class="modal fade" id="delete-modal" tabindex="-1" role="dialog" aria-labelledby="modalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Fechar"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="modalLabel">Excluir Aluno</h4>
            </div>
            <div class="modal-body">
                Deseja realmente excluir este aluno?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary">Sim</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">N&atilde;o</button>
            </div>
        </div>
    </div>
</div>

<%@include file="rodape.jsp" %>
