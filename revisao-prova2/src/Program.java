import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Program {
	
	private static Queue<Pessoa> feminino = new LinkedList<Pessoa>();	
	private static Stack<Pessoa> masculino = new Stack<Pessoa>();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String nome;
		do {
			System.out.print("Digite o nome: ");
			nome = sc.nextLine();
			if(nome.equals("fim")) {
			} else {
				System.out.print("Digite o sexo m/f: ");
				String sexo = sc.nextLine();
				Sexo s = Sexo.valueOfCodigo(sexo);
				Pessoa pessoa = new Pessoa(nome, s);
				if(pessoa.getSexo().getDescricao().equals("feminino")) {
					feminino.add(pessoa);
				} else {
					masculino.push(pessoa);
				}
			}			
		}while(!nome.equals("fim"));
		
		System.out.println(masculino);
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println(feminino);

	}

}
