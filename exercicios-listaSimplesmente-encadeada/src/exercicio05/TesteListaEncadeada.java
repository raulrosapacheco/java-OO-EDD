package exercicio05;

public class TesteListaEncadeada {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona(3);
		lista.adicionaNoComeco(2);
		lista.adicionaNoComeco(1);
		lista.adiciona(4);
		lista.adiciona(5);
		lista.adiciona(6);
		lista.adiciona(7);
		System.out.println(lista);
		
		lista.adiciona(8);
		
		System.out.println(lista);

	}

}
