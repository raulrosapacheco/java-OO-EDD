import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Questao02 {	
	
	public static void main(String[] args) {		

		Scanner sc = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		Queue<String> fila = new LinkedList<String>();
		
		int opcao = 0;
		do {
			System.out.println("1 - Inserir Musica \n2 - Listar fila \n3 - Listar pilha \n4 - Sair");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Digite 1 para musica nacional e 2 para internacional");
				int x = sc.nextInt();
				System.out.println("Digite a música");
				sc.nextLine();
				String musica = sc.nextLine();
				if (x == 1) {
					fila.add(musica);
				} else if (x == 2) {
					pilha.push(musica);
				} else {
					System.out.println("opção errada");
				}
				break;
			case 2:
				System.out.println(fila);
				break;
			case 3:
				System.out.println(pilha);
				break;	
			case 4:
				System.out.println("Até mais...");
				break;
			default:
				System.out.println("Opção invalida, escolha novamente");
				break;
			}
		} while (opcao != 4);

		sc.close();

	}

}
