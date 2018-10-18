package alugadm.controller;

import alugadm.dao.ImplsImovelDAO;
import alugadm.model.Imovel;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 * @author JuliannyAS
 */
public class ImovelServlet extends org.apache.struts.action.Action {

    private static final String ACTION_SALVAR = "salvar";
    private static final String ACTION_EXCLUIR = "excluir";
    private static final String ACTION_EDITAR = "editar";
    private static final String ACTION_MOSTRAR_IMOVEIS = "mostrar_imoveis";
    private static final String ACTION_CODIGOS = "codigos";
    private static final String ACTION_CADASTRAR = "cadastrar";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        // Inicializa as variáveis que serão constantemente usadas nesse servlet
        ImplsImovelDAO imovelDAO = new ImplsImovelDAO();
        String action = "";// Action que servirá de controle para qual método será executado

        if (request.getParameter("action") != null) { // Caso a action seja diferente de null ...
            action = request.getParameter("action"); // Altera o valor inicial de "" para a passada para o servlet
        }

        if (action.equalsIgnoreCase(ACTION_CADASTRAR)) {

            return mapping.findForward("fwdCadastrarImovel");
        }

        if (action.equalsIgnoreCase(ACTION_MOSTRAR_IMOVEIS)) {
            ArrayList<Imovel> listaImovel = imovelDAO.getListaImoveis();
            request.setAttribute("listaImovel", listaImovel);

            return mapping.findForward("fwdVisualizarImovel");
        }

        if (action.equalsIgnoreCase(ACTION_CODIGOS)) {
            ArrayList<String> listaCodigoImovel = new ArrayList<String>();
            listaCodigoImovel = imovelDAO.getListaCodigoImoveis();
            request.setAttribute("listaCodigoImovel", listaCodigoImovel);
            return mapping.findForward("fwdVisualizarCodigo");
        }


        if (action.equalsIgnoreCase(ACTION_EXCLUIR)) { // Caso a action seja de excluir um imovel...
            int id = Integer.parseInt(request.getParameter("codigoImovel")); // Pega o id do imovel pela requisição

            imovelDAO.excluirImovel(id); // Executa a função de excluir o imovel
            return mapping.findForward("fwdExcluirImovel");

        }

        if (action.equalsIgnoreCase(ACTION_SALVAR)) { // Caso a action seja de cadastrar imovel...
            Imovel imovel = new Imovel();

            // Pega todos os dados de Imovel que está vindo da View
            String id = request.getParameter("id");
            String data_cadastro = request.getParameter("data_cadastro");
            String categoria = request.getParameter("categoria");
            String tipo_imovel = request.getParameter("tipo_imovel");
            String status = request.getParameter("status");
            String logradouro = request.getParameter("logradouro");
            String complemento = request.getParameter("complemento");
            String cidade = request.getParameter("cidade");
            String estado = request.getParameter("estado");
            String num_quartos = request.getParameter("num_quartos");
            String garagem = request.getParameter("garagem");
            String valor_aluguel = request.getParameter("valor_aluguel");
            String cep = request.getParameter("cep");

            // Preenche a instância de Imovel com os dados da view
            imovel.setId(id);
            imovel.setData_cadastro(data_cadastro);
            imovel.setCategoria(categoria);
            imovel.setTipo_imovel(tipo_imovel);
            imovel.setStatus(status);
            imovel.setLogradouro(logradouro);
            imovel.setComplemento(complemento);
            imovel.setCidade(cidade);
            imovel.setEstado(estado);
            imovel.setNum_quartos(num_quartos);
            imovel.setGaragem(garagem);
            imovel.setValor_aluguel(valor_aluguel);
            imovel.setCep(cep);

            imovelDAO.salvarImovel(imovel);
            return mapping.findForward("fwdCadastrarImovel");

        }


        ArrayList<Imovel> listaImovel = new ArrayList<Imovel>();
        listaImovel = imovelDAO.getListaImoveis();
        request.setAttribute("listaImovel", listaImovel);

        return mapping.findForward("fwdVisualizarImovel");
    }

}
