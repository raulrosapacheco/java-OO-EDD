package br.ucsal.bes20211.poo.lista01;

import java.util.Scanner;

public class Questão03 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		digitarDezNumerosCalcularMediaMaiorMenor();

	}

	private static void digitarDezNumerosCalcularMediaMaiorMenor() {
		int[] numeros;
		double media;
		int maior, menor;
		
		numeros = obterNumeros(10);
		media = obterMedia(numeros);
		maior = obterMaior(numeros);
		menor = obterMenor(numeros);
		exibirMediaMaiorMenor(media, maior, menor);
		
		
	}

	private static void exibirMediaMaiorMenor(double media, int maior, int menor) {
		System.out.println("Media: " + media + "\nMaior: " + maior + "\nMenor: " + menor);		
	}

	private static int obterMenor(int[] numeros) {
		int menor = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if (menor > numeros[i]) {
				menor = numeros[i];
			}
		}
		return menor;
	}

	private static int obterMaior(int[] numeros) {
		int maior = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if (maior < numeros[i]) {
				maior = numeros[i];
			}
		}
		return maior;
	}

	private static double obterMedia(int[] numeros) {
		double media = 0;
		for (int i = 0; i < numeros.length; i++) {
			media += numeros[i];
		}
		return media/numeros.length;
	}

	private static int[] obterNumeros(int tam) {
		int[] numeros = new int[tam];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o " + (i+1) + "º número inteiro");
			numeros[i] = sc.nextInt();			
		}
		return numeros;
	}

}
