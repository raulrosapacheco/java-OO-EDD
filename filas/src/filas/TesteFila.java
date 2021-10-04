package filas;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFila {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		fila.adiciona("Mauricio");
		fila.adiciona("Guilherme");

		System.out.println(fila);
		
		String x1 = fila.remove();
		System.out.println(x1);
		System.out.println(fila);
		
		System.out.println();
		
		Queue<String> filaDoJava = new LinkedList<String>();
		
		filaDoJava.add("Mauricio");
		filaDoJava.add("Raul");
		System.out.println(filaDoJava);
		
		System.out.println(filaDoJava.isEmpty());
		
		System.out.println(filaDoJava.poll());		
		System.out.println(filaDoJava);
		
		/* Fila � uma estrutura de dados onde o primeiro a entrar � o primeiro a sair. � como uma fila de banco: o primeiro que chega na fila 
		 * � o primeiro a ser atendido 
		 * Assim como a pilha, o tempo � constante. Se usarmos uma lista ligada por baixo dos panos,
		 *  adicionar e remover do come�o leva tempo constante.*/
		
		

	}

}
