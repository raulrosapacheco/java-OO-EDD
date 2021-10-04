package tui;

import java.util.Iterator;
import java.util.Scanner;

import entities.Pensionato;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pensionato[] quartos = new Pensionato[10];	
		
		System.out.print("How many rooms will be rented? ");
		int qtdd = sc.nextInt();
		System.out.println();
		
		for (int i = 0; i < qtdd; i++) {
			System.out.println("Rent #" + (i+1) + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int quarto = sc.nextInt();
			quartos[quarto] = new Pensionato(name, email);
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < quartos.length; i++) {
			if(quartos[i] != null) {
				System.out.println(i + ": " + quartos[i]);	
			}
		}

	}

}
