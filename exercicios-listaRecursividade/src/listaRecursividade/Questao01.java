package listaRecursividade;

import java.util.Scanner;

public class Questao01 {
	/* O m�todo a seguir, executa o c�lculo do MDC (m�ximo divisor comum) de dois inteiros positivos m e n. 
	 * Escreva um m�todo recursivo equivalente.	 
	public static int CalculaMDC(int m, int n){
		int r;
		do{
		r = m%n;
		m = n;
		n = r;
		} while (r != 0);
			return m;
		}*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois Valores Inteiros");
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println("MDC: " + calculaMDC(m,n));
	}
	
	static int r;

	private static int calculaMDC(int m, int n) {
		r = m%n;
		m = n;
		n = r;
		if (r != 0) {
			return calculaMDC(m,n);
		} else {
			return m;
		}
		
	}

}
