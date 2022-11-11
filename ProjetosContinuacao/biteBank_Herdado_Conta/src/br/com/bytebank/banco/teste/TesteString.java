package br.com.bytebank.banco.teste;

public class TesteString {
	
	public static void main(String [] args) {
		// estou criando um objeto do tipo String, com a
		// referência  nome
		
		String vazio = "";
		System.out.println(vazio.isEmpty());
		
		String vazio2 = " ";
		System.out.println(vazio2.isEmpty());
		System.out.println(vazio2.trim().isEmpty());
		
		
		String nome = "Alura"; //object literal
		//String texto = new String("Olá");
		
		System.out.println("Existe subString? "+ nome.contains("lura"));
		
		int tamanho = nome.length();
		
		//System.out.println(tamanho);
		
		for (int i = 0 ; i <= nome.length(); i++){
			System.out.println(nome.charAt(i));
		}
		
//		String sub = nome.substring(1);
//		System.out.println(sub); // retira os dois chars e mostra apenas o sub
		
//		int pos =nome.indexOf("r");
//		System.out.println(pos);
		
//		char c = nome.charAt(2);
//		System.out.println(c);
//		
//		char b = 'A';
//		char a = 'a';
//		
//		nome.replace("A", "a");
//		nome.toLowerCase();
//		nome.toUpperCase();
//		nome.replace(b, a);
//		String outra = nome.toLowerCase();
		
//		System.out.println(nome.replace("Al", "aL"));
//		//System.out.println(outra);
//		System.out.println(nome.toUpperCase());
//		System.out.println();
		
		
	}

}
