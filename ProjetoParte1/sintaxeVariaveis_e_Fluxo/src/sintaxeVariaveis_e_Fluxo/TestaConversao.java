package sintaxeVariaveis_e_Fluxo;

public class TestaConversao {
	public static void main(String [] args) {
		double salario = 1250.70;
		int valor = (int)salario; //casting
		System.out.println(valor);
		short numero = 2150; // short guarda um número pequeno
		byte numero1 = 127; // byte guarda um número beeem pequeno
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1+valor2;
		System.out.println(total);
	}

}
