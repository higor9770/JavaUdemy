package Program;

import java.util.Locale;
import java.util.Scanner;
import Entities.calculos;

public class Banco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		calculos calculos;
		
		System.out.print("Numero da conta: ");
		int numConta = sc.nextInt();
		System.out.print("Nome do titular: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		
		System.out.print("Deseja fazer um deposito: (S/N)");
		char escolha = sc.next().charAt(0);
		
		if (escolha == 'S' || escolha == 's'){
			
			System.out.print("Deposite um valor inicial: ");
			double depositoInicial = sc.nextDouble();
			
			calculos = new calculos (numConta, nomeTitular, depositoInicial);
		}
		
		else {
			
			calculos = new calculos(numConta, nomeTitular);
			
		}
		
		System.out.println("Dados da Conta: ");
		System.out.print(calculos);
		System.out.println();
		System.out.print("Deposite um valor: ");
		double valor = sc.nextDouble();
		calculos.depositos(valor);
		
		System.out.println("Atualização dos dados da conta: ");
		System.out.println(calculos);
		
		System.out.println();
		System.out.print("Saque um valor: ");
		valor = sc.nextDouble();
		calculos.saques(valor);
		
		System.out.println("Atualização dos dados da conta: ");
		System.out.println(calculos);
		
		

		
	}

}
