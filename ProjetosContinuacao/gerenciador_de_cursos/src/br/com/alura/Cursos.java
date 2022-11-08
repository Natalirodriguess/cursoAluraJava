package br.com.alura;

import java.util.LinkedList;
import java.util.List;

public class Cursos {
	private String nome;
	private String instrutor;
	
	private List<Aula> aulas = new LinkedList<Aula>();
	
	public Cursos(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		return aulas;
	}
	
}
