import java.util.Scanner;
import java.util.Stack;

public class Questao1 {
	
	private static Stack<String> stack = new Stack<String>();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		boolean teste = true;
		
		do {
			
			System.out.println("1 - Inserir na Pilha \n2 - Consultar na Pilha \n3 - Remover na Pilha \n4 - Esvaziar Pilha \n5 - Sair");
			
			int key = sc.nextInt();
			
			switch (key) {
			case 1:
				sc.nextLine();
				String livro = sc.nextLine();
				inserir(livro);
				break;
			case 2:
				System.out.println(consultar());
				break;
			case 3:
				remover();
				break;
			case 4:
				esvaziar();
				break;
			default:
				teste = false;
				break;
			}			
		} while(teste);
		
		sc.close();
	}
	
	public static void inserir(String livro) {
		stack.push(livro);
	}
	
	public static String consultar() {
		return stack.peek();
	}
	
	public static void remover() {
		stack.pop();
	}
	
	public static void esvaziar() {
		stack.clear();
	}
	
	

}
