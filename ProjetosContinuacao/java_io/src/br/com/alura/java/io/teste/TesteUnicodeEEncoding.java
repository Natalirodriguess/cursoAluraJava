package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "ç";
		
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		
		byte[] bytes = s.getBytes("UTF-8");
		System.out.print("Quantidade de bytes: "+ bytes.length + " tipo de encoding: " 
		+charset.displayName() +", " );
		String sNovo = new String(bytes, "UTF-8");
		System.out.println(sNovo);
		
		bytes = s.getBytes("UTF-16");
		System.out.print("Quantidade de bytes: "+ bytes.length + " tipo de encoding: " 
		+"UTF-16, " );
		sNovo = new String(bytes, "UTF-8");
		System.out.println(sNovo);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print("Quantidade de bytes: "+ bytes.length + " tipo de encoding: " 
		+"US_ASCII, " );
		sNovo = new String(bytes, "UTF-8");
		System.out.print(sNovo);
		
	}

}
