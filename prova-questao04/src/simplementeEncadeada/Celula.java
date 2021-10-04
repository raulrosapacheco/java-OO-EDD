package simplementeEncadeada;

public class Celula {
	
	private Viagem viagem;
	
	private Celula proximo;

	public Celula(Viagem viagem, Celula proximo) {
		this.viagem = viagem;
		this.proximo = proximo;
	}

	public Viagem getViagem() {
		return viagem;
	}

	public void setViagem(Viagem viagem) {
		this.viagem = viagem;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}

	
	

}
