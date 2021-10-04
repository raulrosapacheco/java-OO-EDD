package exercicio03;

public class Celula {
	
	private Aluno aluno;
	private Celula anterior;
	private Celula proxima;

	

	public Celula(Aluno aluno) {
		this.proxima = null;
		this.aluno = aluno;
	}

	public Celula(Aluno aluno, Celula proxima) {
		this.aluno = aluno;
		this.proxima = proxima;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Celula getAnterior() {
		return anterior;
	}
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
	public Celula getProxima() {
		return proxima;
	}
	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}
	
}
