package entities;

public class Employee {
	
	public String nome;
	public double salarioBruto;
	public double imposto;

	
	public double salarioLiquido() {
		
		return salarioBruto - imposto;
	
	}


	public String toString() {
		
		return nome
				+ ", $"
				+ String.format("%.2f", salarioLiquido());
		
	}

}
