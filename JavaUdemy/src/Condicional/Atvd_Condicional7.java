package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Atvd_Condicional7 {

	public static void main(String[] args) {
		/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
		de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
		ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
		Se o ponto estiver na origem, escreva a mensagem “Origem”.
		Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de x: ");
		double x = sc.nextDouble();
		System.out.print("Digite o valor de y: ");
		double y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if (x == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Está no primeiro quadrante: Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Está no segundo quadrante: Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Está no terceiro quadrante: Q3");
		}
		else {
			System.out.println("Está no quarto quadrante: Q4");
		}
		
		sc.close();
		

	}

}
