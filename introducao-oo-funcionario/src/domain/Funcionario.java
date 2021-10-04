package domain;

public class Funcionario {
	
	public String name;
	public double glossSalary;
	public double tax;
	
	public double netSalary() {
		return glossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		this.glossSalary += ((percentage/100)*this.glossSalary); 
	}
	
	public String toString() {
		return name 
				+ ", $ "
				+ String.format("%.2f", netSalary());
	}

}
