package questao01;


public class LivroListStringSet implements LivroSet {
		
	private String titulo;
	private String editora;
	private String data;
	
	public LivroListStringSet(String titulo, String editora, String data) {
		this.titulo = titulo;
		this.editora = editora;
		this.data = data;
	}

	@Override
	public boolean armazenar(String livro) {
		// TODO Auto-generated method stub
		return false;
		
	}

}
