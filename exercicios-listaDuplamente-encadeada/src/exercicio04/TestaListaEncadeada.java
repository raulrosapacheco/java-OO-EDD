package exercicio04;

public abstract class TestaListaEncadeada {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		lista.inserirNoComeco(3);
		lista.inserirNoComeco(1);
		lista.inserirNoFim(5);
		lista.inserirNoFim(7);
		
		System.out.println(lista);
		
		lista.removeNoComeco();
		System.out.println(lista);
		
		lista.removeNoFim();
		System.out.println(lista);
		
	}

}
