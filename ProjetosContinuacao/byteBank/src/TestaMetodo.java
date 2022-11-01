
public class TestaMetodo {
	
	public static void main (String[] args) {
		Conta conta = new Conta();
		conta.saldo =50d; 
		conta.deposita(10d);
		System.out.println("O saldo da conta é "+ conta.saldo);
		conta.saca(30);
		System.out.println("O saldo da conta agora é: "+ conta.saldo);
		
		Conta natali = new Conta();
		natali.saldo = 1500;
		
		if(natali.transfereDesafio(200, conta)) {
			System.out.println("Transferido com sucesso!");
		}else {
			System.out.println("Saldo insuficiente para transferência!");
			}
		
		System.out.println(natali.saldo);
		System.out.println(conta.saldo);
		
		
		}
}
