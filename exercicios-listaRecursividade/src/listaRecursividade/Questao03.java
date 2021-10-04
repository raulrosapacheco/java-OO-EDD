package listaRecursividade;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro positivo");
		int n = sc.nextInt();
		decimalParaBinario(n);

	}

	private static void decimalParaBinario(int n) {
		if(n > 0) {
			decimalParaBinario(n / 2);
			System.out.print(n % 2);
		}
	}

}
