package entities;

public class Conta {

	private int numeroDaConta;
	private String nomeTitular;
	private double saldo;
	private static final double TAXA = 5.00;

	public Conta(int numeroDaConta, String nomeTitular) {
		this.numeroDaConta = numeroDaConta;
		this.nomeTitular = nomeTitular;
	}

	public Conta(int numeroDaConta, String nomeTitular, double depositoInicial) {
		this.numeroDaConta = numeroDaConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public Integer getNumeroDaConta() {
		return numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void saque(double valor) {
			this.saldo -= valor + TAXA;
	}

	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public String toString() {
		return "Account " 
				+ getNumeroDaConta()
				+ ", Holder: "
				+ getNomeTitular()
				+ ", Balance: $ "
				+ String.format("%.2f", getSaldo());
		
	}

}
