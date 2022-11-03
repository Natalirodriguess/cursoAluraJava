package modelo;
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
