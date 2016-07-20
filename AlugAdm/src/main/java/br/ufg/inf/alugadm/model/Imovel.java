package br.ufg.inf.alugadm.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Imovel {

	@Id
	private int code;
	private String tipo;
	private String data;
	private String estado;
	private String status;
	private String logradouro;
	private String complemento;
	private String categoria;
	private int numQuartos;
	private boolean garagem;
	private boolean areaPrivativa;
	private float valor;


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
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

	public boolean isAreaPrivativa() {
		return areaPrivativa;
	}

	public void setAreaPrivativa(boolean areaPrivativa) {
		this.areaPrivativa = areaPrivativa;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

}
