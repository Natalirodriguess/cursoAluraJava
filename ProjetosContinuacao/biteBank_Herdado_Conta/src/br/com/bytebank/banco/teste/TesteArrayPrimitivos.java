package br.com.bytebank.banco.teste;

public class TesteArrayPrimitivos {
	
	//Array []
	public static void main(String [] args) {

		int [] idades = new int [5];//inicializa o Array com zero. 
		
		for(int i = 0; i < idades.length; i++){
			idades[i] = i*i;
			
		}
		
		for(int i = 0; i < idades.length; i++){
			System.out.println(idades[i]);
			
		}
		
		
//		idades[0] = 29;
//		idades[1] = 39;
//		idades[2] = 19;
//		idades[3]= 69;
//		idades[4] = 59;
//
//		       
//		int idade5 = idades[4];
//		System.out.println(idades.length);
	}

}
