package exercicio04;

public class Celula {
	
	private Integer num;
	private Celula anterior;
	private Celula proximo;	
	
	public Celula(Integer num) {
		this.num = num;
		this.proximo = null;
	}

	public Celula(Integer num, Celula proximo) {
		this.num = num;
		this.proximo = proximo;
	}
	
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Celula getAnterior() {
		return anterior;
	}
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
	public Celula getProximo() {
		return proximo;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
	

}
