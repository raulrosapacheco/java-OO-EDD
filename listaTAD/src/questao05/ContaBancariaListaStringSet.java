package questao05;

public class ContaBancariaListaStringSet implements ContaBancariaSet {
	
	private double saldo;
	private String nome;
	private String numeroConta;
	
	public ContaBancariaListaStringSet(double saldo, String nome, String numeroConta) {
		this.saldo = saldo;
		this.nome = nome;
		this.numeroConta = numeroConta;
	}

	@Override
	public boolean contains(String conta) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double saldo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean depositar(double valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sacar(double valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean atualizar(String nome, int numeroConta) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
