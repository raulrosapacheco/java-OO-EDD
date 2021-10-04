import java.util.Scanner;
import java.util.Stack;

public class Questao2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra");
		String string = sc.nextLine();
		String[] vect = string.split("");
		
		
		
		Stack<String> stackNormal = new Stack<String>();
		Stack<String> stackInvertido = new Stack<String>();
		
		for (int i = 0; i < vect.length; i++) {
			if(!vect[i].equals(" ") && !vect[i].equals(".")) {
				stackNormal.push(vect[i]);
			}
		}
		
		for (int i = (vect.length - 1); i >= 0; i--) {
			if(!vect[i].equals(" ") && !vect[i].equals(".")) {
				stackInvertido.push(vect[i]);
			}
		}
		
		if(stackNormal.equals(stackInvertido)) {
			System.out.println("A palavra é Palíndromo");
		}else {
			System.out.println("A palavra não é Palíndromo");
		}
		
		sc.close();

	}

}
