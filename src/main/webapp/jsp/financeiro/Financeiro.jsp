<%@include file="/jsp/defaut/topo.jsp" %>

<div id="main" class="container text-center" style="margin-top: 50px">
    <div id="top" class="row">
        <div class="col-sm-2">
            <form name="form_calculadora" action="Calculadora.adm" method="post">
                <input type="submit" class="cal-icon" value="" title="Calculadora simples.">
                <h4>Calculadora Simples</h4>
            </form>
        </div>
        <div class="col-sm-1"></div>
        <div class="col-sm-2">
            <form name="form_calcularCusto" action="CalcularCusto.adm" method="post">
                <input type="submit" class="custo-icon" value="" title="Calcule os custos de oportunidade (elasticidade do preço e lucro).">
                <h4>Calculadora de Custos</h4>
            </form>
        </div>
        <div class="col-sm-1"></div>
        <div class="col-sm-2">
            <form name="form_calcularJuros" action="CalcularJuros.adm" method="post">
                <input type="submit" class="juros-icon" value="" title="Calcule os juros sobre determinados valores.">
                <h4>Calculadora de Juros</h4>
            </form>
        </div>
        <div class="col-sm-1"></div>
         <div class="col-sm-2">
            <form name="form_calcularRetorno" action="CalcularRetorno.adm" method="post">
                <input type="submit" class="invest-icon" value="" title="Cacule o retorno de seus investimentos.">
                <h4>Calculadora de ROI (Retorno de Investimento)</h4>
            </form>
         </div>
    </div> <!-- /#top -->
</div>

<%@include file="/jsp/defaut/rodape.jsp" %>