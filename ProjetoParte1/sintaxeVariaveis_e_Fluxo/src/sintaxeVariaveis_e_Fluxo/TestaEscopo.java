package sintaxeVariaveis_e_Fluxo;

public class TestaEscopo {
	public static void main(String [] args) {
		
		System.out.println("TESTANDO CONDICIONAIS");
		System.out.println("----------------------");
		System.out.println("|Clube dos adultos|");
		int idade = 17 ; 
		int quantidadePessoas = 1;
		boolean acompanhado;
		
		//boolean acompanhado = quantidadePessoas >= 2;
		
		if(quantidadePessoas>= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("O valor de acompanhado = " + acompanhado);
		if (idade >= 18 || quantidadePessoas >= 2 || acompanhado) {
			System.out.println("Seja bem-vindo!");
		} else {
			
			System.out.println("Você ainda não é maior de idade!");
		}
	}

}