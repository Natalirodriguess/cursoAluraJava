package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class TesteLeitura2 {

	 public static void main(String[] args) throws Exception {
		 
         Scanner scanner = new Scanner(new File("contas.csv"), StandardCharsets.UTF_8.name());
         
         while(scanner.hasNextLine()) {
        	 
                 String linha = scanner.nextLine();
                 //System.out.println(linha);

                 Scanner linhaScanner = new Scanner(linha);
                 linhaScanner.useLocale(Locale.US);
                 linhaScanner.useDelimiter(",");

                 String tipoConta = linhaScanner.next();
                 int agencia = linhaScanner.nextInt();
                 int numero = linhaScanner.nextInt();
                 String titular = linhaScanner.next();
                 double saldo = linhaScanner.nextDouble();
                 
                System.out.format(new Locale("pt", "BR"),"%s - %04d-%08d, %s: %05.2f %n", tipoConta, agencia, numero, titular, saldo);
                //System.out.println(valorFormatado);

                linhaScanner.close();

//              String[] valores = linha.split(",");
//              System.out.println(valores[1]);
         }
         
         scanner.close();
 }

}
