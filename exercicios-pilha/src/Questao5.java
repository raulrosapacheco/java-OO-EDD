import java.util.LinkedList;
import java.util.List;

public class Questao5 {
	
	private List<String> pilha; 
	
	public Questao5() {
		pilha = new LinkedList<String>();		
	}
	
	public void push(String nome) {
		pilha.add(nome);
	}
	
	public void pop() {
		pilha.remove(pilha.size() - 1);
		if(pilha.isEmpty()) {
			System.out.println("Pilha Vazia");
		}
	}
	
	

}
