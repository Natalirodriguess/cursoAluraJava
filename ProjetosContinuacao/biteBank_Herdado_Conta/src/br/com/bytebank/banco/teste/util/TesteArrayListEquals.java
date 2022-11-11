package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {
	public static void main(String [] args) {
		// <> Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		ArrayList<String> nome = new ArrayList<String>();
		
		Conta conta1 = new ContaCorrente(22, 11);
		lista.add(conta1);
		
		Conta conta2 = new ContaCorrente(22, 12);
		lista.add(conta2);
		
		System.out.println("Tamanho: "+lista.size());
		
		Conta ref = lista.get(0);
		
		System.out.println(ref.getNumeroDaConta());
		
		lista.remove(0);
		
		System.out.println("Tamanho: "+lista.size());
		
		Conta conta3 = new ContaCorrente(33, 311);
		lista.add(conta3);
		
		Conta conta4 = new ContaCorrente(33, 322);
		lista.add(conta4);
		
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		System.out.println("------------------");
		
		for(Object oRef : lista) {
			System.out.println(oRef);
		}
		
	}

}
