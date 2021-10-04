import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class Questao4 {

	private static Queue<Aluno> alunos = new LinkedList<Aluno>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcao = 0;
		do {
			System.out.println("1 - Inserir aluno \n2 - Consultar lista \n3 - Sair");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do aluno");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.println("Digite a idade do aluno");
				int idade = sc.nextInt();
				Aluno aluno = new Aluno(nome, idade);
				if (inserirAluno(aluno))
					System.out.println("Aluno inserida");
				else
					System.out.println("Erro ao inserir");
				break;
			case 2:
				System.out.println(consultaFila());
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

	public static boolean inserirAluno(Aluno aluno) {
		if (alunos.add(aluno)) {
			return true;
		}
		return false;
	}

	public static String consultaFila() {
		List<Aluno> porIdade = (List<Aluno>) alunos;
		porIdade.sort(Comparator.comparing(Aluno::getIdade));
		if (alunos.isEmpty()) {
			return "Fila de alunos vazia";
		}
		StringBuilder sb = new StringBuilder();
		for (Aluno aluno : porIdade) {
			sb.append(aluno.getNome() + " " + aluno.getIdade() + "\n");			
		}
		return sb.toString();
	}

}
