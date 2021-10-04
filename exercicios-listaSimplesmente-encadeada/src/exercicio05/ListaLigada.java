package exercicio05;

public class ListaLigada {
	
	private Celula primeira = null;
	private Celula ultima = null;
	private int totalDeElementos = 0;
	
	public void adicionaNoComeco(Integer num) {
		
		if(this.totalDeElementos >= 7) {
			System.out.println("Lista Cheia");
			
		} else {		
			Celula nova = new Celula(num, primeira);
			this.primeira = nova;
			
			if(this.totalDeElementos == 0) {
				this.ultima = this.primeira;
			}
			
			this.totalDeElementos++;
		}
	}	
	
	public void adiciona(Integer num) {
		if(this.totalDeElementos >= 7) {
			System.out.println("Lista Cheia");
			
		} else {
			if(this.totalDeElementos == 0) {
				adicionaNoComeco(num);
			} else {
				Celula nova = new Celula(num, null);		
				this.ultima.setProximo(nova); 
				this.ultima = nova;		
				this.totalDeElementos++;
			}			
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
