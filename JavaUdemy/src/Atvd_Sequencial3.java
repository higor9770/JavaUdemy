import java.util.Scanner;

public class Atvd_Sequencial3 {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)*/
		
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, diferenca;
		
		System.out.println("Digite os número para fazer a diferença entre eles");
		System.out.print("Número 1: ");
		A = sc.nextInt();
		System.out.print("Número 2: ");
		B = sc.nextInt();
		System.out.print("Número 3: ");
		C = sc.nextInt();
		System.out.print("Número 4: ");
		D = sc.nextInt();
		
		diferenca = (A * B - C * D);
		
		System.out.println(diferenca);

	}

}
