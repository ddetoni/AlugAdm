/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.alugadm.model;

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
        this.complemento = complemento;
        this.qntQuartos = qntQuartos;
        this.garagem = garagem;
        this.estado = estado;
        this.dataCadastro = dataCadastro;
        this.valorAluguel = valorAluguel;
        this.areaPrivativa = areaPrivativa;
    }
    
    public Imovel(){}
    
    
}

