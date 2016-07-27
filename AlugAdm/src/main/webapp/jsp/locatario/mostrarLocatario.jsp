<%@include file="/jsp/defaut/topo.jsp" %>

<div id="main" class="container text-center" style="margin-top: 50px">
    <div id="top" class="row">
        <div class="col-sm-3">

        </div>
        <div class="col-sm-6">

        </div>
        <div class="col-sm-3">
            <a href="CadastrarLocatario.adm" class="btn btn-primary pull-right h2">Cadastrar Locat�rio</a>
        </div>
    </div> <!-- /#top -->
    <div id="list" class="row">
        <div class="table-responsive col-md-12">
            <h3 class="titulo">Visualizar Locat�rios</h3>
            <table class="table table-striped" cellspacing="0" cellpadding="0">
                <thead>
                    <tr>
                        <th class="text-center">Codigo</th>
                        <th class="text-center">Nome</th>
                        <th class="text-center">CPF</th>
                        <th class="text-center">RG</th>
                        <th class="text-center">Org�o Expedidor</th>
                        <th class="text-center">Sexo</th>
                        <th class="text-center">Data de Nascimento</th>
                        <th class="text-center">Telefone 1</th>
                        <th class="text-center">Telefone 2</th>
                        <th class="actions text-center">A��es</th>
                    </tr>
                </thead>
                <tbody>                           
                    <%--<c:forEach var="imovel" items="${listaImovel}">--%>
                    <tr>
                        <td>${imovel.codigo}</td>
                        <td>${imovel.nome}</td>
                        <td>${imovel.cpf}</td>
                        <td>${imovel.rg}</td>
                        <td>${imovel.orgao}</td>
                        <td>${imovel.sexo}</td>
                        <td>${imovel.dataNascimento}</td>
                        <td>${imovel.telefone1}</td>
                        <td>${imovel.telefone2}</td>  
                        <td class="actions">
                            <a class="btn btn-warning btn-xs" href="EditarLocatario.adm">Editar</a>
                            <a class="btn btn-danger btn-xs"  href="#" data-toggle="modal" data-target="#delete-modal">Excluir</a>
                        </td>
                    </tr>
                <%--</c:forEach>--%>
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
                            <li class="next"><a href="#" rel="next">Pr�ximo &gt;</a></li>
                        </ul> /.pagination 
                    </div>
                </div>  /#bottom -->
</div> <!-- /#main -->
<!-- Modal -->
<div action="" class="modal fade" id="delete-modal" tabindex="-1" role="dialog" aria-labelledby="modalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Fechar"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="modalLabel">Excluir Locat�rio</h4>
            </div>
            <div class="modal-body">
                Deseja realmente excluir este cliente?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary">Sim</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">N&atilde;o</button>
            </div>
        </div>
    </div>
</div>
<%@include file="/jsp/defaut/rodape.jsp" %>