
public class TestaSacaNegativo {
	
	public static void main (String [] args) {
		Conta conta = new Conta ();
		conta.deposita(150);
		conta.saca(300);
		System.out.println(conta.getSaldo());
		System.out.println(conta.saca(300));
		
		conta.saca(151);
		System.out.println(conta.getSaldo());
	}

}
