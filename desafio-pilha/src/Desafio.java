import java.util.Scanner;
import java.util.Stack;

public class Desafio {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		Stack<Integer> stack = new Stack<Integer>();
		
		boolean i = true;
		
		while (i) {
			int num = sc.nextInt();
			if(num > 0) {
				if (!stack.empty() && verificarPrimo(num) && verificarPrimo(stack.peek())){
					System.out.println("Dois números vizinhos primos: " + stack.peek() + " e " + num);
				}
				stack.push(num);				
			} else {
				i = false;
			}
		}		
	}
	
	private static boolean verificarPrimo(int numero) {
	    for (int j = 2; j < numero; j++) {
	        if (numero % j == 0)
	            return false;   
	    }
	    return true;
	}
}
