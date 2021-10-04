

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Armazem estoque = new Armazem();
		int opcao;
		do {
			System.out.println("1 - Inserir numero inteiro \n2 - Consultar Pré-Ordem \n3 - Consultar Pilha e Filas \n4 - Sair");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.print("Digite o numero inteiro que deseja inserir: ");
				int numero = sc.nextInt();
				estoque.inserirNaPilhaFila(numero);
				estoque.inserirNaArvore(numero);
				break;
			case 2:
				estoque.consultarPreOrdem();
				System.out.println();
				break;
			case 3:
				System.out.println(estoque.getPilha());
				System.out.println();
				System.out.println(estoque.getFila());
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
