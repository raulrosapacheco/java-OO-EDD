package exercicio02;

public class Celula {
	
	private Aluno aluno;
	
	private Celula proximo;

	public Celula(Aluno aluno, Celula proximo) {
		this.aluno = aluno;
		this.proximo = proximo;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}

	public Aluno getAluno() {
		return aluno;
	}
	
	

}
