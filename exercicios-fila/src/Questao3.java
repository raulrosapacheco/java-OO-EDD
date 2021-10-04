import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Questao3 {
	
	private static Queue<String> clientes = new LinkedList<String>();

	private static int cont = 0;
	
	public static void main(String[] args) {		

		Scanner sc = new Scanner(System.in);

		int opcao = 0;
		do {
			System.out.println("1 - Inserir Cliente \n2 - Remover Cliente \n3 - Consultar quatidade na fila \n4 - Sair");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Digite o cliente");
				sc.nextLine();
				String cliente = sc.nextLine();
				if (inserirCliente(cliente))
					System.out.println("Cliente inserido");
				else
					System.out.println("Erro ao inserir");
				break;
			case 2:
				System.out.println(removerCliente());
				break;
			case 3:
				System.out.println(cont);
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

	public static boolean inserirCliente(String cliente) {
		if (clientes.add(cliente)) {
			cont++;
			return true;
		}
		return false;
	}

	public static String removerCliente() {
		if (!clientes.isEmpty()) {
			clientes.poll();
			cont--;
			return "Cliente removido";
		}
		return "Lista vazia";
	}
}
