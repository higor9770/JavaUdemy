package Program;

import java.util.Locale;
import java.util.Scanner;
import util.ConversorDeMoedas;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual é o preço do dolar? ");
		double PrecoDolar = sc.nextDouble();
		
		System.out.print("Quantos dólares serão comprados? ");
		double quantia = sc.nextDouble();
		
		double resultado = ConversorDeMoedas.dolarParaReal(quantia, PrecoDolar);
		System.out.printf("Valor a ser pago em reais = %.2f%n", resultado);
		
		
		sc.close();
	
	}

}
