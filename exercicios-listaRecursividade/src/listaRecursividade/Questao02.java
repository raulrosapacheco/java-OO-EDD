package listaRecursividade;

import java.util.Scanner;

public class Questao02 {
	// Desenvolva um programa em java que calcule o fatorial de um número x.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro positivo");
		int x = sc.nextInt();
		System.out.println("Fatorial: " + calcularFatorial(x));
	}
	
	static int fatorial = 1;

	private static int calcularFatorial(int x) {
		if(x > 1) {
			fatorial *= x;
			return calcularFatorial(x-1);
		} else 
			return fatorial;
	}

}
