package teste;
public class TesteSaca {
	
	public static void main(String [] args) {
		
		modelo.ContaCorrente conta = new modelo.ContaCorrente(1111, 2222);
		conta.deposita(200.0);
		try {
		conta.saca(210.0);
		} catch(modelo.SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println(conta.getValor());
		
	}
}
