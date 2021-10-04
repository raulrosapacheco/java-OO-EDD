package questao02;

public class AlunoListStringSet implements AlunoSet{
	
	private String nome;
	private int semestre;
	
	public AlunoListStringSet(String nome, int semestre) {
		this.nome = nome;
		this.semestre = semestre;
	}

	@Override
	public boolean contains(String aluno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(String aluno) {
		// TODO Auto-generated method stub
		return false;
	}

}
