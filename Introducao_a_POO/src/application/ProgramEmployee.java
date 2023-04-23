package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp1 = new Employee();
		System.out.println("Name: ");
		emp1.name = sc.nextLine();
		System.out.println("Gross salary: ");
		emp1.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		emp1.tax = sc.nextDouble();
		
		System.out.println("Employe: " + emp1);
		
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		
		emp1.increaseSalary(percentage);
		
		System.out.println("Updated data: " + emp1);
		
		
		
		
		sc.close();
	}
}
