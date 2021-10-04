package simplementeEncadeada;

public class TesteListaEncadeada {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		//adicionando 4 viagens
		Viagem viagem1 = new Viagem("Itacaré-BA");
		lista.adicionar(viagem1);
		
		Viagem viagem2 = new Viagem("São Paulo-SP");
		lista.adicionar(viagem2);
		
		Viagem viagem3 = new Viagem("Belo Horizonte-MG");
		lista.adicionar(viagem3);
		
		Viagem viagem4 = new Viagem("Rio Janeiro-RJ");
		lista.adicionar(viagem4);
		
		//listando
		System.out.println(lista);
		
		//removendo ultima viagem
		lista.remover();
		
		//listando
		System.out.println(lista);
		
		
		
		
		

	}

}
