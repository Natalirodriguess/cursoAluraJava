package byteBank_herdado;

public class TestaFuncionario {

	public static void main(String [] args) {
		
		Cliente cliente = new Cliente ();
	
		
		Gerente funcionario = new Gerente();
		funcionario.setNome("Thomas");
		funcionario.setCpf("111.222.333-44");
		funcionario.setSalario(8000);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getCpf());
		System.out.println(funcionario.getBonificacao());
		System.out.println("----------------------------");
	
	}
}
