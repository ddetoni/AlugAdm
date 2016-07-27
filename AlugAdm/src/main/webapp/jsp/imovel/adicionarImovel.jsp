<%@include file="/jsp/defaut/topo.jsp" %>

<div id="main" class="container text-center">
    <h3 class="page-header text-left">Cadastrar Imóvel</h3>
    <form action="SalvarImovel.adm">
        <div class="row">
            <div class="form-group col-md-4">
                <label>Tipo de Imóvel</label>
                <select class="form-control" name="tipo_imovel">
                    <option>...</option>
                    <option>Casa</option>
                    <option>Apartamento</option>
                    <option>Loja</option>
                </select>
                <!--<input type="text" name="tipoImovel" placeholder="ex:casa, apartamento, sitio..." class="form-control" id="exampleInputEmail1">-->
            </div>
            <div class="col-md-8">
                <div class="form-group col-md-4">
                    <label>Código</label>
                    <input type="text" name="id" class="form-control">
                </div>
                <div class="form-group col-md-4">
                    <label>Data de Cadastro</label>
                    <input type="date" name="data_cadastro" class="form-control">
                </div>
                <div class="form-group col-md-4">
                    <label>Valor Alugel</label>
                    <input type="text" name="valor_aluguel" class="form-control">
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-4">
                <label>Status do Imóvel</label>
                <select class="form-control" name="status">
                    <option>...</option>
                    <option>Em construção</option>
                    <option>Em reforma</option>
                    <option>Disponivel</option>
                    <option>Alugado</option>
                </select>
                <!--                <input type="text" name="status" class="form-control" id="exampleInputEmail1">-->
            </div>
            <div class="col-md-4">
                <div class="form-group col-md-6">
                    <label>Logradouro</label>
                    <input type="text" name="logradouro" class="form-control">
                </div>
                <div class="form-group col-md-6">
                    <label>Complemento</label>
                    <input type="text" name="complemento" class="form-control">
                </div>
            </div>
            <div class="col-md-4">
                <div class="form-group col-md-6">
                    <label>Cidade</label>
                    <input type="text" name="cidade" class="form-control">
                </div>
                <div class="form-group col-md-6">
                    <label>Estado</label>
                    <input type="text" name="estado" class="form-control">
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-4">
                <label>Categoria</label>
                <select class="form-control" name="categoria">
                    <option>...</option>
                    <option>Residencial</option>
                    <option>Comercial</option>
                </select>
                <!--<input type="text" name="categoria" class="form-control" id="exampleInputEmail1">-->
            </div>
            <div class="col-md-8">
                <div class="form-group col-md-4">
                    <label>N° de Quartos</label>
                    <input type="text" name="num_quartos" class="form-control">
                </div>
                <div class="form-group col-md-4">
                    <label>Garagem</label>
                    <select class="form-control" name="garagem">
                        <option>...</option>
                        <option>Sim</option>
                        <option>Não</option>
                    </select>
                    <!--<input type="" name="garagem" class="form-control" id="exampleInputEmail1">-->
                </div>
                <div class="form-group col-md-4">
                    <label>CEP</label>
                    <input type="text" name="cep" class="form-control">
                </div>
            </div>
        </div>
        <hr />
        <div class="row">
            <div class="col-md-12">
                <form name="form_cadastrarImovel" action="SalvarImovel.adm" method="post">
                    <button type="submit" class="btn btn-default">
                        <input type="hidden" name="action" value="salvar" />
                        <span style="vertical-align: middle;">Salvar</span>
                    </button>
                </form>
                <a href="VisualizarImovel.adm" class="btn btn-default">Cancelar</a>
            </div>
        </div>
    </form>
</div>

<%@include file="/jsp/defaut/rodape.jsp" %>