package exercicio02;

import java.util.Arrays;

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
	
	
	public void adicionaNoComeco(Aluno aluno) {
		
		Celula nova = new Celula(aluno, primeira);
		this.primeira = nova;
		
		if(this.totalDeElementos == 0) {
			this.ultima = this.primeira;
		}
		
		this.totalDeElementos++;
		
	}
	
	public void adiciona(Aluno aluno) {
		
		if(this.totalDeElementos == 0) {
			adicionaNoComeco(aluno);
			
		} else {
			Celula nova = new Celula(aluno, null);
			this.ultima.setProximo(nova);
			this.ultima = nova;
			this.totalDeElementos++;
		}
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		
		if(posicao == 0) {
			adicionaNoComeco(aluno);
			
		} else if(posicao == this.totalDeElementos) {
			adiciona(aluno);
			
		} else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula nova = new Celula(aluno, anterior.getProximo());
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
			this.totalDeElementos--;
			
		} else if(this.totalDeElementos == 2) {
			this.primeira.setProximo(null);
			
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
	
	public boolean pesquisa(Aluno aluno) {
		
		Celula atual = this.primeira;
		
		while(atual != null) {
			if(atual.getAluno().equals(aluno)) {
				return true;
			}			
			atual = atual.getProximo();
		}
		return false;
		
	}
	
	public void apagarLista(ListaEncadeada lista) {
		
		while(totalDeElementos > 0) {
			lista.remove();
			totalDeElementos--;
		} 
		
	}
	
	public void ordemAlfabetica(ListaEncadeada lista) {
		
		String[] ordemAlfabetica = new String[totalDeElementos];
		
		for (int i = 0; i < ordemAlfabetica.length; i++) {
			ordemAlfabetica[i] = lista.pegaCelula(i).getAluno().getNome();
		}
		
		Arrays.sort(ordemAlfabetica);
		
		this.totalDeElementos = 0;
		
		for (int i = 0; i < ordemAlfabetica.length; i++) {
			Aluno aluno = new Aluno(ordemAlfabetica[i]);
			lista.adiciona(aluno);
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
			builder.append(atual.getAluno().getNome());
			builder.append(", ");

			atual = atual.getProximo();		
		}

		builder.append("]");

		return builder.toString();
	}
}
