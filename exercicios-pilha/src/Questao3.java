import java.util.Scanner;
import java.util.Stack;

public class Questao3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Stack<String> stack = new Stack<String>();

		boolean f = true;

			do {
				System.out.println("Digite 1 para inserir tarefa na pilha, 2 para obter próxima tarefa, 3 para finalizar");

				int n = sc.nextInt();

				if (n == 2 && stack.empty()) {
					System.out.println("Não possui tarefas para realizar");
				} else if (n == 2) {
					System.out.println("Sua proxima tarefa é " + stack.peek());
					stack.pop();
				} else if (n == 1) {
					sc.nextLine();
					String tarefa = sc.nextLine();
					stack.push(tarefa);
				} else if (n == 3) {
					f = false;
				}
			} while (f);

		sc.close();
	}

}
