import java.util.Scanner;

public class Atvd_Sequencial {

	public static void main(String[] args) {
		/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		mensagem explicativa, conforme exemplos.*/
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, media;
		
		
		System.out.println("Insira dois números ");
		System.out.print("Número 1: ");
		num1 = sc.nextInt();
		System.out.print("Número 2: ");
		num2 = sc.nextInt();
		
		media = (num1 + num2)/2;
		
		System.out.printf("A média é: ", media);
		
	}

}
