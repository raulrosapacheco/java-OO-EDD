package br.ucsal.bes20211.poo.lista01;

import java.util.Scanner;

public class Questao01 {

	/*
	 * Suponha que o conceito de um aluno seja determinado em fun��o da sua nota.
	 * Suponha, tamb�m, que esta nota seja um valor inteiro na faixa de 0 a 100
	 * (intervalo fechado), conforme a seguinte faixa: Nota Conceito 0 a 49
	 * Insuficiente 50 a 64 Regular 65 a 84 Bom 85 a 100 �timo Crie um programa em
	 * Java que leia a nota de um aluno e apresente o conceito do mesmo. N�o �
	 * necess�rio tratar valores fora da faixa.
	 */

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		obterNotaCalcularExibirConceito();
	}

	private static void obterNotaCalcularExibirConceito() {
		int nota;
		String conceito;

		nota = obterNota();
		conceito = calcularConceito(nota);
		exibirConceito(nota, conceito);
	}

	private static void exibirConceito(int nota, String conceito) {
		System.out.println("O Conceito para a nota " + nota + " � " + conceito);
	}

	private static String calcularConceito(int nota) {
		String conceito;
		if (nota <= 49) {
			conceito = "Insuficiente";
		} else if (nota <= 64) {
			conceito = "Regular";
		} else if (nota <= 84) {
			conceito = "Bom";
		} else {
			conceito = "�timo";
		}
		return conceito;
	}

	private static int obterNota() {
		int nota;
		while (true) {
			System.out.println("Informe a nota 0 a 100, intervalo fechado: ");
			nota = sc.nextInt();
			if (nota >= 0 && nota <= 100) {
				return nota;
			}
		}
	}
}
