package listaEncadeadaDisciplinas;

public class Celula {
	
	private Celula proximo;
	private Disciplina valor; // 
	
	public Celula getProximo() {
		return proximo;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	public Disciplina getValor() {
		return valor;
	}
	public void setValor(Disciplina valor) {
		this.valor = valor;
	}

}
