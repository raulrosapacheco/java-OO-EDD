package exercicio04;

public class ListaEncadeada {
	
	private Celula primeira = null;
	
	private Celula ultima = null;
		
	private int totalDeElementos = 0;
	
	private int posicao = 0;
	
	private boolean contem = false;
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	
	private Celula pegaCelula(int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posicao inexistente");
		}
		
		Celula atual = primeira;
		
		for(int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		
		return atual;
	}		
	
	private void adicionaNoComeco(Integer num) {
		
		Celula nova = new Celula(num, primeira);
		this.primeira = nova;
		
		if(this.totalDeElementos == 0) {
			this.ultima = this.primeira;
		}
		
		this.totalDeElementos++;
		
	}
	
	public void adiciona(Integer num) {
		
		if(this.totalDeElementos == 0) {
			adicionaNoComeco(num);
		
		} else if(this.totalDeElementos > 15) {
			throw new IllegalArgumentException("Celula cheia");
			
		} else {
			Celula nova = new Celula(num, null);
			this.ultima.setProximo(nova);
			this.ultima = nova;
			this.totalDeElementos++;
		}
	}
	
	public void encontrar(int num) { 
			
		Celula atual = pegaCelula(posicao);
		
		if(atual.getNum().equals(num)) {
			System.out.println("posicao " + this.posicao);
			this.contem = true;
		}
		
		this.posicao++;
		
		if(this.posicao < this.totalDeElementos) {
			encontrar(num);
			
		} else {
			if(!this.contem) {
				System.out.println("Não contem");
			}
			this.posicao = 0;
			this.contem = false;
		}
	}
	
	@Override
	public String toString() {
		
		if(this.totalDeElementos == 0) {
			return "[]";
		}

		Celula atual = primeira;

		StringBuilder builder = new StringBuilder("[");

		for(int i = 0; i < totalDeElementos; i ++) {
			builder.append(atual.getNum());
			builder.append(", ");

			atual = atual.getProximo();		
		}

		builder.append("]");

		return builder.toString();
	}

}
