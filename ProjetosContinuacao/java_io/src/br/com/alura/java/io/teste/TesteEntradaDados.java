package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteEntradaDados {

	public static void main(String[] args) throws IOException{
		
		//fluxo de entrada e saída de arquivo de texto
		//Socket s = new Socket();
		
		InputStream fis = new FileInputStream("texto.txt"); //new FileInputStream
		Reader isr = new InputStreamReader(fis); 
		BufferedReader br = new BufferedReader (isr); 
				
		OutputStream fos =  System.out; // s.getOutouStream(); new FileOutputStream("texto3.txt");
		Writer osw = new OutputStreamWriter(fos); 
		BufferedWriter bw = new BufferedWriter (osw);
				
				
				
		String linha = br.readLine();
	
				
		while (linha != null && !linha.isEmpty() ) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		} 
				
		br.close();
		bw.close();
		
		
				
	}
}
