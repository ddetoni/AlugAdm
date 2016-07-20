<%@include file="/jsp/defaut/topo.jsp" %>

<div id="main" class="container">
    <h3 class="page-header">Editar Imovel </h3>
      <form action="index.html">
        <div class="row">
            <div class="form-group col-md-4">
                <label for="exampleInputEmail1">Tipo de Imóvel</label>
                <input type="email" class="form-control" id="exampleInputEmail1">
            </div>
            <div class="col-md-8">
                <div class="form-group col-md-4">
                    <label for="exampleInputEmail1">Código</label>
                    <input type="email" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-4">
                    <label for="exampleInputEmail1">Data de Cadastro</label>
                    <input type="email" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-4">
                    <label for="exampleInputEmail1">Estado</label>
                    <input type="email" class="form-control" id="exampleInputEmail1">
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-4">
                <label for="exampleInputEmail1">Status do Imóvel</label>
                <input type="email" class="form-control" id="exampleInputEmail1">
            </div>
            <div class="col-md-8">
                <div class="form-group col-md-6">
                <label for="exampleInputEmail1">Logadouro</label>
                <input type="email" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-6">
                    <label for="exampleInputEmail1">Complemento</label>
                    <input type="email" class="form-control" id="exampleInputEmail1">
                </div>
            </div>
        </div>

        <div class="row">
            <div class="form-group col-md-4">
                <label for="exampleInputEmail1">Categoria</label>
                <input type="email" class="form-control" id="exampleInputEmail1">
            </div>
            <div class="col-md-8">
                <div class="form-group col-md-3">
                    <label for="exampleInputEmail1">N° de Quartos</label>
                    <input type="email" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-3">
                    <label for="exampleInputEmail1">Garagem</label>
                    <input type="email" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-3">
                    <label for="exampleInputEmail1">Area Privativa</label>
                    <input type="email" class="form-control" id="exampleInputEmail1">
                </div>
                 <div class="form-group col-md-3">
                    <label for="exampleInputEmail1">Valor Sugerido</label>
                    <input type="email" class="form-control" id="exampleInputEmail1">
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