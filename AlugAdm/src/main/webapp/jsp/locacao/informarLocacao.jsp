<%@include file="/jsp/defaut/topo.jsp" %>

<div id="main" class="container text-center">
    <h3 class="page-header text-left">Informar Locação</h3>
    <form action="SalvarLocacao.adm"> 
        <div class="row">
            <div class="form-group col-md-6">
                <label for="exampleInputEmail1">Imóvel</label>
                <select class="form-control" id="exampleInputEmail1" name="imoveis">
                    <c:forTokens var="imovel" items="${listaImovel}">
                        <option>${imovel.codigo}</option>
                    </c:forTokens>
                </select>
                <!--<input type="search" class="form-control" id="exampleInputEmail1" placeholder="">-->
            </div>
            <div class="form-group col-md-6 text-left">
                <label for="exampleInputEmail1">Locatário</label>
                <select class="form-control" id="exampleInputEmail1" name="locatarios">
                    <c:forTokens var="locatario" items="${listaLocatario}">
                        <option>${locatario.codigo}</option>
                    </c:forTokens>
                </select>
                <!--<input type="emailil" class="form-control" id="exampleInputEmail1">-->
            </div>
            <div class="col-md-2"></div>
        </div>
        <div class="row">
            <div class="form-group col-md-2">
                <label for="exampleInputEmail1">N° do Contrato</label>
                <input type="text" name="numContrato" class="form-control" id="exampleInputEmail1">
            </div>
            <div class="form-group col-md-2">
                <label for="exampleInputEmail1">Inicio Contrato</label>
                <input type="date" name="inicioContrato" class="form-control" id="exampleInputEmail1">
            </div>
            <div class="form-group col-md-2">
                <label for="exampleInputEmail1">Termino Contrato</label>
                <input type="date" name="terminoContrato" class="form-control" id="exampleInputEmail1">
            </div>
            <div class="form-group col-md-2">
                <label for="exampleInputEmail1">Dia do Vencimento</label>
                <input type="number" name="diaVencimento" class="form-control" id="exampleInputEmail1">
            </div>
            <div class="form-group col-md-2">
                <label for="exampleInputEmail1">Valor do Aluguel</label>
                <input type="text" name="valorAluguel" class="form-control" id="exampleInputEmail1">
            </div>
            <div class="form-group col-md-2">
                <label for="exampleInputEmail1">Tolerancia Dias</label>
                <input type="number" name="toleranciaDias" class="form-control" id="exampleInputEmail1">
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