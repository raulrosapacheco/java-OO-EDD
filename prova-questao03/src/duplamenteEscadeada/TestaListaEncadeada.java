package duplamenteEscadeada;

public abstract class TestaListaEncadeada {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		// armazenando 5 numeros primos com os metodos inserir no inicio e no fim
		lista.inserirNoComeco(3);
		lista.inserirNoComeco(1);
		lista.inserirNoFim(5);
		lista.inserirNoFim(7);
		lista.inserirNoFim(11);
		
		// listando 
		System.out.println(lista);
		
		//removendo no inicio
		lista.removeNoComeco();
		System.out.println(lista);
		
		//removendo no fim
		lista.removeNoFim();
		System.out.println(lista);
		
	}

}
