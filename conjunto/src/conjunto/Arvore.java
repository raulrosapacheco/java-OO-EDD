package conjunto;

import java.util.Random;
import java.util.Scanner;

public class Arvore {
	

//	vamos colocar 10 numeros em 1 arvore
//	consultar nmeros pares

//	declarar a minha arvore
	private static class ARVORE {
		public int numero;
		public ARVORE direita, esquerda;
	}

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// intanciar a arvore
		ARVORE raiz = null;
		int opcao, achou;

		do {
			System.out.println("\nOperaes com uma rvore");
			System.out.println("1- Preencher a rvore");
			System.out.println("2- Imprimir os pares");
			System.out.println("3- Imprimir os impares");
			System.out.println("4- Imprimir primos");
			System.out.println("5- Consultar a arvore em ordem");
			System.out.println("6- Consultar a arvore em pr-ordem");
			System.out.println("7- Consultar a arvore em ps-ordem");
			System.out.println("8- sair");

			System.out.print("Escolha uma opo: ");
			opcao = sc.nextInt();

			// vamos tratar os possveis erros
			if (opcao < 1 || opcao > 6) {
				System.out.println("Opo invlida");
			} else if (opcao == 1) {
				// ns vamos preencher a rvore
				raiz = null;
				for (int i = 1; i <= 10; i++) {
//					System.out.print("Informe o nmero a ser inserido: ");
//					int numero = sc.nextInt();
					Random g = new Random();
					raiz = inserir(raiz, i-1);
//					raiz = inserir(raiz, g.nextInt(25));
				}
			} else if (opcao == 2) {
				// vamos imprimir os pares
				if (raiz == null) {
					System.out.println("Sua rvore est vazia, utilize a opo 1 para preencher");
				} else {
					achou = 0;
					achou = consultarPares(raiz, achou);
					if (achou == 0) {
						System.out.println("No h pares!");
					}
				}
			} else if (opcao == 3) {
				// consultar impares
				if (raiz == null) {
					System.out.println("Sua rvore est vazia, utilize a opo 1 para preencher");
				} else {
					achou = 0;
					achou = consultarImpares(raiz, achou);
					if (achou == 0) {
						System.out.println("No h mpares!");
					}
				}
			} else if (opcao == 4) {
				if (raiz == null) {
					System.out.println("Sua rvore est vazia, utilize a opo 1 para preencher");
				} else {
					achou = 0;
					achou = consultarPrimos(raiz, achou);
					if (achou == 0) {
						System.out.println("No h primos!");
					}
				}
			} else if (opcao == 5) {
				if (raiz == null) {
					System.out.println("Sua rvore est vazia, utilize a opo 1 para preencher");
				} else {
					System.out.println("Os nmeros da rvore so: ");
					// chamar mtodo de consultar
					consultarEmOrdem(raiz);
				}
			}else if (opcao == 6) {
				if (raiz == null) {
					System.out.println("Sua rvore est vazia, utilize a opo 1 para preencher");
				} else {
					System.out.println("Os nmeros da rvore em pr-ordem so: ");
					// chamar mtodo de consultar
					consultarPreOrdem(raiz);
				}
			}
		} while (opcao != 8);
	}

	// mtodo para inserir rvore
	public static ARVORE inserir(ARVORE aux, int numero) {
		// primeiro passo: sera que a arvore no tem dado
		if (aux == null) {
			aux = new ARVORE();
			aux.numero = numero;
			aux.direita = null;
			aux.esquerda = null;
		} else if (numero < aux.numero) {
			aux.esquerda = inserir(aux.esquerda, numero);
		} else {
			aux.direita = inserir(aux.direita, numero);
		}
		return aux;
	}

	// mtodo que consulta os nmeros pares de uma rvore
	public static int consultarPares(ARVORE aux, int achou) {
		if (aux != null) {
			if (aux.numero % 2 == 0) {
				System.out.println("Os nmeros pares so: " + aux.numero + " ");
				achou = 1;
			}
			achou = consultarPares(aux.esquerda, achou);
			achou = consultarPares(aux.direita, achou);
		}
		return achou;
	}

	// mtodo que consulta os nmeros mpares de uma rvore
	public static int consultarImpares(ARVORE aux, int achou) {
		if (aux != null) {
			if (aux.numero % 3 == 0) {
				System.out.println("Os nmeros mpares so: " + aux.numero + " ");
				achou = 1;
			}
			achou = consultarImpares(aux.esquerda, achou);
			achou = consultarImpares(aux.direita, achou);
		}
		return achou;
	}

	public static int consultarPrimos(ARVORE aux, int achou) {
		if (aux != null) {
			int cont = 0;
			for (int i = 2; i <= aux.numero; i++) {
				if (aux.numero % i ==0) {
					cont++;
				}
			}
			if (cont == 1) {
				System.out.println("Nmero primo: " + aux.numero);
				achou = 1;
			}
			achou = consultarPrimos(aux.esquerda, achou);
			achou = consultarPrimos(aux.direita, achou);
		}
		return achou;
	}

	public static void consultarEmOrdem(ARVORE aux) {
		if (aux != null) {
			consultarEmOrdem(aux.esquerda);
			System.out.println("Nmero: " + aux.numero + " ");
			consultarEmOrdem(aux.direita);
		}
	}
	
	public static void consultarPreOrdem(ARVORE aux) {
		if (aux != null) {
			if (aux.esquerda != null) {
				System.out.println("Esquerda: "+aux.numero);
				consultarPreOrdem(aux.esquerda);
			}
			if (aux.direita != null) {
				System.out.println("Direita: "+aux.numero);
				consultarPreOrdem(aux.direita);
			}
		}
	}



}
