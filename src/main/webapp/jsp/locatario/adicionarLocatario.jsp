<%@include file="/jsp/defaut/topo.jsp" %>

<div id="main" class="container text-center">
    <h3 class="page-header text-left">Cadastrar Locatário</h3>
    <form action="SalvarLocatario.adm">
        <div class="row">
            <div class="form-group col-md-5">
                <label for="exampleInputEmail1">Nome</label>
                <input type="text" name="nome" class="form-control" id="exampleInputEmail1">
            </div>
            <div class="col-md-7">
                <div class="form-group col-md-5">
                    <label for="exampleInputEmail1">CPF</label>
                    <input type="text" name="cpf" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-4">
                    <label for="exampleInputEmail1">RG</label>
                    <input type="text" name="rg" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-3">
                    <label for="exampleInputEmail1">Orgão Expedidor</label>
                    <input type="text" name="orgao" class="form-control" id="exampleInputEmail1">
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-2">
                <label for="exampleInputEmail1">Sexo</label>
                <select class="form-control" id="exampleInputEmail1" name="sexo">
                    <option>...</option>
                    <option>Masculino</option>
                    <option>Feminino</option>
                </select>
                <!--                <input type="text" name="status" class="form-control" id="exampleInputEmail1">-->
            </div>
            <div class="col-md-10">
                <div class="form-group col-md-3">
                    <label for="exampleInputEmail1">Data de Nascimento</label>
                    <input type="date" name="dataNascimento" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-3">
                    <label for="exampleInputEmail1">Tipo de Pessoa</label>
                    <input type="text" name="tipopessoa" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-3">
                    <label for="exampleInputEmail1">email</label>
                    <input type="email" name="email" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-3">
                    <label for="exampleInputEmail1">Telefone 1</label>
                    <input type="text" name="telefone1" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-3">
                    <label for="exampleInputEmail1">Telefone 2</label>
                    <input type="text" name="telefone2" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-3">
                    <label for="exampleInputEmail1">Tipo de Recebimento</label>
                    <input type="text" name="tiporecebimento" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-3">
                    <label for="exampleInputEmail1">Data de Cadastro</label>
                    <input type="date" name="datacadastro" class="form-control" id="exampleInputEmail1">
                </div>
                 <div class="form-group col-md-3">
                    <label for="exampleInputEmail1">Código</label>
                    <input type="number" name="codigoLocatario" class="form-control" id="exampleInputEmail1">
                </div>
            </div>
        </div>
        <hr />
        <div class="row">
            <div class="col-md-12">
                <button type="submit" class="btn btn-primary" value="salvar_locatario" name="salvar_locatario">Salvar</button>
                <a href="VisualizarLocatario.adm" class="btn btn-default">Cancelar</a>
            </div>
        </div>

    </form>
</div>

<%@include file="/jsp/defaut/rodape.jsp" %>