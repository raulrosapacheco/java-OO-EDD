package exercicio01;

public class ClienteListStringSet implements ClienteSet{
	
	private String nome;
	private String email;
	private String telefone;
	
	public ClienteListStringSet(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	@Override
	public boolean armazenar(String nome, String email, String telefone) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	

}
