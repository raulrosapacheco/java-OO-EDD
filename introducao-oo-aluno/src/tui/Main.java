package tui;

import java.util.Locale;
import java.util.Scanner;

import domain.Aluno;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();
		aluno.nome = sc.nextLine();
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();

		System.out.printf("FINAL GRADE: %.2f%n", aluno.nf());
		if (aluno.nf() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", aluno.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		sc.close();

	}

}
