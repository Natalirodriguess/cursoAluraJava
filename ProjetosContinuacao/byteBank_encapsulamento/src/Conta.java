
public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta " + this.numero);
	}
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public boolean saca (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} 
		else {
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
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setNumeroDaConta (int numero) {
		if (numero <= 0) {
			System.out.println("Não é permitido valores negativos ou nulo.");
			return;
		} 
		this.numero = numero;
	}
	
	public int getNumeroDaConta () {
		return this.numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia (int agencia) {
		if (agencia <= 0) {
			System.out.println("Não é permitido valores negativos ou nulo.");
			return;
		} 
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal () {
		return Conta.total;
	}
}