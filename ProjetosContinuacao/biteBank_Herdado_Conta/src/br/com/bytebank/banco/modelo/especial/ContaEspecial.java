package br.com.bytebank.banco.modelo.especial;

import br.com.bytebank.banco.modelo.*;

public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor; 
		
	}

}
