<%@include file="/jsp/defaut/topo.jsp" %>

<div id="main" class="container text-center">
    <h3 class="page-header text-left">Cadastrar Imóvel</h3>
    <form action="/adicionarImovel">
        <div class="row">
            <div class="form-group col-md-4">
                <label for="exampleInputEmail1">Tipo de Imóvel</label>
                <input type="text" name="tipoImovel" class="form-control" id="exampleInputEmail1">
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
                    <label for="exampleInputEmail1">Estado</label>
                    <input type="text" name="estado" class="form-control" id="exampleInputEmail1">
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-4">
                <label for="exampleInputEmail1">Status do Imóvel</label>
                <input type="text" name="status" class="form-control" id="exampleInputEmail1">
            </div>
            <div class="col-md-8">
                <div class="form-group col-md-6">
                <label for="exampleInputEmail1">Logadouro</label>
                <input type="text" name="logadouro" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-6">
                    <label for="exampleInputEmail1">Complemento</label>
                    <input type="text" name="complemento" class="form-control" id="exampleInputEmail1">
                </div>
            </div>
        </div>

        <div class="row">
            <div class="form-group col-md-4">
                <label for="exampleInputEmail1">Categoria</label>
                <input type="text" name="categoria" class="form-control" id="exampleInputEmail1">
            </div>
            <div class="col-md-8">
                <div class="form-group col-md-3">
                    <label for="exampleInputEmail1">N° de Quartos</label>
                    <input type="number" name="numQuartos" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-3">
                    <label for="exampleInputEmail1">Garagem</label>
                    <input type="text" name="garagem" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-3">
                    <label for="exampleInputEmail1">Area Privativa</label>
                    <input type="text" name="areaPrivativa" class="form-control" id="exampleInputEmail1">
                </div>
                 <div class="form-group col-md-3">
                    <label for="exampleInputEmail1">Valor Alugel</label>
                    <input type="text" name="valorAlguel" class="form-control" id="exampleInputEmail1">
                </div>
            </div>
        </div>
        <hr />
        <div class="row">
            <div class="col-md-12">
                <button type="submit" class="btn btn-primary">Salvar</button>
                <a href="/AlugAdm" class="btn btn-default">Cancelar</a>
            </div>
        </div>

    </form>
</div>

<%@include file="/jsp/defaut/rodape.jsp" %>