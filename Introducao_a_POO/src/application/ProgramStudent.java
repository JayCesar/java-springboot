package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student();
		
		System.out.println("Name: ");
		s1.name = sc.nextLine();
		System.out.println("Nota 1: ");
		s1.n1 = sc.nextDouble();
		System.out.println("Nota 2: ");
		s1.n2 = sc.nextDouble();
		System.out.println("Nota 3: ");
		s1.n3 = sc.nextDouble();
		
		s1.verifyNotes(s1.sumNotes());
		
		sc.close();

	}

}
