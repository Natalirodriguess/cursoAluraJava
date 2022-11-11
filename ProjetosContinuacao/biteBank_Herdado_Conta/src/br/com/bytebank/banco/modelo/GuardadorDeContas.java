package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	
	private Object [] referencias;
	private int posicaoLivre;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Object conta) {
		this.referencias [posicaoLivre] = conta;
		this.posicaoLivre ++;
	}
	
	public int getQuantidade() {

		return posicaoLivre;
	}

	public Object getReferencia(int posi) {
		
		return this.referencias[posi];
	}

}
