package br.com.bytebank.banco.teste.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteDesserializacao {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente cliente = (ContaCorrente) ois.readObject();
		
		ois.close();
		System.out.println(cliente.getSaldo());
		System.out.println(cliente.getTitular());
	}

}
