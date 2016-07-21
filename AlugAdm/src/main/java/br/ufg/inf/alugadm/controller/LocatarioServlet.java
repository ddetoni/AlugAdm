package br.ufg.inf.alugadm.controller;

import br.ufg.inf.alugadm.dao.ImplsLocatarioDAO;
import br.ufg.inf.alugadm.dao.LocatarioDAO;
import br.ufg.inf.alugadm.model.Locatario;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author JuliannyAS, gustavosotnas
 */
public class LocatarioServlet extends Action {

    private static final String ACTION_SALVAR = "salvar";
    private static final String ACTION_EXCLUIR = "excluir";
    private static final String ACTION_EDITAR = "editar";
    private static final String ACTION_MOSTRAR = "mostrar";
    private static final String ACTION_CODIGOS = "codigos";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        LocatarioDAO locatarioDAO = new ImplsLocatarioDAO();

        // Inicializa as variáveis que serão constantemente usadas nesse servlet
        //LocatarioDao locatarioDAO = new ImplsLocatarioDAO(); // DAO de Locatario
        String action = "";// Action que servirá de controle para qual método será executado

        if (request.getParameter("action") != null) { // Caso a action seja diferente de null ...
            action = request.getParameter("action"); // Altera o valor inicial de "" para a passada para o servlet
        }

        if (action.equalsIgnoreCase(ACTION_SALVAR)) { // Caso a action seja de cadastrar locatario...

            Locatario locatario = obterDados(request);

            locatarioDAO.salvarLocatario(locatario);
            return mapping.findForward("CadastrarEditarLocatarioRedir");

        } else if (action.equalsIgnoreCase(ACTION_EXCLUIR)) { // Caso a action seja de excluir um locatario...
            int id = Integer.parseInt(request.getParameter("codigoLocatario")); // Pega o id do locatario pela requisição

            locatarioDAO.excluirLocatario(id); // Executa a função de excluir o locatario
            return mapping.findForward("ExcluirLocatario");

        } else if (action.equalsIgnoreCase(ACTION_EDITAR)) { // Caso a função seja de atualizar os dados de um locatario...

            Locatario locatario = obterDados(request);

            locatarioDAO.editarLocatario(locatario);
            return mapping.findForward("CadastrarEditarLocatarioRedir");

        } else if (action.equalsIgnoreCase(ACTION_MOSTRAR)) {
            ArrayList<Locatario> listaLocatario = null;
            listaLocatario = locatarioDAO.getListaLocatarios();
            request.setAttribute("listaLocatario", listaLocatario);
            return mapping.findForward("VisualizarLocatario");

        } else if (action.equalsIgnoreCase(ACTION_CODIGOS)) {
            ArrayList<String> listaCodigoLocatario = null;
            listaCodigoLocatario = locatarioDAO.getListaCodigoLocatarios();
            request.setAttribute("listaCodigoLocatario", listaCodigoLocatario);
            return mapping.findForward("VisualizarCodigo");
        }

        // Inicializa as listas que serão enviadas para a view
        ArrayList<Locatario> listaLocatario = null;
        ArrayList<String> listaCodigoLocatario = null;

        listaLocatario = locatarioDAO.getListaLocatarios();
        listaCodigoLocatario = locatarioDAO.getListaCodigoLocatarios();
        //}

        // Envia as listas para a view.
        request.setAttribute("listaLocatario", listaLocatario);
        request.setAttribute("listaCodigoLocatario", listaCodigoLocatario);

        return mapping.findForward("VisualizarLocatario");
    }
    
    private static Locatario obterDados(HttpServletRequest request) {

        Locatario locatario = new Locatario();

        // Pega todos os dados de Locatario que está vindo da View
        String nomeLocatario = request.getParameter("nome");
        String cpfLocatario = request.getParameter("cpf");
        String rgLocatario = request.getParameter("rg");
        String orgaoLocatario = request.getParameter("orgao");
        String sexoLocatario = request.getParameter("sexo");
        String dataNascimentoLocatario = request.getParameter("dataNascimento");
        String telefone1Locatario = request.getParameter("telefone1");
        String telefone2Locatario = request.getParameter("telefone2");
        String codigoLocatario = request.getParameter("codigoLocatario");

        // Preenche a instância de Locatario com os dados da view
        locatario.setNome(nomeLocatario);
        locatario.setCpf(cpfLocatario);
        locatario.setRg(rgLocatario);
        locatario.setOrgao(orgaoLocatario);
        locatario.setSexo(sexoLocatario);
        locatario.setDataNascimento(dataNascimentoLocatario);
        locatario.setTelefone1(telefone1Locatario);
        locatario.setTelefone2(telefone2Locatario);
        locatario.setCodigoLocatario(codigoLocatario);
        
        return locatario;
    }
}
