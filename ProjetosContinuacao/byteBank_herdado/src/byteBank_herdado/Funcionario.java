package byteBank_herdado;
// nao pode instaciar um objeto dessa classe
public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	// método sem corpo, sem implementação = abstract
	public abstract double getBonificacao();
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario () {
		return this.salario;
	}
	
	public void setSalario (double salario) {
		this.salario = salario;
	}
}
