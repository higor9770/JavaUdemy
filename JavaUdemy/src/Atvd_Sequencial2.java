import java.util.Scanner;

public class Atvd_Sequencial2 {

	public static void main(String[] args) {
		
		/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		casas decimais conforme exemplos.
		Fórmula da área: area = π . raio2
		Considere o valor de π = 3.14159*/
		
		Scanner sc = new Scanner(System.in);
		
		double raio, area, pi = 3.14159;
		
	
		System.out.print("Digite o valor do raio: ");
		raio = sc.nextDouble();
		area = pi * raio * raio;
		
		System.out.println("Já consideramos o valor de pi = 3.14159");
		System.out.println("Pegamos o valor do raio:'" + raio + "' multiplicamos por '" + pi + "' o valor do raio ao quadrado");
		System.out.printf("O valor da área do circulo é: %.2f%n", area);
		
		
		
	}

}
