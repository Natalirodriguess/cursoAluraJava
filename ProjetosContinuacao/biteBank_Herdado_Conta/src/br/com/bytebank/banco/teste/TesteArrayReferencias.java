package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
	public static void main(String[] args) {
		
//		int [] refs = {1, 2, 4, 6};
//		
//		for(int i = 0; i < refs.length; i++) {
//			System.out.println(refs[i]);
//		}
		
		Object [] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		referencias[1] = cc2 ;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		Object referenciaGenerica = referencias[1];
		//System.out.println(referencias[0].getNumeroDaConta());
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];
		System.out.println(ref.getNumeroDaConta());
		
		
	}
}
