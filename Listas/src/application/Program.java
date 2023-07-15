package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Entities;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Entities> list = new ArrayList<>();
		
		System.out.print("Quantos funcionários vão ser inseridos?");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			System.out.println("Funcioário " +(i+1)+ ": ");

			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Digite o nome: ");
			String name = sc.nextLine();
			
			System.out.print("Digite o salário: ");
			double salary = sc.nextDouble();
	
			
			list.add(new Entities(id, name, salary));
			
			
		}
				
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		Entities emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Entities obj : list) {
			System.out.println(obj);
		}
		

	}

	public static boolean hasId(List<Entities> list, int id) {
		Entities emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
}
