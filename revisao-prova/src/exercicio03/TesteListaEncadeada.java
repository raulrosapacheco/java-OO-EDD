package exercicio03;

public class TesteListaEncadeada {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		Filme filme1 = new Filme("As Panteras");
		lista.adicionar(filme1);
		
		Filme filme2 = new Filme("Velozes e Furiosos");
		lista.adicionar(filme2);
		
		Filme filme3 = new Filme("Bob Esponja");
		lista.adicionar(filme3);
		
		Filme filme4 = new Filme("Rio");
		lista.adicionar(filme4);
		
		System.out.println(lista);
		
		lista.remover();
		
		System.out.println(lista);
		
		System.out.println(lista.tamanho());
		
		System.out.println(lista.verificarVazia());
		
		lista.apagarLista();
		
		System.out.println(lista);
		
		lista.adicionar(filme1);
		
		System.out.println(lista);
		
		
		

	}

}
