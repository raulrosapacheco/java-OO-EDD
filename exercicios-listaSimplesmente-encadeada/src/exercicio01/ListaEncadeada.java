package exercicio01;

public class ListaEncadeada {
	
	private Celula primeira = null;
	
	private Celula ultima = null;
	
	private int totalDeElementos = 0;
	
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
	
	
	public void adicionaNoComeco(Aluno professor) {
		
		Celula nova = new Celula(professor, primeira);
		this.primeira = nova;
		
		if(this.totalDeElementos == 0) {
			this.ultima = this.primeira;
		}
		
		this.totalDeElementos++;
		
	}
	
	public void adiciona(Aluno professor) {
		
		if(this.totalDeElementos == 0) {
			adicionaNoComeco(professor);
			
		} else {
			Celula nova = new Celula(professor, null);
			this.ultima.setProximo(nova);
			this.ultima = nova;
			this.totalDeElementos++;
		}
	}
	
	public void adiciona(int posicao, Aluno professor) {
		
		if(posicao == 0) {
			adicionaNoComeco(professor);
			
		} else if(posicao == this.totalDeElementos) {
			adiciona(professor);
			
		} else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula nova = new Celula(professor, anterior.getProximo());
			anterior.setProximo(nova);
			this.totalDeElementos++;
		}
		
	}
	
	public void removeDoComeco() {
		
		if(this.totalDeElementos == 0) {
			throw new IllegalArgumentException("lista vazia");
		}
		
		this.primeira = this.primeira.getProximo();
		this.totalDeElementos--;
		
		if(this.totalDeElementos == 0) {
			this.ultima = null;
		}
	}
	
	public void remove() {
		
		if(this.totalDeElementos == 0) {
			throw new IllegalArgumentException("lista vazia");
			
		} else if(this.totalDeElementos == 1) {
			removeDoComeco();
			
		} else if(this.totalDeElementos == 2) {
			this.primeira.setProximo(null);
			this.totalDeElementos --;
			
		} else {
			Celula penultima = this.pegaCelula(totalDeElementos - 2);
			penultima.setProximo(null);
			this.totalDeElementos--;
		}
		
	}
	
	public void remove(int posicao) {
		
		if(posicao == 0) {
			removeDoComeco();
		} else if(posicao == this.totalDeElementos - 1) {
			remove();
		} else {		
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula proxima = this.pegaCelula(posicao + 1);
			anterior.setProximo(proxima);
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
			remove();
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
			builder.append(atual.getProfessor().getNome());
			builder.append(", ");

			atual = atual.getProximo();		
		}

		builder.append("]");

		return builder.toString();
	}

}	
	
