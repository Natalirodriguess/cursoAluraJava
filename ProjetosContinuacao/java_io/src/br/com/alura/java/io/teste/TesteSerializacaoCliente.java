package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		Cliente cliente = new Cliente();
		cliente.setNome("Natalí");
		cliente.setProfissao("programadora");
		cliente.setCpf("111.222.333-44");
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		
		oos.writeObject(cliente);
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente nome = (Cliente) ois.readObject();
		
		ois.close();
		
		System.out.println(cliente.getNome());
	}

}