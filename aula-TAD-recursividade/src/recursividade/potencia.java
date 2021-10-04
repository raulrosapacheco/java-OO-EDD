package recursividade;

public class potencia {
	
	
	public static void main(String[] args) {
		System.out.println(potencia(3,2));
	}

	private static double potencia(int x, int y) {	
		if (y == 0) {
			return 1;
		}else {
			return x * potencia(x,y-1);
		}		
		
	}
	
	

}
