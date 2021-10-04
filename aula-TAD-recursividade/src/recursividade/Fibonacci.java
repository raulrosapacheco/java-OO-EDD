package recursividade;

public class Fibonacci {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.print(fibo(i) + " ");;			
		}
		
	}
		
	private static int fibo(int n) {
	        if (n < 2) {
	            return n;
	        } else {
	            return fibo(n - 1) + fibo(n - 2);
	        }
	    }

}
