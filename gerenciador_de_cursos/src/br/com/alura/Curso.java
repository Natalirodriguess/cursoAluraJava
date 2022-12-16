package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<>();
	private Set<Aluno> alunos = new LinkedHashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	
	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getInstrutor() {
		return this.instrutor;
	}
	
	public List<Aula> getAulas(){
		return Collections.unmodifiableList(aulas); //lista apenas para leitura (não funciona adicionar ou remover)
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}
	
	@Override
	public String toString() {
	
		return "[ Curso: " + nome +  ", tempo total: "+ this.getTempoTotal() +", aulas:" + this.aulas +"]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos(){
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatricula(int numero) {
//		for(Aluno aluno: alunos) {
//			if( aluno.getNumeroMatricula() == numero) {
//				return aluno;
//			}
//		}
//		throw new NoSuchElementException("Matrícula não encontrada!"+ numero);
		if(!matriculaParaAluno.containsKey(numero)) {
			throw new NoSuchElementException("Matricula não encontrada!");
		}
		return matriculaParaAluno.get(numero);
	}
	
}
