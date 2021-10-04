package exercicio05;

public class Celula {
	
	private Integer num;
	private Celula proximo;
	
	public Celula(Integer num, Celula proximo) {
		this.num = num;
		this.proximo = proximo;
	}

	public Object getNum() {
		return num;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
	
}
