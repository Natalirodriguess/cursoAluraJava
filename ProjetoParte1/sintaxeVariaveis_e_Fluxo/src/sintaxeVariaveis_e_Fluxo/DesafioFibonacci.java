package sintaxeVariaveis_e_Fluxo;

public class DesafioFibonacci {
	
	public static void main (String [] args) {
		System.out.println("===================");
		System.out.println(" DESAFIO FIBONACCI ");
		System.out.println("===================");
		
		System.out.println("Vamos observar que a sequência!");
		System.out.println(" A sequência fibonacci se dá, da seguinte forma:");
		System.out.println("1"); 
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("5");
		System.out.println("8");
		System.out.println("E assim se segue, adiante!");
		System.out.println("Perceba que o próximo número da sequência, é a SOMA do número anterior, ");
		System.out.println("com o anterior do anterior."); 
		System.out.println( "Perceba também que, os números anteriores vão sempre mudando.");
	    System.out.println( "Então, teremos as seguintes variáveis: numero_anterior"+ 
		", numero_posterior e a soma");
		System.out.println("Nesse exemplo, vamos fazer a repetição até que a soma dê 8.");
		System.out.println();
		
		int numero_anterior = 0;
		int numero_posterior = 1;
		int soma = 0;
		
		System.out.println(numero_posterior);
		
			for(int i = 0; i < 1; i++) {
				
				soma = numero_anterior + numero_posterior;
				numero_anterior = numero_posterior;
				numero_posterior = soma;
				
				System.out.println(soma);
			}
		}
}
