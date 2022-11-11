package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {
	public static void main(String [] args) {
		
//		Conta conta1 = new ContaCorrente(22, 11);
//		Conta conta2 = new ContaCorrente(22, 22);
//		
//		boolean igual = conta1.ehIgual(conta2);
//		System.out.println(igual);
		
		
		// <> Generics
		List<Conta> lista = new Vector<Conta>(); //threadsafe
		
		Conta conta1 = new ContaCorrente(22, 11);
		lista.add(conta1);
		
		Conta conta2 = new ContaCorrente(22, 22);
		lista.add(conta2);
		
		
		
		Conta conta3 = new ContaCorrente(22, 22);
		Boolean contem =lista.contains(conta2);
		
		System.out.println("Já existe? "+contem);
		
		for(Conta conta: lista) {
			if (conta.equals(conta3)) {
				System.out.println("Já tenho essa conta!");
			}
		}
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
	}

}
