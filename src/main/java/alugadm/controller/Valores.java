package alugadm.controller;

import javax.servlet.http.HttpServletRequest;

import alugadm.model.Locatario;

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
		
		String tipopessoa = request.getParameter("tipopessoa");
		locatario.setTipoPessoa(tipopessoa);
		
		String email = request.getParameter("email");
		locatario.setEmail(email);
		
		String telefone = request.getParameter("telefone1");
		locatario.setTelefone(telefone);
		
		String recebimento = request.getParameter("tiporecebimento");
		locatario.setTipoRecebimento(recebimento);
		
		String datacadastro = request.getParameter("datacadastro");
		locatario.setDataCadastro(datacadastro);
		
		String id = request.getParameter("codigoLocatario");
		locatario.setId(id);

		return locatario;
	}
}
