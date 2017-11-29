package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import dao.ImplsLocatarioDAO;
import dao.LocatarioDAO;
import java.util.ArrayList;
import model.Locatario;

public class LocatarioServlet extends org.apache.struts.action.Action {

	private static final String ACTION_SALVAR = "salvar_locatario";
	private static final String ACTION_EXCLUIR = "excluir";
	private static final String ACTION_EDITAR = "editar";
	private static final String ACTION_MOSTRAR = "mostrar_imoveis";
	private static final String ACTION_CODIGOS = "codigos";
        private static final String ACTION_CADASTRAR = "cadastrar";

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		LocatarioDAO locatarioDAO = new ImplsLocatarioDAO();
		String action = "";

		if (request.getParameter("action") != null) {
			action = request.getParameter("action");
		}

		if (action.equalsIgnoreCase(ACTION_SALVAR)) {

			Valores valores = new Valores();

			Locatario locatario = valores.recebeValoresLocatario(request);
			locatarioDAO.inserir(locatario);

			return mapping.findForward("CadastrarLocatario");

		} else if (action.equalsIgnoreCase(ACTION_EDITAR)) {

			Valores valores = new Valores();

			Locatario locatario = valores.recebeValoresLocatario(request);
			locatarioDAO.inserir(locatario);

			return mapping.findForward("EditarLocatario");
                        
		} else if (action.equalsIgnoreCase(ACTION_CADASTRAR)){
                    return mapping.findForward("CadastrarLocatario");
                }

		ArrayList<Locatario> listaLocatario = new ArrayList<Locatario>();
                listaLocatario = locatarioDAO.getListaLocatarios();
                request.setAttribute("listaLocatario", listaLocatario);

                return mapping.findForward("VisualizarLocatario");
	}

}
