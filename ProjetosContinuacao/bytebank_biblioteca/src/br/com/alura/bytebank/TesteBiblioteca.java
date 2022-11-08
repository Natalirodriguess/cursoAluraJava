package br.com.alura.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;


public class TesteBiblioteca {
	
	public static void main (String [] args) {
		
		Conta c = new ContaCorrente(111, 222);
		c.deposita(100);

		System.out.println(c.getSaldo());
	}

}
