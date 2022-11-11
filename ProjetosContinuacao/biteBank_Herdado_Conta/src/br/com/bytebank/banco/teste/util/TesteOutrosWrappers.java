package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteOutrosWrappers {
	
	public static void main(String[] args) {
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		System.out.println(idadeRef.intValue()); //unboxing
		
		Double dRef = Double.valueOf(3.2); //autoboxing
		System.out.println(dRef.doubleValue()); //unboxing
		
		Boolean bRef = Boolean.TRUE;
		System.out.println(bRef.booleanValue());
		
		Number refNumero = Double.valueOf(29.9);
		Number refNumero1 = Integer.valueOf(29);
		Number refNumero2 = Float.valueOf(29.0f);
		
		List<Number> numeros = new ArrayList<>();
		numeros.add(10);
		numeros.add(12.6);
		numeros.add(5.7f);

	}

}
