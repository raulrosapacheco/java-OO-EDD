package tad;

public class AlunoListStringSet implements AlunoSet{
	
	private String nome;
	
	private int semestre;
	
	private int size;
	
	public AlunoListStringSet(String nome, int semestre, int size) {
		this.nome = nome;
		this.semestre = semestre;
		this.size = size;
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

	@Override
	public boolean remove(String aluno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}	

}
