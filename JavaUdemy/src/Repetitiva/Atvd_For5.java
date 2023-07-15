package Repetitiva;

import java.util.Scanner;

public class Atvd_For5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		Lembrando que, por definição, fatorial de 0 é 1.*/
		
		System.out.print("Digite um valor para calcular seu fatorial: ");
		int n = sc.nextInt();
		
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.print("O valor de seu fatorial é: ");
		System.out.println(fat);
		
		sc.close();

		
	}

}
