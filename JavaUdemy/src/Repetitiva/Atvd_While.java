package Repetitiva;

import java.util.Scanner;

public class Atvd_While {

	public static void main(String[] args) {
		
		/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
		incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
		impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
		Locale.setDefault(Locale.US);*/
		
		Scanner sc = new Scanner(System.in);
		
		int senha1 = 2002;
		int senha;
		
		System.out.print("Digite a senha: ");
		senha = sc.nextInt();
		
		while (senha != senha1) {
			System.out.println("A senha está incorreta");
			System.out.print("Digite a senha novamente: ");
			senha = sc.nextInt();
			
		}
		
		System.out.println("A senha está correta!");

	}

}
