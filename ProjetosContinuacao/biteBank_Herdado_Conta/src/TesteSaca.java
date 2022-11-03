
public class TesteSaca {
	
	public static void main(String [] args) {
		
		ContaCorrente conta = new ContaCorrente(1111, 2222);
		conta.deposita(200.0);
		try {
		conta.saca(210.0);
		} catch(SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println(conta.getValor());
		
	}
}