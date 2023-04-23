package VetorExercises;

import java.util.Locale;
import java.util.Scanner;

public class ExVetor_Desafio_Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] roons = new String[10];
		
		System.out.print("How many rooms will be rented? ");
		int qtdRoons = sc.nextInt();
		
		System.out.println();
		for(int i = 0; i < qtdRoons; i++) {
			System.out.println("Rent #" + (i+1));
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int nRoom = sc.nextInt();
			roons[nRoom] = name + ", " + email;
			System.out.println();
		}
		
		System.out.println("\nBusy rooms: ");
		for (int i = 0; i < roons.length; i++) {
			if (roons[i] != null) {
				System.out.println(i + ": " + roons[i]);
			}
		}
		
		
		
		
		sc.close();

	}

}
