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
public class Locatario {
    private String nome;
    private String cpf; 
    private String identidade, orgao; 
    private String sexo;
    private String dataNascimento;
    private String tipoPessoa;
    private String email;
    private String telefone;
    private String tipoRecebimento;
    private String dataCadastro;

    public Locatario(String nome, String cpf, String identidade, String orgao, String sexo, String dataNascimento, String tipoPessoa, String email, String telefone, String tipoRecebimento, String dataCadastro) {
        this.nome = nome;
        this.cpf = cpf;
        this.identidade = identidade;
        this.orgao = orgao;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.tipoPessoa = tipoPessoa;
        this.email = email;
        this.telefone = telefone;
        this.tipoRecebimento = tipoRecebimento;
        this.dataCadastro = dataCadastro;
    }
    
    public Locatario(){}
   
}

