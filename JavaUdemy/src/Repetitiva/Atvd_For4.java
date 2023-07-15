package Repetitiva;

import java.util.Scanner;

public class Atvd_For4 {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
		segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de pares que deseja: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			System.out.print("Primeiro Número: ");
			int x = sc.nextInt();
			System.out.print("Segundo Número: ");
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double div = (double) x / y;
				System.out.printf("A divisão é: %.1f%n", div);
			}
		}
		
		sc.close();

	}

}
