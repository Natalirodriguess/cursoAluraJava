package java_pilha;

public class TesteConexao {
	public static void main(String [] args) {
		
		Conexao con = null;
		
		try {
			con = new Conexao();
			con.lerDados();
			con.fecha();
			
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexão");
			con.fecha();
		}
	}

}
