package exercicio03;

public class Celula {
	
	private Integer num;
	
	private Celula proximo;

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

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
	

}
