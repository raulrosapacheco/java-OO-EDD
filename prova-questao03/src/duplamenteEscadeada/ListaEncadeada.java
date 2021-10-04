package duplamenteEscadeada;

public class ListaEncadeada {
	
	private Celula primeira = null;
	private Celula ultima = null;
	private int totalDeElementos = 0;
	
	
	public void inserirNoComeco(Integer num) {		
			
		if(this.totalDeElementos ==0) {
			Celula nova = new Celula(num);
			this.primeira = nova;
			this.ultima = nova;
				
		} else {
			Celula nova = new Celula(num, this.primeira);
			this.primeira.setAnterior(nova);
			this.primeira = nova;
		}
			
			this.totalDeElementos++;
		
	}
	
	public void inserirNoFim(Integer num) {
					
		if(this.totalDeElementos == 0) {
			inserirNoComeco(num);
			
		} else {
			Celula nova = new Celula(num);
			this.ultima.setProximo(nova);
			nova.setAnterior(this.ultima);
			this.ultima = nova;
			this.totalDeElementos++;
		}
		
	}
	
	public void removeNoComeco() {
		
		if(this.totalDeElementos == 0) {
			throw new IllegalArgumentException("lista vazia");
		}
		
		this.primeira = this.primeira.getProximo();
		this.totalDeElementos--;
		
		if(this.totalDeElementos == 0) {
			this.ultima = null;
		}
	}
	
	public void removeNoFim() {
		if(this.totalDeElementos == 1 || this.totalDeElementos == 0) {
			this.removeNoComeco();
		} else {
			Celula penultima = this.ultima.getAnterior();
			penultima.setProximo(null);
			this.ultima = penultima;
			this.totalDeElementos--;
		}
	}
	
	public String toString() {
		
		if(this.totalDeElementos == 0) {
			return "[]";
		}

		Celula atual = this.primeira;

		StringBuilder builder = new StringBuilder("[");

		for(int i = 0; i < totalDeElementos; i ++) {
			builder.append(atual.getNum());
			if(i < totalDeElementos -1) {
				builder.append(", ");				
			}

			atual = atual.getProximo();		
		}

		builder.append("]");

		return builder.toString();
	}
}
