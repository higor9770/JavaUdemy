package Repetitiva;

import java.util.Scanner;

public class Atvd_For3 {

	public static void main(String[] args) {
		
		/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
		de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
		conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
		peso 5.*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos alunos deseja colocar a nota: ");
		int n = sc.nextInt();
		
		
		for (int i=0; i< n ; i++) {
			
			System.out.print("Nota 1: ");
			double nota1 = sc.nextDouble();
			System.out.print("Nota 2: ");
			double nota2 = sc.nextDouble();
			System.out.print("Nota 3: ");
			double nota3 = sc.nextDouble();

			double media = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10.0;

			System.out.printf("A Média dos alunos foram: %.1f%n", media);
		}
		
		System.out.println("Esse foi o limite de alunos colocados!");
		sc.close();

	}

}
