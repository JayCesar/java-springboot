package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class AppFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i+1) + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			while(hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Funcionario(id, name,salary));
		}
		
		System.out.println();
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idChosed = sc.nextInt();
	
		/*
		while(!hasId(list, idChosed)) {
			System.out.print("This id does not exist, try again: ");
			idChosed = sc.nextInt();
		}
		
		Funcionario empChosed = list.stream().filter(x -> x.getId() == idChosed).findFirst().orElse(null);
		System.out.print("Enter the percentage: ");
		double percentage = sc.nextDouble();
		empChosed.increaseSalary(percentage);
		*/
	
		
		
		
		System.out.println();
		System.out.println("List of employees:");
		for (Funcionario emp : list) {
			System.out.println(emp);
		}
		
		
		/*System.out.print("Enter the employee id that will have salary increase: ");
		double salary = sc.nextDouble();*/
		
		sc.close();

	}
	
	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}


}