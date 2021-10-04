package exercicio03;

public class Celula {
	
	private Filme filme;
	
	private Celula proximo;

	public Celula(Filme filme, Celula proximo) {
		this.filme = filme;
		this.proximo = proximo;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
	

}
