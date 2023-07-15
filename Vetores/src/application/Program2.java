package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Entities2;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Entities2[] vet =  new Entities2[n];
		
		for (int i = 0; i<vet.length; i++ ) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vet[i] = new Entities2(nome, preco);
			
		}
		
		double soma = 0;
		for (int i=0; i<vet.length; i++) {
			
			soma += vet[i].getpreco();
			
		}
		
		double avg = soma/vet.length;
		
		System.out.printf("A média dos preços é: %.2f%n ", avg);
	
		sc.close();

	}

}
