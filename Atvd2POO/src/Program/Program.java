package Program;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
		seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
		salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
		afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
		projetada abaixo.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		Employee EM = new Employee ();
		
		System.out.print("Nome: ");
		EM.nome = sc.next();
		System.out.print("Salário Bruto: ");
		EM.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		EM.imposto = sc.nextDouble();
		
		
		System.out.println("Funcionário: "+ EM);
		
		double valor;
		
		System.out.print("Qual o valor da porcentagem do acrescimo do salário: ");
		valor = sc.nextDouble();
		
		double acrescimo = EM.salarioBruto + (EM.salarioBruto * (valor/100));		
		System.out.print("Update data: " + EM.nome+ ", " + acrescimo);
		

	}

}
