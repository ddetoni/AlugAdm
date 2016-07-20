<%@include file="/jsp/defaut/topo.jsp" %>

<div id="main" class="container text-center">
    <h3 class="page-header text-left">Cadastrar Imóvel</h3>
    <form action="SalvarImovel.adm">
        <div class="row">
            <div class="form-group col-md-4">
                <label for="exampleInputEmail1">Tipo de Imóvel</label>
                <select class="form-control" id="exampleInputEmail1" name="tipoImovel">
                    <option>...</option>
                    <option>Casa</option>
                    <option>Apartamento</option>
                    <option>Loja</option>
                </select>
                <!--<input type="text" name="tipoImovel" placeholder="ex:casa, apartamento, sitio..." class="form-control" id="exampleInputEmail1">-->
            </div>
            <div class="col-md-8">
                <div class="form-group col-md-4">
                    <label for="exampleInputEmail1">Código</label>
                    <input type="text" name="codigoImovel" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-4">
                    <label for="exampleInputEmail1">Data de Cadastro</label>
                    <input type="date" name="dataCadastro" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-4">
                    <label for="exampleInputEmail1">Valor Alugel</label>
                    <input type="text" name="valorAlguel" class="form-control" id="exampleInputEmail1">
                </div>

            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-4">
                <label for="exampleInputEmail1">Status do Imóvel</label>
                <select class="form-control" id="exampleInputEmail1" name="status">
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
                    <label for="exampleInputEmail1">Logradouro</label>
                    <input type="text" name="logradouro" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-6">
                    <label for="exampleInputEmail1">Complemento</label>
                    <input type="text" name="complemento" class="form-control" id="exampleInputEmail1">
                </div>
            </div>
            <div class="col-md-4">
                <div class="form-group col-md-6">
                    <label for="exampleInputEmail1">Cidade</label>
                    <input type="text" name="cidade" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-6">
                    <label for="exampleInputEmail1">Estado</label>
                    <input type="text" name="estado" class="form-control" id="exampleInputEmail1">
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-4">
                <label for="exampleInputEmail1">Categoria</label>
                <select class="form-control" id="exampleInputEmail1" name="categoria">
                    <option>...</option>
                    <option>Residencial</option>
                    <option>Comercial</option>
                </select>
                <!--<input type="text" name="categoria" class="form-control" id="exampleInputEmail1">-->
            </div>
            <div class="col-md-8">
                <div class="form-group col-md-4">
                    <label for="exampleInputEmail1">N° de Quartos</label>
                    <input type="number" name="numQuartos" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-4">
                    <label for="exampleInputEmail1">Garagem</label>
                    <select class="form-control" id="exampleInputEmail1" name="garagem">
                        <option>...</option>
                        <option>Sim</option>
                        <option>Não</option>
                    </select>
                    <!--<input type="" name="garagem" class="form-control" id="exampleInputEmail1">-->
                </div>
                <div class="form-group col-md-4">
                    <label for="exampleInputEmail1">CEP</label>
                    <input type="text" name="cep" class="form-control" id="exampleInputEmail1">
                </div>
            </div>
        </div>
        <hr />
        <div class="row">
            <div class="col-md-12">
                <button type="submit" class="btn btn-primary">Salvar</button>
                <a href="VisualizarImovel.adm" class="btn btn-default">Cancelar</a>
            </div>
        </div>
    </form>
</div>

<%@include file="/jsp/defaut/rodape.jsp" %>