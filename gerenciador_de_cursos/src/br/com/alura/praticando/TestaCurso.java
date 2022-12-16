package br.com.alura.praticando;

import java.util.List;

public class TestaCurso {
	
	public static void main(String [] args) {
		Curso javaColecoes = new Curso("Aprendendo a usar Coleções", "Paulo Silveira");
		List<Aula> aulas = javaColecoes.getAula();
		
		System.out.println(aulas);
		
//		javaColecoes.getAula().add(new Aula("Trabalhando com ArrayList",21));
//		javaColecoes.getAula().add(new Aula("Nova aula",20));
		
		javaColecoes.adiciona(new Aula("Nova aula aqui!", 25));
		javaColecoes.adiciona(new Aula("Uma nova aula.", 15));
		
		System.out.println(aulas);
		
		
	}
}
