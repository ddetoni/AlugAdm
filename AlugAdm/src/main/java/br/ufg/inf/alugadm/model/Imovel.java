package br.ufg.inf.alugadm.model;

public class Imovel {

	private int codigoImovel;
	private String tipo;
	private String dataCadastro;
	private float valorAlguel;
	private String status;
	private String logradouro;
	private String complemento;
	private String cidade;
	private String estado;
	private String categoria;
	private int numQuartos;
	private boolean garagem;
	private String cep;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCode() {
		return codigoImovel;
	}

	public void setCode(int code) {
		this.codigoImovel = code;
	}

	public String getData() {
		return dataCadastro;
	}

	public void setData(String data) {
		this.dataCadastro = data;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getNumQuartos() {
		return numQuartos;
	}

	public void setNumQuartos(int numQuartos) {
		this.numQuartos = numQuartos;
	}

	public boolean isGaragem() {
		return garagem;
	}

	public void setGaragem(boolean garagem) {
		this.garagem = garagem;
	}

	public float getValor() {
		return valorAlguel;
	}

	public void setValor(float valor) {
		this.valorAlguel = valor;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}
