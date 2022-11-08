package br.com.alura;

import java.util.List;

public class TestaCurso {
	
	public static void main(String[] args) {
		Cursos javaColecoes = new Cursos("Dominando as coleções do Java", "Paulo Silveira");
		List<Aula> aulas =javaColecoes.getAulas();
		System.out.println(aulas);
	}
}
