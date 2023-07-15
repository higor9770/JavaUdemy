package application;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
		e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos número você vai digitar: ");
		int n = sc.nextInt(); 

		int[] vet = new int[n];

		for (int i=0; i<n; i++ ) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();			
		}
		
		System.out.print("Os número negativos são: ");
		for (int i=0; i<n; i++ ) {
			if (vet[i] < 0) {
				System.out.print(vet[i]);
			}
		}
		
	}

}
