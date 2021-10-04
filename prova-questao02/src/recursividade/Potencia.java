package recursividade;

import java.util.Scanner;

public class Potencia {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois numeros inteiros x e y");
		int x = sc.nextInt();
		int y = sc.nextInt();		
		System.out.println("x elevado a y é: " + potencia(x,y));
	}

	private static double potencia(int x, int y) {	
		if (y == 0) {
			return 1;
		}else {
			return x * potencia(x,y-1);
		}		
		
	}
}
