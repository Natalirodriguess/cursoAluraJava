package teste;
public class TesteConta {
	
	public static void main(String [] args) {
		
		int a = 3;
		int b = a /0;
		
		modelo.ContaCorrente outraConta = null;
		outraConta.deposita(200.0);
		
		modelo.ContaCorrente contaCorrente = new modelo.ContaCorrente(111,111);
		contaCorrente.deposita(100);
		
		modelo.ContaPoupanca contaPoupanca = new modelo.ContaPoupanca(111, 112);
		contaPoupanca.deposita(200);
		
		try {
		contaCorrente.transfere(10, contaPoupanca);
		} catch (modelo.SaldoInsuficienteException ex){
			System.out.println(ex.getMessage());
		}
		
		System.out.println("CC: " + contaCorrente.getSaldo());
		System.out.println("CP: " + contaPoupanca.getSaldo());
	}

}
