package sintaxeVariaveis_e_Fluxo;

public class TestaCondicional {
	
	public static void main (String [] args) {
		System.out.println("TESTANDO CONDICIONAIS");
		System.out.println("----------------------");
		System.out.println("|Clube dos adultos|");
		int idade = 17 ; 
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Você já é um adulto");
			System.out.println("Seja bem-vindo!");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("Você não tem 18 anos, mas pode entrar");
			} else {
			System.out.println("Você ainda não é maior de idade!");
			}
		}
	}

}
