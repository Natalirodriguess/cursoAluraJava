package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException{
		
		//BufferedWriter bw = new BufferedWriter (new FileWriter("texto2.txt")); 
		
		//PrintStream ps = new PrintStream(new File("texto2.txt"));
		
		PrintWriter ps = new PrintWriter("texto2.txt", "UTF-8");
		
		ps.println("Testanto a primeira escrita de dados com PrintStream");
		ps.println();
		ps.println("Vamos lá! ");
		
		
		ps.close();
	}

}
