package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteLeitura {

	public static void main(String[] args) throws IOException{
		
		//fluxo de entrada com arquivo de texto
			InputStream fis = new FileInputStream("texto.txt");// estabelecendo uma entrada
				
			Reader isr = new InputStreamReader(fis,"UTF-8"); // tranformando bites e bytes em caracter
			BufferedReader br = new BufferedReader (isr); // juntando os caracteres em uma String
			String linha = br.readLine();
			System.out.println(br.ready());
				
			while (linha != null ) {
				System.out.println(linha);
				linha = br.readLine();
			} 
				
//			for(int i= 0; i < 2 ; i++) {
//				System.out.println(linha);
//				linha = br.readLine();
//			}
				
				//System.out.println(linha);/
			
				
			br.close();
	

	}
}
