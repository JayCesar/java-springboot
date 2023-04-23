package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program_Pensionato_Again {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] roons = new Rent[10];
		
		System.out.print("How many rooms will be rented: ");
		int n = sc.nextInt();
		
		System.out.println();
		for (int i = 1; i <= n; i++) {
			System.out.print("Rent #" + i + ": ");
			System.out.println();
			System.out.print("Name: " );
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			roons[roomNumber] = new Rent(name, email);
			System.out.println();
		}
		
		System.out.println("\nBusy rooms:");
		for(int i = 0; i < roons.length; i++) {
			if (roons[i] != null) {
				System.out.println(i + ": " + roons[i]);
			}
		}
		
		sc.close();

	}

}
