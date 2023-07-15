import java.util.Locale;
import java.util.Scanner;

public class Atvd_Sequencial6 {

	public static void main(String[] args) {
		
		/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
		mostre:
		a) a área do triângulo retângulo que tem A por base e C por altura.
		b) a área do círculo de raio C. (pi = 3.14159)
		c) a área do trapézio que tem A e B por bases e C por altura.
		d) a área do quadrado que tem lado B.
		e) a área do retângulo que tem lados A e B*/
		
	    double A, B, C;
	    
	    double A_triangulo, A_circulo, A_trapezio, A_quadrado, A_retangulo;
	    
	    double pi = 3.14159;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		A = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		B = sc.nextInt();
		System.out.print("Digite o terceiro número: ");
		C = sc.nextInt();
		
		
		A_triangulo =  (B * C) / 2;
		A_circulo = pi * C * C;
		A_trapezio = (A + B)* C / 2;
		A_quadrado = B * B;
		A_retangulo = A * B;
		
		
		System.out.printf("A área do triangulo é: %.3f%n ", A_triangulo);
		
		System.out.printf("A área do circulo é: %.3f%n ", A_circulo);
		
		System.out.printf("A área do trapezio é: %.3f%n ", A_trapezio);
		
		System.out.printf("A área do quadrado é: %.3f%n ", A_quadrado);
		
		System.out.printf("A área do retangulo é: %.3f%n ", A_retangulo);
		
		

	}

}
