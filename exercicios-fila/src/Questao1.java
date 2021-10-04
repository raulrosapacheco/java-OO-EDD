import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Questao1 {
	
	private static Queue<String> musicas = new LinkedList<String>();
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao = 0;
		do {
			System.out.println("1 - Inserir Música \n2 - Consultar Playlist \n3 - Remover Música \n4 - Sair");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Digite a música");
				sc.nextLine();
				String musica = sc.nextLine();
				if (inserirMusica(musica))
					System.out.println("Musica inserida");
				else
					System.out.println("Erro ao inserir");						
				break;
			case 2:
				System.out.println(consultaFila());
				break;
			case 3:
				System.out.println(removerMusica());				
				break;
			case 4:
				System.out.println("Até mais...");
				break;
			default:
				System.out.println("Opção invalida, escolha novamente");
				break;
			}			
		}while (opcao != 4);
		
		sc.close();

	}
	
	public static boolean inserirMusica(String musica) {
		if(musicas.add(musica)) {
			return true;
		}
		return false;
	}
	
	public static String consultaFila() {
		if(musicas.isEmpty()) {
			return "Fila de musicas vazia";
		}		
		return musicas.toString();
	}
	
	public static String removerMusica() {
		if(!musicas.isEmpty()) {
			musicas.poll();	
			return "Musica removida";
		}
		return "Lista vazia";
	}

}
