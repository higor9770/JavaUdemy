import java.util.Scanner;

public class Atvd_Sequencial4 {

	public static void main(String[] args) {
		
		/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		decimais.*/
		
		Scanner sc = new Scanner(System.in);
		
		int cod;
		double horas, valor, salario;
		
		System.out.print("Digite o seu código: ");
		cod = sc.nextInt();
		System.out.print("Digite as horas de trabalho: ");
		horas = sc.nextDouble();
		System.out.print("Digite valor por hora: ");
		valor = sc.nextDouble();
		
		
		salario = horas * valor;
		
		System.out.printf("O valor do salário: %.2f%n", salario);
		
	}

}
