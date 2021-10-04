package domain;

public class Aluno {
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	
	public double nf() {
		return n1 + n2 + n3;
	}
	
	public double missingPoints() {
		if (nf() >= 60) {
			return 0.0;
		} else {
			return 60.0 - nf();
		}
			
	}


}
