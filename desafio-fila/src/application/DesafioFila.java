package application;

import java.util.LinkedList;
import java.util.Queue;

public class DesafioFila {

	public static void main(String[] args) {
		Queue<String> filaDoJava = new LinkedList<String>();
		
		
		//Adição
		filaDoJava.add("Mauricio");
		filaDoJava.add("Raul");	
		filaDoJava.add("Lucilandia");		
		System.out.println(filaDoJava); // listando
		
		filaDoJava.remove(); // removendo
		System.out.println(filaDoJava);
		
		System.out.println(filaDoJava.size());//tamanho
		
		System.out.println(filaDoJava.poll());// primeiro elemento
		
		System.out.println(filaDoJava);

	}

}
