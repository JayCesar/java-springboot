package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> listEmp = new ArrayList<>();
	
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
	
		for(int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i+1) + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			listEmp.add(new Employee(id, name, salary));	
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idP = sc.nextInt();
		
		Employee emp = listEmp.stream().filter(x -> x.getId() == idP).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!\n");
		}else{
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.setSalary(percentage);
		}
		
		
		System.out.println("List of employees: ");
		for (Employee x : listEmp) {
			System.out.println(x);
		}
		
		sc.close();

	}

}
