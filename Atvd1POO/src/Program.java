import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		/*Fazer um programa para ler os valores da largura e altura
		de um retângulo. Em seguida, mostrar na tela o valor de
		sua área, perímetro e diagonal. Usar uma classe como
		mostrado no projeto ao lado*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		Retangulo rt = new Retangulo ();
	
		
		System.out.print("Digite a Largura: ");
		rt.largura = sc.nextDouble();
		System.out.print("Digite a Altura: ");
		rt.altura = sc.nextDouble();
		
		double area = rt.area();
		System.out.printf("Área: %.2f%n", area);
		double perimetro = rt.perimetro();
		System.out.printf("Perimetro: %.2f%n", perimetro);
		double diagonal = rt.diagonal();
		System.out.printf("Diagonal: %.2f%n", diagonal);
		
		

	}

}
