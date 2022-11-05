package br.com.bytebank.banco.modelo;
//br.com.bytebank.banco.modelo.CalculadorImposto => Full Qualified Name (FQN)
public class CalculadorImposto {
	
	private double totalImposto ; 
	
	
	public void registra(Tributavel t) {
		double valor =  t.getValor();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto ;
	}
}
