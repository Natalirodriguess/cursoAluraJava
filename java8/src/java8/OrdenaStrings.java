package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class OrdenaStrings {
	
	public static void main(String [] args) {
		
		List <String> palavras = new ArrayList<>();
		palavras.add("Fofinho");
		palavras.add("Ursinho carrinhosos");
		palavras.add("Barbie Créu");
		
		//Comparator <String> comparador = new ComparadorPorTamanho();
		//Collections.sort(palavras, comparador);
		
		palavras.sort(( s1, s2) ->{
				if(s1.length() < s2.length()) {
					return -1;
				} else if (s1.length() > s2.length()) {
					return 1;
				} else
				return 0;	
		});
		
//		palavras.sort((s1 , s2)-> Integer.compare(s1.length(), s2.length()));
		
		palavras.sort(Comparator.comparing(s-> s.length()));
		palavras.sort(Comparator.comparing(String::length));
		
		Function<String, Integer> funcao = new Function<String, Integer>(){

			@Override
			public Integer apply(String s) {
				
				return s.length();
			};
		
		};
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);
		
		System.out.println(palavras);
//		
//		for(String p : palavras) {
//			System.out.println(p);
//		}
		
//		palavras.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String s) {
//				System.out.println("========");
//				System.out.println(s);
//			}
//		});
		
		palavras.forEach( (String s) -> {
			System.out.println(s);
		});
	}
}


//class ImprimeNaLinha implements Consumer<String>{
//
//	@Override
//	public void accept(String s) {
//		System.out.println("===========");
//		System.out.println(s);
//	}
//	
//}



class ComparadorPorTamanho implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		if(s1.length() < s2.length()) {
			return -1;
		}else if (s1.length() > s2.length() ) {
			return 1;
		} else
			return 0;
	}
	
}