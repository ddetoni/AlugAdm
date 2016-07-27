<%@include file="/jsp/defaut/topo.jsp" %>

<div class="container text-center" style="margin-top: 50px">
    <div id="top" class="row">
        <div class="col-sm-9"></div>
        <div class="col-sm-3">
            <form name="form_cadastrarImovel" action="CadastrarImovel.adm" method="post">
                <button type="submit" class="btn btn-info">
                    <input type="hidden" name="action" value="cadastrar_imovel" />
                    <span style="vertical-align: middle;">Cadastrar Imovel</span>
                </button>
            </form>
            <!--<a href="CadastrarImovel.adm" class="btn btn-primary pull-right h2">Cadastrar Imóvel</a>-->
        </div>
    </div> <!-- /#top -->
    <div class="row">
        <div class="table-responsive col-md-12">
            <h3 class="titulo">Visualizar Imóveis</h3>
            <table class="tbl table-responsive table-hover table-bordered table-condensed text-center">
                <thead>
                    <tr class="text-center">
                        <th>Id</th>
                        <th>Data do Cadastro</th>
                        <th>Categoria</th>
                        <th>Tipo de Imóvel</th>
                        <th>Status</th>
                        <th>Logadouro</th>
                        <th>Complemento</th>
                        <th>Cidade</th>
                        <th>Estado</th>
                        <th>N° de Quartos</th>
                        <th>Garagem</th>
                        <th>Valor do Aluguel</th>
                        <th class="actions">Ações</th>
                    </tr>
                </thead>
                <tbody>     
                    <c:forEach items="${listaImovel}" var="imovel">
                        <tr>
                            <td>${imovel.id}</td>
                            <td>${imovel.data_cadastro}</td>
                            <td>${imovel.categoria}</td>
                            <td>${imovel.tipo_imovel}</td>
                            <td>${imovel.status}</td>
                            <td>${imovel.logradouro}</td>
                            <td>${imovel.complemento}</td>
                            <td>${imovel.cidade}</td>
                            <td>${imovel.estado}</td>
                            <td>${imovel.num_quartos}</td>  
                            <td>${imovel.garagem}</td>  
                            <td>${imovel.valor_aluguel}</td>  
                            <td>${imovel.cep}</td>
                            <td class="actions">
                                <a class="btn btn-warning btn-xs" href="/EditarImovel.adm">Editar</a>
                                <a class="btn btn-danger btn-xs"  href="#" data-toggle="modal" data-target="#delete-modal">Excluir</a>
                            </td>
                        </tr>
                    </c:forEach>
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
                            <li class="next"><a href="#" rel="next">Próximo &gt;</a></li>
                        </ul> /.pagination 
                    </div>
                </div>  /#bottom -->
</div>
<div action="" class="modal fade" id="delete-modal" tabindex="-1" role="dialog" aria-labelledby="modalLabel">
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