package java_pilha;

public class Conexao {
	
	public Conexao() {
		System.out.println("Abrindo conexão");
	}

	public void lerDados() {
		System.out.println("Recebendo dados");
		throw new IllegalStateException();
	}
	
	public void fecha() {
		System.out.println("Fechando conexão");
	}
}
