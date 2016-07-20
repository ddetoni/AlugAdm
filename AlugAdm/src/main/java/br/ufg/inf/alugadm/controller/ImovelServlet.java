package br.ufg.inf.alugadm.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import br.ufg.inf.alugadm.dao.ImovelDAO;
import br.ufg.inf.alugadm.model.Imovel;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;

public class ImovelServlet extends Action {
    
        private static final String ACTION_CADASTRAR_IMOVEL = "SalvarImovel";
        private static final String ACTION_VISUALIZAR_IMOVEL = "VisualizarImovel";

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		String action = "";

                if (request.getParameter("action") != null) { // Caso a action seja diferente de null ...
                    action = request.getParameter("action");
                } // Altera o valor inicial de "" para a passada para o servlet
                if(action.equalsIgnoreCase(ACTION_CADASTRAR_IMOVEL)){
                    
                    String code = verifica(request, "code");
                    String tipo = verifica(request, "tipo");
                    String data = verifica(request, "data");
                    String estado = verifica(request, "estado");
                    String status = verifica(request, "status");
                    String logradouro = verifica(request, "logradouro");
                    String complemento = verifica(request, "complemento");
                    String categoria = verifica(request, "categoria");
                    String garagem = verifica(request, "garagem");
                    String valor = verifica(request, "valor");
                    String cep = verifica(request, "cep");

                    Imovel imovel = new Imovel();

                    int codeint = Integer.parseInt(code);
                    imovel.setCode(codeint);
                    imovel.setTipo(tipo);
                    imovel.setData(data);
                    imovel.setEstado(estado);
                    imovel.setStatus(status);
                    imovel.setLogradouro(logradouro);
                    imovel.setComplemento(complemento);
                    imovel.setCategoria(categoria);

                    boolean garagembool = convertBoolean(garagem);
                    imovel.setGaragem(garagembool);

                    float valorfloat = Float.parseFloat(valor);
                    imovel.setValor(valorfloat);

                    imovel.setCep(cep);

                    ImovelDAO imovelDAO = null;
                    try {
                            imovelDAO = new ImovelDAO();
                            imovelDAO.register(imovel);
                    } catch (SQLException e) {
                            e.printStackTrace();
                    }
                    return mapping.findForward("CadastrarImovel");

                }
                
                //Caso a action seja de visualizar imóvel
               
                if(action.equalsIgnoreCase(ACTION_VISUALIZAR_IMOVEL)){
                    
                     HttpSession session = request.getSession();
                     
                    ImovelDAO imovelDao = new ImovelDAO();
                   //acessa uma lista de imoveis no banco de dados
                   ArrayList<Imovel> listaImovel = imovelDao.getListaImoveis();
                   
                   request.setAttribute("listaImovel", listaImovel);

                   return mapping.findForward("VisualizarImovel");
                }
                
                
                
                return mapping.findForward("Error");
          }
    
            
                

	private boolean convertBoolean(String var) {

		boolean convert = false;

		if (var == "sim") {
			convert = true;
			return convert;
		}

		return convert;
	}

	private String verifica(HttpServletRequest req, String valor) {

		String resultado = req.getParameter(valor);

		if (resultado == null) {
			System.out.println("parametro vazio");
		} else {
			return resultado;
		}

		return null;
	}

}
