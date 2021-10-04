import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Questao5 {
	private static Queue<String> pacientes = new LinkedList<String>();

	private static int cont = 0;
	
	public static void main(String[] args) {		

		Scanner sc = new Scanner(System.in);

		int opcao = 0;
		do {
			System.out.println("1 - Inserir Paciente \n2 - Atender Paciente \n3 - Consultar quatidade na fila "
					+ "\n4 - Indicar Proximo"
					+ "\n5 - Sair");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Digite o paciente");
				sc.nextLine();
				String paciente = sc.nextLine();
				if (inserirPaciente(paciente))
					System.out.println("Paciente inserido");
				else
					System.out.println("Erro ao inserir");
				break;
			case 2:
				System.out.println(removerPaciente());
				break;
			case 3:
				System.out.println(cont);
				break;	
			case 4:
				if(pacientes.isEmpty())
					System.out.println("Sem pacientes");
				else
					System.out.println(pacientes.peek());
				break;
			case 5:
				System.out.println("Até mais...");
				break;
			default:
				System.out.println("Opção invalida, escolha novamente");
				break;
			}
		} while (opcao != 5);

		sc.close();

	}

	public static boolean inserirPaciente(String paciente) {
		if (pacientes.add(paciente)) {
			cont++;
			return true;
		}
		return false;
	}

	public static String removerPaciente() {
		if (!pacientes.isEmpty()) {
			pacientes.poll();
			cont--;
			return "Paciente atendido";
		}
		return "Lista vazia";
	}
}
