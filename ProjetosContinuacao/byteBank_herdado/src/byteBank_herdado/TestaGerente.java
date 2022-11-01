package byteBank_herdado;

public class TestaGerente {
	public static void main (String [] args) {
		
		Autenticavel referencia = new Cliente();
		
		Gerente gerente = new Gerente ();
		gerente.setNome("Natali");
		gerente.setCpf("222.333.444-55");
		gerente.setSalario(8000);
		gerente.setSenha(2222);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getBonificacao());
		
		boolean autenticou = gerente.autentica(2222);
		System.out.println(autenticou);
		
	}

}
