package pilha;

import java.util.Stack;

public class TestePilha {

	public static void main(String[] args) {
//		Pilha pilha = new Pilha();
//		
//		pilha.push("Mauricio");
//		
//		System.out.println(pilha);
//		
//		pilha.push("Guilherme");
//		
//		System.out.println(pilha);
//		
//		String r1 = pilha.pop();
//		System.out.println(r1);
//		
//		String r2 = pilha.pop();
//		System.out.println(r2);
//		
//		System.out.println(pilha.vazia());
//		pilha.push("Marcelo");
//		System.out.println(pilha.vazia());
//		
//		System.out.println(pilha);
//		
//		System.out.println();
		
		Stack<String> stack = new Stack<String>();
		stack.push("Mauricio"); //insere
		stack.push("Marcelo");
		
		System.out.println(stack);
		
		System.out.println(stack.pop()); //retira
		
		System.out.println(stack);
		
		String nome = stack.peek(); //indica o ultimo porem n�o retira
		System.out.println(nome);
		
		System.out.println(stack);
		
		/* Pilha � uma estrutura de dados na qual o �ltimo elemento a entrar � o primeiro a sair, tamb�m conhecida como LIFO(Last-In First-Out),
		 *  por exemplo, uma pilha de pratos. 
		 *  Qual � o tempo de execu��o das opera��es de inserir e remover um elemento da pilha?
		 *  A inser��o e remo��o � constante. Afinal, ao se usar uma lista ligada por baixo, sabemos que a inser��o e a remo��o do �ltimo elemento 
		 *  gasta tempo constante (basta acertar as refer�ncias).*/
		
		
	}

}
