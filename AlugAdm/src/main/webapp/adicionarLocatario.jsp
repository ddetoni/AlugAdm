<%@include file="topo.jsp" %>

<div id="main" class="container text-center">
    <h3 class="page-header text-left">Adicionar Locatário</h3>
    <form action="index.html">
        <div class="row">          
            <div class="form-group col-md-4">
                <label for="exampleInputEmail1">Nome</label>
                <input type="email" class="form-control" id="exampleInputEmail1">
            </div>
            <div class="col-md-8">
                <div class="form-group col-md-3">
                    <label for="exampleInputEmail1">Data de Nascimento</label>
                    <input type="email" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-3">
                    <label for="exampleInputEmail1">Sexo</label>
                    <input type="email" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-3">
                    <label for="exampleInputEmail1">Telefone 1</label>
                    <input type="email" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-3">
                    <label for="exampleInputEmail1">Telefone 2</label>
                    <input type="email" class="form-control" id="exampleInputEmail1">
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-4">
                <label for="exampleInputEmail1">CPF</label>
                <input type="email" class="form-control" id="exampleInputEmail1">
            </div>
            <div class="col-md-8">
                <div class="checkbox col-md-6">
                    <p><strong>Sexo</strong></p>
                    <label>
                        <input type="checkbox"> Homem
                    </label>
                    <label style="margin-left: 50px;">
                        <input type="checkbox"> Mulher
                    </label>
                </div>
                <div class="form-group col-md-6">
                    <label for="exampleInputEmail1">Email</label>
                    <input type="email" class="form-control" id="exampleInputEmail1">
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-md-4">
                <div class=" col-md-8">
                    <label for="exampleInputEmail1">Numero de Identidade</label>
                    <input type="email" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-4">
                    <label for="exampleInputEmail1">Orgão</label>
                    <input type="email" class="form-control" id="exampleInputEmail1">
                </div>
            </div>
            <div class="col-md-8">
                <div class="checkbox col-md-6">
                    <p><strong>Tipo de Pessoa</strong></p>
                    <label>
                        <input type="checkbox"> Fisica
                    </label>
                    <label style="margin-left: 50px;">
                        <input type="checkbox"> Juridica
                    </label>
                </div>
                <div class="form-group col-md-3">
                    <label for="exampleInputEmail1">Tipo  de Recebimento</label>
                    <input type="email" class="form-control" id="exampleInputEmail1">
                </div>
                <div class="form-group col-md-3">
                    <label for="exampleInputEmail1">Data de Cadastro</label>
                    <input type="email" class="form-control" id="exampleInputEmail1">
                </div>
            </div>
        </div>
        <hr />
        <div class="row">
            <div class="col-md-12">
                <button type="submit" class="btn btn-primary">Salvar</button>
                <a href="index.jsp" class="btn btn-default">Cancelar</a>
            </div>
        </div>

    </form>
</div>

<%@include file="rodape.jsp" %>