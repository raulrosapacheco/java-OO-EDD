package listaEncadeadaDisciplinas;

public class TestaListaEncadeada {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestaListaEncadeada testaListaEncadeada = new TestaListaEncadeada();
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		
		testaListaEncadeada.addDisciplina(listaEncadeada);
		System.out.println("Todos as disciplinas foram adicionados com sucesso!!");
		System.out.println("Você tem os seguintes disciplinas adicionados: ");
		while(listaEncadeada.temProximo()) {
			System.out.println(listaEncadeada.getPosicaoAtual().getValor().getNome());
		}
		System.out.println("Agora vamos remover!!");
		
		testaListaEncadeada.removerDiscipla(listaEncadeada);
		System.out.println("Disciplina removidos");
		System.out.println("A lista ficou assim: ");
		while(listaEncadeada.temProximo()) {
			System.out.println(listaEncadeada.getPosicaoAtual().getValor().getNome());
		}
		
	}
	
	public void addDisciplina(ListaEncadeada listaEncadeada) {
	    Disciplina disciplina1 = new Disciplina("POO");
	    Disciplina disciplina2 = new Disciplina("ED"); 
	    Disciplina disciplina3 = new Disciplina("Redes"); 
	    Disciplina disciplina4 = new Disciplina("SO"); 
	    
		listaEncadeada.adicionar(disciplina1); 
		listaEncadeada.adicionar(disciplina2); 
		listaEncadeada.adicionar(disciplina3);
		listaEncadeada.adicionar(disciplina4); 
 
	}
	
	public void removerDiscipla(ListaEncadeada listaEncadeada) {
		listaEncadeada.remover();
		listaEncadeada.remover();
		listaEncadeada.remover();
		
	}

}
