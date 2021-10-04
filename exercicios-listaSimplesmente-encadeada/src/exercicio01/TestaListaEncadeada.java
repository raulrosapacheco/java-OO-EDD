package exercicio01;

public class TestaListaEncadeada {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		System.out.println(lista);
		
		Aluno professor1 = new Aluno("Neiva");
		lista.adicionaNoComeco(professor1);
		System.out.println(lista);
		
		Aluno professor2 = new Aluno("Osvaldo");
		lista.adicionaNoComeco(professor2);
		System.out.println(lista);
		
		Aluno professor3 = new Aluno("Algela");
		lista.adicionaNoComeco(professor3);
		System.out.println(lista);
		
		lista.remove(1);
		System.out.println(lista);
		
		Aluno professor4 = new Aluno("Marco");
		lista.adiciona(professor4);
		System.out.println(lista);
		
		lista.apagarLista();
		System.out.println(lista);		
		
		Aluno professor5 = new Aluno("Raul");
		lista.adiciona(professor5);
		System.out.println(lista);
		
		

	}

}
