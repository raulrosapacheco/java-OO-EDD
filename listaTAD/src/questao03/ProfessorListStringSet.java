package questao03;

public class ProfessorListStringSet implements ProfessorSet{
	
	private String nome;
	private String codigoDisciplina;
	
	public ProfessorListStringSet(String nome, String codigoDisciplina) {
		this.nome = nome;
		this.codigoDisciplina = codigoDisciplina;
	}

	@Override
	public boolean contains(String professor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean criar(String professor) {
		// TODO Auto-generated method stub
		return false;
	}

}
