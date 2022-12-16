package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe que representa de forma abstrata, uma conta.
 * @author Natalí Rodrigues
 *
 */
 
public abstract class Conta extends Object implements Comparable <Conta>, Serializable {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private transient Cliente titular = new Cliente();
	private static int total;
	/**
	 * Construtor para inicializar o objeto Conta, a partir da agencia e número.
	 * @param agencia
	 * @param numero
	 */

	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando uma conta " + this.numero);
		//System.out.println("O total de contas criadas é: "+ Conta.total);
	}
	
	public abstract void deposita(double valor);
	/**
	 * Valor precisa ser maior que zero.
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	
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
	
	@Override
	public boolean equals(Object ref) {
		Conta conta = (Conta) ref;
		if (this.agencia == conta.agencia && this.getNumeroDaConta() == conta.getNumeroDaConta()) {
		return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		
		return "Numero: " + this.numero + " Agencia: " + this.agencia + " Saldo: " + this.saldo;
	}
	
	@Override
	public int compareTo(Conta outra) {
		
		return Double.compare(this.saldo, outra.saldo);
	}
	
}