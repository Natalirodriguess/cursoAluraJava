
public class Conta {
	
	double saldo;
	int agencia;
	int numero_da_conta;
	String titular;

	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public boolean saca (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere (double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
		
	public boolean transfereDesafio (double valor, Conta destino) {
		
		if (this.saca(valor)) {
			destino.deposita(valor);
			System.out.println("Depositado com sucesso!");
			return true;
		}
		else {
			System.out.println("Saldo insuficiente");
				return false;
		}
	}
	
}
