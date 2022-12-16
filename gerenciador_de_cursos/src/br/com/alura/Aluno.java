package br.com.alura;

public class Aluno {
	
	private String nome;
	private int numeroMatricula;
	
	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public Aluno(String nome, int numeroMatricula) {
		if(nome == null) {
			throw new NullPointerException("Nome não pode ser nulo!");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	}
	
	@Override
	public int hashCode() {
		
		return this.nome.hashCode();
	}
	
	@Override
	public String toString() {
		
		return "[Aluno: " + this.nome+", numero matricula matricula "+ this.numeroMatricula+"]";
	}

}