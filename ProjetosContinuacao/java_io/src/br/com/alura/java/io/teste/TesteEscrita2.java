package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteEscrita2 {

	public static void main(String[] args) throws IOException{
		
//		
//		OutputStream fos = new FileOutputStream("texto2.txt");
//		Writer osw = new OutputStreamWriter(fos); 
//		BufferedWriter bw = new BufferedWriter (osw); 
		
//		FileWriter fw = new FileWriter("texto2.txt");
//		fw.write("Testanto a primeira escrita de dados.");
//		//fw.write("\n");
//		fw.write(System.lineSeparator()); //devolvendo uma String com os caracteres \n
//		fw.write("Vamos lá! ");
//		
//		fw.close();
	
		
		BufferedWriter bw = new BufferedWriter (new FileWriter("texto2.txt")); 
		bw.write("Testanto a primeira escrita de dados.");
		bw.newLine();
		bw.write("Vamos lá! ");
		
		bw.close();
	}

}
