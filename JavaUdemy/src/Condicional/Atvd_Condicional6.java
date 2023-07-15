package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Atvd_Condicional6 {

	public static void main(String[] args) {
		/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
		seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
		nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valor;
		
		System.out.print("Digite um número: ");
		valor = sc.nextInt();
		
		
		if (valor > 0 && valor < 25) {
			System.out.println("Está no primeiro intervalo");
		}
		else if(valor > 25 && valor < 50) {
			System.out.println("Está no segundo intervalo");
		}
		else if(valor > 50 && valor < 75) {
			System.out.println("Está no terceiro intervalo");
		}
		else if(valor > 75 && valor < 100) {
			System.out.println("Está no quarto intervalo");
			
		}
		else {
			System.out.print("Fora do Intervalo");
		}
		
		System.out.println("");
		System.out.println("TABELA");
		System.out.println("");
		System.out.println("Intervalos");
		System.out.println("1- intervalo [0, 25]");
		System.out.println("2- intervalo [25, 50]");
		System.out.println("3- intervalo [50, 75]");
		System.out.println("4- intervalo [75, 100]");
		System.out.println("Verifique se o resultado está batendo com a tabela");

	}

}
