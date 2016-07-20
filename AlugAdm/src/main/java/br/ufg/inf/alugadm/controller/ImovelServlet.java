package br.ufg.inf.alugadm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufg.inf.alugadm.dao.ImovelDAO;
import br.ufg.inf.alugadm.model.Imovel;

@WebServlet("/adicionaImovel")
public class ImovelServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

			String code = verifica(request, "code");
			String tipo = verifica(request, "tipo");
			String data = verifica(request,"data");
			String estado = verifica(request, "estado");
			String status = verifica(request,"status");
			String logradouro = verifica(request, "logradouro");
			String complemento = verifica(request, "complemento");
			String categoria = verifica(request, "categoria");
			String garagem = verifica(request, "garagem");
			String area = verifica(request, "areaPrivativa");
			String valor = verifica(request, "valor");
			
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
			
			boolean areabool = convertBoolean(area);
			imovel.setAreaPrivativa(areabool);
			
			float valorfloat = Float.parseFloat(valor);
			imovel.setValor(valorfloat);
			
			ImovelDAO imovelDAO = new ImovelDAO();
			imovelDAO.register(imovel);
			

	}
	
	private boolean convertBoolean(String var){
		
		boolean convert = false;
		
		if(var == "sim"){
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
