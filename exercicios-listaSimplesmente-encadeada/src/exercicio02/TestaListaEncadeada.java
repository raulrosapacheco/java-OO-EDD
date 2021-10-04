package exercicio02;

public class TestaListaEncadeada {

	public static void main(String[] args) {
		
		ListaEncadeada lista = new ListaEncadeada();
		
		System.out.println(lista);
		
		Aluno aluno1 = new Aluno("Angela");
		lista.adicionaNoComeco(aluno1);
		System.out.println(lista);
		
		Aluno aluno2 = new Aluno("Osvaldo");
		lista.adicionaNoComeco(aluno2);
		System.out.println(lista);
		
		Aluno aluno3 = new Aluno("Raul");
		lista.adicionaNoComeco(aluno3);
		System.out.println(lista);
		
		lista.ordemAlfabetica(lista);
		System.out.println(lista);

	}

}
