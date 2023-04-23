package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CorrectEmployee;


public class ProgramCorrectEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<CorrectEmployee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.println();
			System.out.println("Employee #" + (i+1) + ": ");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)){
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			CorrectEmployee emp = new CorrectEmployee(id, name, salary);
			
			list.add(emp);
		}
		
		System.out.println();
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		
		// Jeito 1
		
		CorrectEmployee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist!\n");
		}else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
		// Jeito 2
		
		// Integer pos = positionId(list, idSalary);
		
		/*if (pos == null) {
			System.out.println("This id does not exist!\n");
		}else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}*/
		
		System.out.println();
		
		System.out.println("List of employees: ");
		
		for (CorrectEmployee e : list) {
			System.out.println(e);
		}
	
		sc.close();
	}
	
	public static Integer positionId(List<CorrectEmployee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id){
				return i;
			}
		}
		return null;
	}
	
	/* Outro jeito:
	public static int hasId(List<CorrectEmployee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId()  == id){
				return i;
			}
		}
		return -1;
	}*/

	
	// Função hasId:
	public static boolean hasId(List<CorrectEmployee> list, int id) {
		CorrectEmployee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
