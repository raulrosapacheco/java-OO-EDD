package exercicio04;

public class TesteListaEncadeada {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		Aluno aluno1 = new Aluno("Raul", "23");
		Aluno aluno2 = new Aluno("Davi", "19");
		Aluno aluno3 = new Aluno("Lu", "30");
		Aluno aluno4 = new Aluno("Bruno", "18");
		
		lista.inserirNoComeco(aluno4);
		lista.inserirNoFim(aluno3);
		lista.inserirNoComeco(aluno2);
		lista.inserirNoFim(aluno1);
		
		System.out.println(lista);
		
		lista.removeNoComeco();
		lista.removeNoFim();
		
		System.out.println(lista);
		
		
	}

}
