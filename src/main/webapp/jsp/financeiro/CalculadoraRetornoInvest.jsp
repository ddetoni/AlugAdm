<%@include file="/jsp/defaut/topo.jsp" %>

<div id="main" class="container text-center">
    <h3 class="page-header text-left">Calcular Retorno sobre Investimento</h3>
    <form action="CalcularRetorno.adm" name="CalculaROI">
        <div class="row">
            <div class="form-group col-md-4">
                <label>Tipo de Formulação</label>
                <select class="form-control" name="tipo_formula">
                    <option>...</option>
                    <option>ROI=(Ganhos Obtidos - Valor Investido)/ Valor Investido</option>
                </select>   
            </div>
            <div class="col-md-8">
                <div class="form-group col-md-4">
                    <label>Ganhos Obtidos</label>
                    <input type="text" name="ganhos" class="form-control">
                </div>
                <div class="form-group col-md-4">
                    <label>Valor Investido</label>
                    <input type="text" name="investido" class="form-control">
                </div>
                <div class="form-group col-md-4">
                    <label>ROI</label>
                    <input type="text" name="resultado" class="form-control">
                </div>
            </div>
        </div>
        <hr />
        <div class="row">
            <div class="col-md-12">
                <input type="reset" id="btn-limpar" name="" value="Limpar" onclick="Limpar()">
                <input type="Button" id="btn-calcula" name="" value="Calcular" onclick="calculaROI()">                                 
            </div>
        </div>
    </form>
    <script type="text/javascript">
        function calculaROI() {
            var ganhos = parseFloat(document.CalculaROI.ganhos.value);
            var investido = parseFloat(document.CalculaROI.investido.value);

            var liquido = ganhos - investido;

            var resultado = liquido / investido;

            document.CalculaROI.resultado.value = resultado;
        }
    </script>
</div>

<div class="container">
    <div class="row">
        <a href="VisualizarFinanceiro.adm" class="btn btn-default">Voltar</a>
    </div>
</div>

<%@include file="/jsp/defaut/rodape.jsp" %>