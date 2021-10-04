package tui;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;

		System.out.print("Enter account number: ");
		int numeroDaconta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char chave = sc.next().charAt(0);
		if (chave == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numeroDaconta, nomeTitular, depositoInicial);
		} else {
			conta = new Conta(numeroDaconta, nomeTitular);
		}
		
		System.out.println();		
		System.out.println("Account data:\n" + conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double valor = sc.nextDouble();
		conta.deposito(valor);
		System.out.println("Updated account data:\n"+ conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		valor = sc.nextDouble();
		conta.saque(valor);		
		System.out.printf("Updated account data:\n" + conta);
	}

}
