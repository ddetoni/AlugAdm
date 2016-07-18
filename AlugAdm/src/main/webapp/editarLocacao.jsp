<%@include file="topo.jsp" %>

<div id="main" class="container">
    <h3 class="page-header">Editar Aluno :</h3>
    <form action="index.jsp">
        <div class="row">
            <div class="col-md-2"></div>
            <div class="form-group col-md-2">
                <label for="exampleInputEmail1 text-center">Matricula</label>
                <input type="email" class="form-control" id="exampleInputEmail1" placeholder="">
            </div>
            <div class="form-group col-md-6 text-left">
                <label for="exampleInputEmail1">Nome</label>
                <input type="email" class="form-control" id="exampleInputEmail1">
            </div>
            <div class="col-md-2"></div>
        </div>
        <div class="row">
            <div class="col-md-2"></div>
            <div class="form-group col-md-2">
                <label for="exampleInputEmail1 text-center">Data de Nascimento</label>
                <input type="email" class="form-control" id="exampleInputEmail1">
            </div>
            <div class="form-group col-md-6 text-left">
                <label for="exampleInputEmail1">Email</label>
                <input type="email" class="form-control" id="exampleInputEmail1">
            </div>
            <div class="col-md-2"></div>
        </div>
        <hr/>
        <div class="row">
            <div class="row">
                <div class="col-md-12 text-center">
                    <button type="submit" class="btn btn-primary">Atualizar</button>
                    <a href="index.jsp" class="btn btn-default">Cancelar</a>
                </div>
            </div>
        </div>
    </form>
</div>

<%@include file="rodape.jsp" %>