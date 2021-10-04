package exercicio03;

public class ListaEncadeada {
	
	private Celula primeira = null;
	
	private Celula ultima = null;
	
	private int totalDeElementos = 0;
	
	public void adicionar(Filme filme) {		
		Celula nova = new Celula(filme, null);
		
		if(this.totalDeElementos == 0) {
			this.primeira = nova;
			this.ultima = this.primeira;
			this.totalDeElementos++;
			
		} else {
			this.ultima.setProximo(nova);
			this.ultima = nova;
			this.totalDeElementos++;
		}
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao <this.totalDeElementos;
	}
	
	private Celula pegaCelula(int posicao) {
		
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posiçâo Inexistente");
		}
		
		Celula atual = primeira;
		
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();			
		}
		
		return atual;
		
	}
	
	public void remover() {
		
		if(this.totalDeElementos == 0) {
			throw new IllegalArgumentException("lista vazia");
			
		} else if(this.totalDeElementos == 1) {
			this.primeira = null;
			this.ultima = null;
			this.totalDeElementos--;
			
		} else if(this.totalDeElementos == 2) {
			this.primeira.setProximo(null);
			this.totalDeElementos--;
			
		} else {
			Celula penultima = this.pegaCelula(this.totalDeElementos - 2);
			penultima.setProximo(null);
			this.totalDeElementos--;
		}
	}
	
	public int tamanho() {
		return this.totalDeElementos;
	}
	
	public boolean verificarVazia() {
		
		if (this.totalDeElementos == 0) {
			return true;
			
		} else {
			return false;
		}
	}
	
	public void apagarLista() {
		
		while(this.totalDeElementos > 0) {
			remover();
			} 
			
	}
	
	@Override
	public String toString() {
		
		if(this.totalDeElementos == 0) {
			return "[]";
		}

		Celula atual = primeira;

		StringBuilder builder = new StringBuilder("[");

		for(int i = 0; i < this.totalDeElementos; i ++) {
			builder.append(atual.getFilme().getNome());
			builder.append(", ");

			atual = atual.getProximo();		
		}

		builder.append("]");

		return builder.toString();
	}

}
