package exercicio03;

public class TestaLista {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		System.out.println(lista);
		
		lista.adiciona(4);
		lista.adiciona(7);
		lista.adiciona(20);
		lista.adiciona(30);
		lista.adiciona(42);
		lista.adiciona(60);
		lista.adiciona(4);
		
		System.out.println(lista);
		
		lista.encontrar(4);
		lista.encontrar(1);

	}

}
