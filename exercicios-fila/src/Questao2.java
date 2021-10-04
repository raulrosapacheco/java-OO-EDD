import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Questao2 {

	private static Queue<String> contatos = new LinkedList<String>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcao = 0;
		do {
			System.out.println("1 - Inserir Contato \n2 - Próximo Contato \n3 - Sair");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Digite o contato");
				sc.nextLine();
				String contato = sc.nextLine();
				if (inserirContato(contato))
					System.out.println("Contato inserido");
				else
					System.out.println("Erro ao inserir");
				break;
			case 2:
				System.out.println(removerContato());
				break;
			case 3:
				System.out.println("Até mais...");
				break;
			default:
				System.out.println("Opção invalida, escolha novamente");
				break;
			}
		} while (opcao != 3);

		sc.close();

	}

	public static boolean inserirContato(String contato) {
		if (contatos.add(contato)) {
			return true;
		}
		return false;
	}

	public static String removerContato() {
		if (!contatos.isEmpty()) {
			return contatos.poll();
		}
		return "Lista vazia";
	}

}
