package exercicio02;

public class TesteListaEncadeada {

	public static void main(String[] args) {
		
		ListaEncadeada lista1 = new ListaEncadeada();
		System.out.println(lista1);
		
		ListaEncadeada lista2 = new ListaEncadeada();
		System.out.println(lista2);
		
		Pessoa pessoa1 = new Pessoa("Raul");
		lista1.armazenar(pessoa1);
		lista2.armazenar(pessoa1);
		
		Pessoa pessoa2 = new Pessoa("Davi");
		lista1.armazenar(pessoa2);
		
		Pessoa pessoa3 = new Pessoa("Bruno");
		lista2.armazenar(pessoa3);
		
		Pessoa pessoa4 = new Pessoa("Davi");
		lista2.armazenar(pessoa4);
		
		System.out.println(lista1);
		System.out.println(lista2);
		
		System.out.println(ListaEncadeada.nomesComuns(lista1, lista2));
		
		
		
		
	}

}
