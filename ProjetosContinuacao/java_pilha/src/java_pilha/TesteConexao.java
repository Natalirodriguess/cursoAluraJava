package java_pilha;

public class TesteConexao {
	public static void main(String [] args) {
		
		try(Conexao conexao = new Conexao()){
			conexao.lerDados();
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexão");
		}
		
		
		// ----------------------------------------------
		
//		Conexao con = null;
//		
//		try {
//			con = new Conexao();
//			con.lerDados();
//			
//		} catch(IllegalStateException ex) {
//			System.out.println("Deu erro na conexão");
//		} finally {
//			con.fecha();
//		}
	}

}
