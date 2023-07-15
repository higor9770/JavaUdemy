package Entities;

public class calculos {

	private int numConta;
	private String nomeTitular;
	private double saldo;
	
	public calculos(int numConta, String nomeTitular) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
	}

	public calculos(int numConta, String nomeTitular, double depositoInicial) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		depositos(depositoInicial);
	}
	
	public int getNumConta() {
		return numConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositos (double valor) {
		
		saldo += valor;
		
	}
	
	public void saques (double valor) {
		
		saldo -= (valor + 5.0);
		
	}
	
	public String toString() {
		return "Numero da conta "
				+ numConta
				+", Nome do titular: "
				+ nomeTitular
				+", Saldo: $"
				+ String.format("%.2f", saldo);
	}
	
	
	
}