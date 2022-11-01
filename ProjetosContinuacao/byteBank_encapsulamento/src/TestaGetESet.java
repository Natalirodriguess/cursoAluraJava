
public class TestaGetESet {
	
	public static void main (String[] args) {
		Conta conta = new Conta(001, 100);
		conta.setNumeroDaConta(100);
		System.out.println(conta.getNumeroDaConta());
		
		Cliente natali = new Cliente();
		conta.setTitular(natali);
		natali.setNome("Natalí");
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("Programadora e professora");
	}

}
