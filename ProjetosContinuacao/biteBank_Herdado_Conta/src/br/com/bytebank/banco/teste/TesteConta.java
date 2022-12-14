package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;
import br.com.bytebank.banco.modelo.especial.ContaEspecial;
public class TesteConta {
	
	public static void main(String [] args) {

		//int a = 3;
		//int b = a /0;
		
		ContaEspecial ce = new ContaEspecial(123, 555);
		ce.getSaldo();
		
		ContaCorrente outraConta = null;
		outraConta.deposita(200.0);
		
		ContaCorrente contaCorrente = new ContaCorrente(111,111);
		contaCorrente.deposita(100);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(111, 112);
		contaPoupanca.deposita(200);
		
		try {
		contaCorrente.transfere(10, contaPoupanca);
		} catch (SaldoInsuficienteException ex){
			System.out.println(ex.getMessage());
		}
		
		System.out.println("CC: " + contaCorrente.getSaldo());
		System.out.println("CP: " + contaPoupanca.getSaldo());
	}

}
