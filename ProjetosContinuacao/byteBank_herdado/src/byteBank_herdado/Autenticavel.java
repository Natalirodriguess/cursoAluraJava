package byteBank_herdado;

//contrato Autenticavel
// quem assinar o contrato, precisa implementar seus métodos
public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica (int senha) ;
	}
