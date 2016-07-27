package br.ufg.inf.alugadm.controller;

import javax.servlet.http.HttpServletRequest;

import br.ufg.inf.alugadm.model.Locatario;

public class Valores {

	public Locatario recebeValoresLocatario(HttpServletRequest request) {

		Locatario locatario = new Locatario();

		String nome = request.getParameter("nome");
		locatario.setNome(nome);
		
		String cpf = request.getParameter("cpf");
		locatario.setCpf(cpf);
		
		String rg = request.getParameter("rg");
		locatario.setIdentidade(rg);
		
		String orgao = request.getParameter("orgao");
		locatario.setOrgao(orgao);
		
		String sexo = request.getParameter("sexo");
		locatario.setSexo(sexo);
		
		String datanasc = request.getParameter("dataNascimento");
		locatario.setDataNascimento(datanasc);
		
		// tipo pessoa nao existe no jsp
		// email não existe no jsp
		
		String telefone = request.getParameter("telefone1");
		locatario.setTelefone(telefone);
		
		// tipo recebimento não existe no jsp
		// data cadastro nao exinte no jsp
		
		String id = request.getParameter("codigoLocatario");
		locatario.setId(id);

		return locatario;
	}
}
