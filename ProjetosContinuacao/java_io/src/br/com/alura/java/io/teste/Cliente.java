package br.com.alura.java.io.teste;

import java.io.Serializable;

/**
 * Classe Cliente no ByteBank, que apenas possui métodos que modificam e visulizam os atributos 
 * de um Cliente.
 * @author Natalí Rodrigues
 *
 */
public class Cliente implements Serializable {
	
	//private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cpf;
	private String profissao;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getProfissao () {
		return this.profissao;
	}
	
	public void setProfissao (String profissao) {
		this.profissao = profissao;
		
	}
}
