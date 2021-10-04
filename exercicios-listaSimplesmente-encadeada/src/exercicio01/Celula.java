package exercicio01;

public class Celula {
	
	private Aluno professor;
	
	private Celula proximo;

	public Celula(Aluno professor, Celula proximo) {
		this.professor = professor;
		this.proximo = proximo;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProfessor(Aluno professor) {
		this.professor = professor;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}

	public Aluno getProfessor() {
		return professor;
	}
	
	
}
