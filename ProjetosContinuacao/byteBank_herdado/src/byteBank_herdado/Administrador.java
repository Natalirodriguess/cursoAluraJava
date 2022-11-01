package byteBank_herdado;

public class Administrador extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil util;
	
	public Administrador() {
		this.util = new AutenticacaoUtil();
	}
	
	
	@Override
	public void setSenha(int senha){
		this.util.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 50;
	}
}
