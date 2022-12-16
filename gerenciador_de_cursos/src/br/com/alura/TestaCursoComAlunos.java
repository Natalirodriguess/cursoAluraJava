package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAlunos {
	
	public static void main(String [] args) {
		
		Curso javaColecoes = new Curso("Dominando coleções do Java","Paulo Silveira");
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula",20));
		javaColecoes.adiciona(new Aula("Modelando com coleções",22));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Gulherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aninche", 17645);
//		Aluno a4 = new Aluno("Felício Epitácio", 13645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		
		System.out.println("Todas as matriculas:");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		System.out.println("====================================================");
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
	
			System.out.println(proximo);
		}
		
//		Set<Aluno> alunos = javaColecoes.getAlunos();
//		javaColecoes.getAlunos().add(a4);
		
		System.out.println( javaColecoes.estaMatriculado(a1));
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse Turini, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("O a1 é equals ao Turini?");
		System.out.println(a1.equals(turini));
		
		//obrigatoriamente é true:
		
		System.out.println(a1.hashCode() == turini.hashCode());
	}
	

}

