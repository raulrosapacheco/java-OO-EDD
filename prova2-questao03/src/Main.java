

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Arvore arvore = new Arvore();
		int opcao;
		do {
			System.out.println("1 - Inserir na �rvore \n2 - Consultar Pr�-Ordem  \n3 - Sair");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.print("Digite 10 numeros inteiros que deseja inserir: ");
				int cont = 0;
				do {
					int numero = sc.nextInt();
					if((numero != 1) && (numero % 2 == 0)) {
						arvore.inserir(numero);
						cont++;						
					} else {
						System.out.println("Numero impar n�o contabilizado");						
					}
				}while (cont < 10);
				break;
			case 2:
				arvore.consultarPreOrdem();
				System.out.println();
				break;
			case 3:
				System.out.println("At� mais..");
				break;
			default:
				System.out.println("Op��o Invalida");
				break;
			}			
		} while(opcao != 3);
		
		sc.close();
		
	}

}
