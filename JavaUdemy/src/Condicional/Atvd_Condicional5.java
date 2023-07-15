package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Atvd_Condicional5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double cachorroQuente = 4.00;
		double xsalada = 4.50;
		double xbacon = 5.00;
		double torrada = 2.00;
		double refrigerante = 1.50;
		
		int codigo;
		double valor;
		int quantidade;
		
		System.out.print("digite o código do produto: ");
		codigo = sc.nextInt();
		System.out.print("digite a quantidade de produto: ");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			
			valor = quantidade * cachorroQuente;
			System.out.printf("Total: R$ %.2f%n", valor);
			
		}
		else if(codigo == 2) {
			
			valor = quantidade * xsalada;
			System.out.printf("Total: R$ %.2f%n", valor);
		}
		
		else if(codigo == 3) {
			
			valor = quantidade * xbacon;
			System.out.printf("Total: R$ %.2f%n", valor);
		}
		else if(codigo == 4) {
			
			valor = quantidade * torrada;
			System.out.printf("Total: R$ %.2f%n", valor);
		}
		else if(codigo == 5) {
			
			valor = quantidade * refrigerante;
			System.out.printf("Total: R$ %.2f%n", valor);
		}
		else {
			
			System.out.print("O código do produto não existe!");
		}
		
		
		
	}

}
