package br.ufg.inf.alugadm.controller;

import br.ufg.inf.alugadm.dao.ImovelDao;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author JuliannyAS
 */
public class ImovelServlet extends org.apache.struts.action.Action {

    private static final String ACTION_SALVAR = "salvar";
    private static final String ACTION_EXCLUIR = "excluir";
    private static final String ACTION_EDITAR = "editar";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
          // Inicializa as variáveis que serão constantemente usadas nesse servlet
        HttpSession session = request.getSession(); // Sessão do usuario logado
        ImovelDao imovelDAO = new ImovelDao(); // DAO de Pedido Desembolso

        int prefRegionalMatricula = imovelDAO.getRegionalPorMatricula(matricula); //Regional do matrícula dos regionais
        if (request.getParameter("action") != null) { // Caso a action seja diferente de null ...
            action = request.getParameter("action"); // Altera o valor inicial de "" para a passada para o servlet
        }

        if (action.equalsIgnoreCase(ACTION_ENVIAR)) { // Caso a action seja de enviar um novo pedido de desembolso...
            PedidoDesembolso pedidoDesembolso = new PedidoDesembolso();

            // Pega o nome da dependência e o prefixo da regional do prefixo salvo na sessão
            nomeDep = pedidoDAO.getNomeDependencia(Integer.parseInt(session.getAttribute("prefixo").toString()));
            prefReg = pedidoDAO.getPrefixoRegional(Integer.parseInt(session.getAttribute("prefixo").toString()));
            
            
            // Pega todos os dados de Pedido de Desembolso que está vindo da View
            String nomeCliente = request.getParameter("nomeCliente");
            String mci = request.getParameter("mci");
            String numProposta = request.getParameter("numProposta");
            String numOperacao = request.getParameter("numOperacao");
            Double valorSolicitado = Double.parseDouble(request.getParameter("valorSolicitacao").replace(".", "").replace(",", "."));
            String linha = request.getParameter("linha");
            String municipio = request.getParameter("municipio");
            boolean primeiroDesembolso = Boolean.valueOf(request.getParameter("primeiroDesembolso"));
            Integer percentual = Integer.parseInt(request.getParameter("percentual"));

            // Preenche a instância de PedidoDesembolso com os dados da view
            pedidoDesembolso.setPrefDep(Integer.parseInt(session.getAttribute("prefixo").toString()));
            pedidoDesembolso.setNomeDep(nomeDep);
            pedidoDesembolso.setPrefReg(prefReg);
            pedidoDesembolso.setNomeCliente(nomeCliente);
            pedidoDesembolso.setMci(mci);
            pedidoDesembolso.setNumProposta(numProposta);
            pedidoDesembolso.setNumOperacao(numOperacao);
            pedidoDesembolso.setValorSolicitacao(valorSolicitado);
            pedidoDesembolso.setLinha(linha);
            pedidoDesembolso.setMunicipio(municipio);
            pedidoDesembolso.setPrimeiroDesembolso(primeiroDesembolso);
            pedidoDesembolso.setPercentual(percentual);
            
            pedidoDAO.inserePedido(pedidoDesembolso, matricula); // Executa a função de salvar o novo pedido de desembolso
        } else if (action.equalsIgnoreCase(ACTION_EXCLUIR)) { // Caso a action seja de excluir um pedido de desembolso ...
            int id = Integer.parseInt(request.getParameter("id_pedido")); // Pega o id do pedido enviado pela requisição
            pedidoDAO.excluiPedido(id, matricula); // Executa a função de excluir o Pedido de Desembolso
        } else if (action.equalsIgnoreCase(ACTION_ATUALIZAR)) { // Caso a função seja de atualizar os dados de um Pedido de Desembolso...
            PedidoDesembolso pedidoDesembolso = new PedidoDesembolso();

            // Pega todos os dados de Pedido de Desembolso que está vindo da View
            int id = Integer.parseInt(request.getParameter("id"));
            String nomeCliente = request.getParameter("nomeCliente");
            String mci = request.getParameter("mci");
            String numProposta = request.getParameter("numProposta");
            String numOperacao = request.getParameter("numOperacao");
            Double valorSolicitado = Double.parseDouble(request.getParameter("valorSolicitacao").replace(".", "").replace(",", "."));
            String linha = request.getParameter("linha");
            String municipio = request.getParameter("municipio");
            boolean primeiroDesembolso = Boolean.valueOf(request.getParameter("primeiroDesembolso"));
            Integer percentual = Integer.parseInt(request.getParameter("percentual"));

            // Preenche a instância de PedidoDesembolso com os dados da view
            pedidoDesembolso.setId(id);
            pedidoDesembolso.setPrefDep(Integer.parseInt(session.getAttribute("prefixo").toString()));
            pedidoDesembolso.setNomeCliente(nomeCliente);
            pedidoDesembolso.setMci(mci);
            pedidoDesembolso.setNumProposta(numProposta);
            pedidoDesembolso.setNumOperacao(numOperacao);
            pedidoDesembolso.setValorSolicitacao(valorSolicitado);
            pedidoDesembolso.setLinha(linha);
            pedidoDesembolso.setMunicipio(municipio);
            pedidoDesembolso.setPrimeiroDesembolso(primeiroDesembolso);
            pedidoDesembolso.setPercentual(percentual);
            pedidoDAO.editarPedido(pedidoDesembolso, matricula); // Executa a função de atualizar um Pedido de Desembolso
            
               // Inicializa as listas que serão enviadas para a view
        ArrayList<PedidoDesembolso> listaAnalise = null;
        ArrayList<PedidoDesembolso> listaGerev = null;
        ArrayList<PedidoDesembolso> listaAutorizado = null;
        ArrayList<PedidoDesembolso> listaDevolvido = null;

        // Caso o campo de filtro de prefixo seja enviado pela requisição...
        /*if (filtroPrefixoString != null && !filtroPrefixoString.equals("")) {
            int filtroPrefixo = Integer.parseInt(filtroPrefixoString); // Pega o valor do filtro enviado pela requisição
            // Preenche as lista de acordo com o Status do Pedido de Desembolso
            listaAnalise = pedidoDAO.getPedidosPorStatus(PedidoDesembolsoDAO.STATUS_ANALISE, filtroPrefixo, matricula);
            listaAutorizado = pedidoDAO.getPedidosPorStatus(PedidoDesembolsoDAO.STATUS_AUTORIZADO, filtroPrefixo, matricula);
            listaDevolvido = pedidoDAO.getPedidosPorStatus(PedidoDesembolsoDAO.STATUS_DEVOLVIDO, filtroPrefixo, matricula);
        } else {*/
            
            listaAnalise = pedidoDAO.getPedidosPorStatus(PedidoDesembolsoDAO.STATUS_ANALISE, prefixo, matricula, prefRegionalMatricula);
            listaGerev = pedidoDAO.getPedidosAnaliseGerev(PedidoDesembolsoDAO.STATUS_ANALISE_GEREV, prefRegionalMatricula, matricula, prefixo);
            listaAutorizado = pedidoDAO.getPedidosPorStatus(PedidoDesembolsoDAO.STATUS_AUTORIZADO, prefixo, matricula, prefRegionalMatricula);
            listaDevolvido = pedidoDAO.getPedidosPorStatus(PedidoDesembolsoDAO.STATUS_DEVOLVIDO, prefixo, matricula, prefRegionalMatricula);
        //}
        
        
        // Envia as listas para a view.
        request.setAttribute("listaGerev", listaGerev);
        request.setAttribute("listaMunicipios", pedidoDAO.getListaMunicipios());
        request.setAttribute("listaAnalise", listaAnalise);
        request.setAttribute("listaAutorizado", listaAutorizado);
        request.setAttribute("listaDevolvido", listaDevolvido);
        request.setAttribute("isAdmin", pedidoDAO.isAdmin(matricula));
        request.setAttribute("isGerev", pedidoDAO.isGerev(matricula));

        return mapping.findForward("fwdNovoPedidoDesembolsoPJ");

    }

}
