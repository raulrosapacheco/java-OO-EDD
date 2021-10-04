package exercicio02;

public class Celula {
	
	private Pessoa pessoa;
	
	private Celula proximo;

	public Celula(Pessoa nome, Celula proximo) {
		this.pessoa = nome;
		this.proximo = proximo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa nome) {
		this.pessoa = nome;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
	

}
