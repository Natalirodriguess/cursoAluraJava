
public class TesteReferencia {
	
	public static void main(String[] args) {
		Conta conta1 = new Conta ();
		conta1.saldo = 100d;
		System.out.println(conta1);
		
		Conta conta2 = new Conta ();
		System.out.println(conta2);
		
		Conta conta00 = conta1;
		
		System.out.println(conta1.saldo);
		System.out.println(conta00.saldo);
		
		
		int numero = 5;
		if (numero>0) {
			for (int i =0 ; i< numero; i++) {
				System.out.println("*");
				System.out.println("");
			}
		}
	}

}
