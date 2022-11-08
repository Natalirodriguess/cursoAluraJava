package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorReferencia {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta conta = new ContaCorrente(22, 11);
		guardador.adiciona(conta);
		
		Conta conta1 = new ContaCorrente(22, 12);
		guardador.adiciona(conta1);
		
		
		int tamanho = guardador.getQuantidade();
		
		System.out.println(tamanho);
		
		Conta ref = (Conta) guardador.getReferencia(1);
		
		System.err.println(ref.getNumeroDaConta());

	}

}