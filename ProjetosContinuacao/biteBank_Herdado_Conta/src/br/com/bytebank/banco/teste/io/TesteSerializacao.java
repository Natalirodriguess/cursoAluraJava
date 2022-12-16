package br.com.bytebank.banco.teste.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args)  throws IOException, ClassNotFoundException{
		
				
				Cliente cliente = new Cliente();
				cliente.setNome("Natalí");
				cliente.setProfissao("programadora");
				cliente.setCpf("111.222.333-44");
				
				Conta conta = new ContaCorrente(222, 333);
				conta.setTitular(cliente);
				conta.deposita(220.5);
				
				
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
				
				oos.writeObject(conta);
				oos.close();

//				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
//				Cliente nome = (Cliente) ois.readObject();
//				
//				ois.close();
				
				System.out.println(cliente.getNome());
			}
}

