
public class CriaConta {
	
	public static void main (String [] args) {
		
		Conta primeira_conta = new Conta();
		primeira_conta.saldo = 250d;
		
		System.out.println(primeira_conta.saldo);
		
		primeira_conta.saldo += 100d;
		System.out.println(primeira_conta.saldo);
		
		Conta segunda_conta = new Conta();
		segunda_conta.saldo = 50d;
		
		System.out.println("A primeira conta tem R$" + primeira_conta.saldo);
		System.out.println("A segunda conte tem R$"+segunda_conta.saldo);
		}
}