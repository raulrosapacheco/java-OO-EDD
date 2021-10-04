import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Questao1 {
	
	private static Queue<String> contatos = new LinkedList<String>();
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao = 0;
		do {
			System.out.println("1 - Inserir Entrevistado \n2 - Proximo Contato \n3 - Sair");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome:");
				sc.nextLine();
				String nome = sc.nextLine();
				inserirEntrevistado(nome);						
				break;
			case 2:
				System.out.println(removerMusica());				
				break;
			case 3:
				System.out.println("Até mais...");
				break;
			default:
				System.out.println("Opção invalida, escolha novamente");
				break;
			}			
		}while (opcao != 3);
		
		sc.close();

	}
	
	public static void inserirEntrevistado(String nome) {
		contatos.add(nome);
	}
	
	
	public static String removerMusica() {
		if(!contatos.isEmpty()) {
			return contatos.poll();	
		}
		return "Lista vazia";
	}

}
