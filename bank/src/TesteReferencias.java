
public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;		
		System.out.println("saldo da primeira conta é " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta; //mais uma referência 
		System.out.println("saldo da segunda conta é " + segundaConta.saldo);
		
		segundaConta.saldo +=100;
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		System.out.println("saldo da primeira conta é " + primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("são as mesmas contas");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);

	}

}
