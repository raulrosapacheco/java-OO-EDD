package exercicio02;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro");
		int num = sc.nextInt();
		System.out.println(resultado(num));
	}
	
	static int soma;

	private static int resultado(int num) {
		if(num > 0) {
			soma = num + (num - 1);
			num--;
			return resultado(num);
		}else {
			return soma;		
		}
		
	}

}
