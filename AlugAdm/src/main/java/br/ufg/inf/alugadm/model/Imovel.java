/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.alugadm.model;

import javax.persistence.Entity;

/**
 *
 * @author JuliannyAS
 */

public class Imovel {
    
    private String tipoImovel;
    private String statusImovel;
    private String categoria;
    private int codigo;
    private String logradouro;
    private String cep;
    private String complemento;
    private int qntQuartos;
    private int garagem;
    private String estado;
    private String dataCadastro;
    private float valorAluguel;
    private String areaPrivativa;

    public Imovel(String tipoImovel, String statusImovel, String categoria, int codigo, String logradouro, String complemento, int qntQuartos, int garagem, String estado, String dataCadastro, float valorAluguel, String areaPrivativa) {
        this.tipoImovel = tipoImovel;
        this.statusImovel = statusImovel;
        this.categoria = categoria;
        this.codigo = codigo;
        this.logradouro = logradouro;
        this.cep = cep;
        this.complemento = complemento;
        this.qntQuartos = qntQuartos;
        this.garagem = garagem;
        this.estado = estado;
        this.dataCadastro = dataCadastro;
        this.valorAluguel = valorAluguel;
        this.areaPrivativa = areaPrivativa;
    }
    
    public Imovel(){}

    public String getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(String tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public String getStatusImovel() {
        return statusImovel;
    }

    public void setStatusImovel(String statusImovel) {
        this.statusImovel = statusImovel;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getQntQuartos() {
        return qntQuartos;
    }

    public void setQntQuartos(int qntQuartos) {
        this.qntQuartos = qntQuartos;
    }

    public int getGaragem() {
        return garagem;
    }

    public void setGaragem(int garagem) {
        this.garagem = garagem;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public float getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(float valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public String getAreaPrivativa() {
        return areaPrivativa;
    }

    public void setAreaPrivativa(String areaPrivativa) {
        this.areaPrivativa = areaPrivativa;
    }
    
    
}

