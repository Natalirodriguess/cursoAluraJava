
public class TestaValores {
	public static void main (String[] args) {
		Conta conta = new Conta(1000, 4231);
		Conta conta1 = new Conta (1000, 5531);
		
		System.out.println(conta.getAgencia());
		System.out.println(conta1.getNumeroDaConta());
		System.out.println("O total de contas é "+ Conta.getTotal());
	}

}
