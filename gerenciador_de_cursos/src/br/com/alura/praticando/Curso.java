package br.com.alura.praticando;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso{
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public List<Aula> getAula(){
		return Collections.unmodifiableList(aulas);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getInstrutor() {
		return this.instrutor;
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	

}
