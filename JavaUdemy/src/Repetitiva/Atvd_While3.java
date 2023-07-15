package Repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Atvd_While3 {

	public static void main(String[] args) {
		/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
		um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
		4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
		que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
		mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme 
		exemplo*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		System.out.println("1- Álcool");
		System.out.println("2- Gasolina");
		System.out.println("3- Diesel");
		System.out.println("4- Fim");
		System.out.println("Digite o produto que deseja: ");
		
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			
			
			if (tipo == 1) {
				System.out.println("Você escolheu álcool");
				System.out.println("");
				System.out.println("1- Álcool");
				System.out.println("2- Gasolina");
				System.out.println("3- Diesel");
				System.out.println("4- Fim");
				System.out.print("Deseja mais algum produto: ");
				System.out.println("");
				alcool = alcool + 1;
			}
			else if (tipo == 2) {
				System.out.println("Você escolheu gasolina");
				System.out.println("");
				System.out.println("1- Álcool");
				System.out.println("2- Gasolina");
				System.out.println("3- Diesel");
				System.out.println("4- Fim");
				System.out.print("Deseja mais algum produto: ");
				System.out.println("");
				gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
				System.out.println("Você escolheu diesel");
				System.out.println("");
				System.out.println("1- Álcool");
				System.out.println("2- Gasolina");
				System.out.println("3- Diesel");
				System.out.println("4- Fim");
				System.out.print("Deseja mais algum produto: ");
				System.out.println("");
				diesel = diesel + 1;
			}
			
			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

	}

}
