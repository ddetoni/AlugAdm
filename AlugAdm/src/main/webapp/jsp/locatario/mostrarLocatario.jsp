<%@include file="/jsp/defaut/topo.jsp" %>

<div id="main" class="container text-center" style="margin-top: 50px">
    <div id="top" class="row">
        <div class="col-sm-3">

        </div>
        <div class="col-sm-6">

        </div>
        <div class="col-sm-3">
            <a href="CadastrarLocatario.adm" class="btn btn-primary pull-right h2">Cadastrar Locatário</a>
        </div>
    </div> <!-- /#top -->

    <div id="list" class="row">
        <div class="table-responsive col-md-12">
            <h3 class="titulo">Visualizar Locatários</h3>
            <table class="table table-striped" cellspacing="0" cellpadding="0">
                <thead>
                    <tr>
                        <th class="text-center">Tipo de Imovel</th>
                        <th class="text-center">Codigo</th>
                        <th class="text-center">Data do Cadastro</th>
                        <th class="text-center">Estado</th>
                        <th class="text-center">Status</th>
                        <th class="text-center">Logadouro</th>
                        <th class="text-center">Complemento</th>
                        <th class="text-center">Categoria</th>
                        <th class="text-center">N° de Quartos</th>
                        <th class="text-center">Garagem</th>
                        <th class="text-center">Valor do Aluguel</th>
                        <th class="actions text-center">Ações</th>
                    </tr>
                </thead>
                <tbody>                           
                <c:forTokens var="locatario" items="${listaLocatario}">
                    <tr>
                        <td>${locatario.tipoImovel}</td>
                        <td>${locatario.codigoImovel}</td>
                        <td>${locatario.dataCadastro}</td>
                        <td>${locatario.estado}</td>
                        <td>${locatario.status}</td>
                        <td>${locatario.logadouro}</td>
                        <td>${locatario.complemento}</td>
                        <td>${locatario.categoria}</td>
                        <td>${locatario.numQuartos}</td>  
                        <td>${locatario.garagem}</td>  
                        <td>${locatario.valorAluguel}</td>  
                        <td class="actions">
                            <a class="btn btn-warning btn-xs" href="EditarLocatario.adm">Editar</a>
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
                <h4 class="modal-title" id="modalLabel">Excluir Imóvel</h4>
            </div>
            <div class="modal-body">
                Deseja realmente excluir este Imóvel?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary">Sim</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">N&atilde;o</button>
            </div>
        </div>
    </div>
</div>
<%@include file="/jsp/defaut/rodape.jsp" %>