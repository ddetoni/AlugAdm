<%@include file="/jsp/defaut/topo.jsp" %>

<div class="container text-center" style="margin-top: 50px">
    <div id="top" class="row">
        <div class="col-sm-3"></div>
        <div class="col-sm-6"></div>
        <div class="col-sm-3">
            <a href="CadastrarImovel.adm" class="btn btn-primary pull-right h2">Cadastrar Im�vel</a>
        </div>
    </div> <!-- /#top -->
    <div id="list" class="row">
        <div class="table-responsive col-md-12">
            <h3 class="titulo">Visualizar Im�veis</h3>
            <table class="table table-striped" cellspacing="0" cellpadding="0">
                <thead>
                    <tr>
                        <th class="text-center">Codigo</th>
                        <th class="text-center">Data do Cadastro</th>
                        <th class="text-center">Categoria</th>
                        <th class="text-center">Tipo de Im�vel</th>
                        <th class="text-center">Status</th>
                        <th class="text-center">Logadouro</th>
                        <th class="text-center">Complemento</th>
                        <th class="text-center">Cidade</th>
                        <th class="text-center">Estado</th>
                        <th class="text-center">N� de Quartos</th>
                        <th class="text-center">Garagem</th>
                        <th class="text-center">Valor do Aluguel</th>
                        <th class="actions text-center">A��es</th>
                    </tr>
                </thead>
                <tbody>                           
                <c:forTokens items="${listaImovel}" var="imovel">
                    <tr>
                        <td>${imovel.codigoImovel}</td>
                        <td>${imovel.dataCadastro}</td>
                        <td>${imovel.categoria}</td>
                        <td>${imovel.tipoImovel}</td>
                        <td>${imovel.status}</td>
                        <td>${imovel.logadouro}</td>
                        <td>${imovel.complemento}</td>
                        <td>${imovel.cidade}</td>
                        <td>${imovel.estado}</td>
                        <td>${imovel.numQuartos}</td>  
                        <td>${imovel.garagem}</td>  
                        <td>${imovel.valorAluguel}</td>  
                        <td class="actions">
                            <a class="btn btn-warning btn-xs" href="EditarImovel.adm">Editar</a>
                            <a class="btn btn-danger btn-xs"  href="#" data-toggle="modal" data-target="#delete-modal">Excluir</a>
                        </td>
                        <form name="form_imovel" action="VisualizarImovel.adm" method="POST">
                            <button type="submit">
                                <input type="hidden" name="action" value="mostrar_imoveis" />
                            </button>
                        </form>
                    </tr>
                </c:forTokens>
                </tbody>
            </table>
        </div>
    </div> 
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
</div>
<div action="" class="modal fade" id="delete-modal" tabindex="-1" role="dialog" aria-labelledby="modalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Fechar"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="modalLabel">Excluir Im�vel</h4>
            </div>
            <div class="modal-body">
                Deseja realmente excluir este Im�vel?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary">Sim</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">N&atilde;o</button>
            </div>
        </div>
    </div>
</div>
<%@include file="/jsp/defaut/rodape.jsp" %>