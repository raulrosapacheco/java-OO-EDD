package exercicio03;

public class ListaEncadeada {
	
	private Celula primeira = null;
	
	private Celula ultima = null;
	
	private int totalDeElementos = 0;
	
	
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
	
	public void encontrar(Integer num) {
		
		Celula atual = this.primeira;
		
		for (int i = 0, j = 0; i < this.totalDeElementos; i++) {
			if(atual.getNum().equals(num)) {
				System.out.println("posicao: " + i);
			} else {
				j++;
				if(j == this.totalDeElementos) {
					System.out.println("não existe");
				}
			}
			atual = atual.getProximo();
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
