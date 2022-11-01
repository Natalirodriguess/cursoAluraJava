
public class TestaContaSemCliente {
	public static void main (String [] args) {
		Conta contaPingo = new Conta();
		System.out.println(contaPingo.getSaldo());
		
		contaPingo.titular = new Cliente ();
		contaPingo.titular.nome = "Pingo";
		System.out.println(contaPingo.titular);
		System.out.println(contaPingo.titular.nome);
	}

}
