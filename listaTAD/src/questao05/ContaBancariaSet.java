package questao05;

public interface ContaBancariaSet {
	
	public boolean contains(String conta);
	public double saldo();
	public boolean depositar(double valor);
	public boolean sacar (double valor);
	public boolean atualizar(String nome, int numeroConta);
	
}
