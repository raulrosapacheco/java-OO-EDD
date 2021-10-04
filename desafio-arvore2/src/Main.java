

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Arvore arvore = new Arvore();
		int opcao;
		do {
			System.out.println("1 - Inserir na Árvore \n2 - Consultar Pré-Ordem \n3 - Consultar Pós-Ordem \n4 - Sair");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.print("Digite o numero inteiro que deseja inserir: ");
				int numero = sc.nextInt();
				arvore.inserir(new Elemento(numero));
				break;
			case 2:
				arvore.consultarPreOrdem();
				System.out.println();
				break;
			case 3:
				arvore.consultarPosOrdem();
				System.out.println();
				break;
			case 4:
				System.out.println("Até mais..");
				break;
			default:
				System.out.println("Opção Invalida");
				break;
			}			
		} while(opcao != 4);
		
		sc.close();
		
	}

}
