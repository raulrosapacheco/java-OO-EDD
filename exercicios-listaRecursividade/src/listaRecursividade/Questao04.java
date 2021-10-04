package listaRecursividade;

import java.util.Scanner;

public class Questao04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro positivo");
		int n = sc.nextInt();
		System.out.println("Soma dos algoritmos do numero: " + calcularSoma(n));
	}

	static int soma = 0;

	private static int calcularSoma(int n) {
		if(n > 0) {
			soma += (n % 10);
			return calcularSoma(n/10);
		}else 
			return soma;			
	}
}

