package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class ProgramEx {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			if (ch == 'i') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double anualIncome = sc.nextDouble();
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}else {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double anualIncome = sc.nextDouble();
				System.out.print("Number of employees: ");
				int numberOfEmployers = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployers));
			}
		}
		
		System.out.println();
		
		double totalTax = 0.0;
		System.out.println("TAXES PAID: ");
		for (TaxPayer taxP : list) {
			System.out.println(taxP.getName() + ": $" + String.format("%.2f", taxP.tax()));
			totalTax += taxP.tax();
		}
		System.out.println("\nTOTAL TAXES: $" + String.format("%.2f", totalTax));
		
		sc.close();

	}

}
