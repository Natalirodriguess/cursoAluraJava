package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		
//		String aula1 = "Conhecendo mais sobre listas";
//	    String aula2 = "Modelando a classe aula";
//	    String aula3 = "Trabalhando com Cursos e Sets";
//	    
//	    ArrayList<String> aulas = new ArrayList<>();
//	    aulas.add(aula1);
//	    aulas.add(aula2);
//	    aulas.add(aula3);
//	    
//	    System.out.println(aulas);
//	    
//	    aulas.remove(0);
//	    
//	    for(String aula: aulas) {
//	    	System.out.println("Aula: " + aula);
//	    }
//	    
//	    System.out.println("----------------");
//	    
//	    aulas.forEach(aula -> {
//	    	System.out.println("Pecorrendo");
//	    	System.out.println("Aula " + aula);
//	    });
//	    
//	    System.out.println("----------------");
//	    
//	    Collections.sort(aulas);
//	    System.out.println(aulas);
		
		ArrayList<Integer> inteiros = new ArrayList<>();
		inteiros.add(5);
		inteiros.add(4);
		inteiros.add(2);
		inteiros.add(3);
		inteiros.add(1);
		
		System.out.println(inteiros);
		
		Collections.sort(inteiros);
		
		System.out.println(inteiros);
	}
}