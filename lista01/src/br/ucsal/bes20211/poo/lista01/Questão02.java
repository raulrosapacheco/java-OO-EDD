package br.ucsal.bes20211.poo.lista01;

import java.util.Scanner;

public class Questão02 {
	
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		lerNumeroCalcularExibirSomaInversoFatoriais();
	}

	private static void lerNumeroCalcularExibirSomaInversoFatoriais() {
		int num;
		double somaInversoFatoriais;
		
		num = obterNummero();
		somaInversoFatoriais = calcularSomaDosInversosFatoriais(num);
		exibirSoma(num, somaInversoFatoriais);
		
	}

	private static void exibirSoma(int num, double somaInversoFatoriais) {
		System.out.println("A soma dos inversos dos fatoriais de 0 a " + num + " é: " + String.format("%.3f",somaInversoFatoriais));
		
	}

	private static double calcularSomaDosInversosFatoriais(int num) {
		double fat, soma = 1;
		for (int i = 1; i <= num; i++) {
			fat = 1;
			for (int j = 1; j <= i; j++) {
				fat = fat * j;			
			}
			soma += 1/fat;
		}
		return soma;
	}

	private static int obterNummero() {
		System.out.println("Digite um número inteiro, positivo N");
		return sc.nextInt();
	}

}
