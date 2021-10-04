package exercicio02;

public class ListaEncadeada {
	
	private Celula primeira = null;
	
	private Celula ultima = null;
	
	private int totalDeElementos = 0;
		
	public void armazenar(Pessoa pessoa) {
		Celula nova = new Celula(pessoa, null);
		
		if (this.primeira == null) {
			this.primeira = nova;
			this.ultima = this.primeira;
			this.totalDeElementos++;
		} else {
			this.ultima.setProximo(nova);
			this.ultima = nova;
			this.totalDeElementos++;
		}		
	}
	
	public static ListaEncadeada nomesComuns(ListaEncadeada lista1, ListaEncadeada lista2) {
		Celula atual1 = lista1.primeira;
		Celula atual2 = lista2.primeira;
		
		ListaEncadeada nomesComuns = new ListaEncadeada();
		
		for (int i = 0; i < lista1.totalDeElementos; i++) {
			for (int j = 0; j < lista2.totalDeElementos; j++) {
				
				if(atual1.getPessoa().getNome().equals(atual2.getPessoa().getNome())) {
					Pessoa pessoa = new Pessoa(atual1.getPessoa().getNome());
					nomesComuns.armazenar(pessoa);
				}
				atual2 = atual2.getProximo();
			}			
			atual1 = atual1.getProximo();
			atual2 = lista2.primeira;
		}
		return nomesComuns;
		
	}
	
	
	public String toString() {
		
		if(this.totalDeElementos == 0) {
			return "[]";
		}

		Celula atual = this.primeira;

		StringBuilder builder = new StringBuilder("[");

		for(int i = 0; i < totalDeElementos; i ++) {
			builder.append(atual.getPessoa().getNome());
			if(i < totalDeElementos -1) {
				builder.append(", ");				
			}

			atual = atual.getProximo();		
		}

		builder.append("]");

		return builder.toString();
	}


}
