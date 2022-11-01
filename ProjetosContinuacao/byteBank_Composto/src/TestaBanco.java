
public class TestaBanco {

	public static void main (String [] args) {
		Cliente natali = new Cliente();
		natali.nome = "Natalí";
		natali.profissao = "Professora";
		natali.cpf = "444.444.444-44" ;
		
		Conta contaNatali = new Conta();
		contaNatali.deposita(400);
		contaNatali.titular = natali;
		System.out.println(contaNatali.titular.nome);
		System.out.println(contaNatali.titular.cpf);
	}
}
