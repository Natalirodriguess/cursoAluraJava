package byteBank_herdado;

public class TesteReferencia {
	public static void main (String [] agrs) {
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(8000);
		
	
		
		
		EditorDeVideo ev = new EditorDeVideo();
		ev.setSalario(2500);
		
		Designer d = new Designer ();
		d.setSalario(2800);
		
		ControleBonificacao controle = new ControleBonificacao ();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getSalario());
		System.out.println(g1.getBonificacao());
		System.out.println(controle.getSoma());
		
		
		
	}
	

}
