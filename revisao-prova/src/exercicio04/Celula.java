package exercicio04;

public class Celula {
	
	private Aluno aluno;
	private Celula anterior;
	private Celula proximo;
	
	public Celula(Aluno aluno) {
		this.aluno = aluno;
		this.proximo = null;
	}
	
	public Celula(Aluno aluno, Celula proximo) {
		this.aluno = aluno;
		this.proximo = proximo;
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
	public Celula getProximo() {
		return proximo;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
	
}
