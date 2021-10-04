package exercicio03;

public abstract class TesteListaEncadeada {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		Aluno aluno1 = new Aluno("raul", 26);
		lista.incluirNoFim(aluno1);
		Aluno aluno2 = new Aluno("lu", 30);
		lista.incluirNoFim(aluno2);
		Aluno aluno3 = new Aluno("davi", 20);
		lista.incluirNoFim(aluno3);
		Aluno aluno4 = new Aluno("bruno", 19);
		lista.incluirNoFim(aluno4);
		Aluno aluno5 = new Aluno("amadeu", 21);
		lista.incluirNoFim(aluno5);
		
		System.out.println(lista);
		
		Aluno aluno6 = new Aluno("samila", 21);
		lista.incluirNoFim(aluno6);
		
		Aluno aluno7 = new Aluno("nathalie", 21);
		lista.incluirNoComeco(aluno7);
		
		System.out.println(lista);
		
	}

}
