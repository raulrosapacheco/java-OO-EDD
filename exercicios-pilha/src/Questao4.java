import java.util.LinkedList;
import java.util.List;

public class Questao4 {
	
	List<String> pilha = new LinkedList<String>();
	
	public void push(String nome) {
		pilha.add(nome);
	}
	
	public String pop() {
		return pilha.remove(pilha.size() - 1);
	}
		
}
