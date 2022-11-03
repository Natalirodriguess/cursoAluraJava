
public abstract class Conta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	private static int total;
	

	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando uma conta " + this.numero);
		//System.out.println("O total de contas criadas é: "+ Conta.total);
	}
	
	public abstract void deposita(double valor);
	
	public void saca (double valor) throws SaldoInsuficienteException{
		if (this.saldo < valor) {
			//lançando uma exeção
			throw new SaldoInsuficienteException("Saldo: "+ this.saldo + " valor: " + valor);
		}
		this.saldo -= valor;
	}
	
	public void transfere (double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
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