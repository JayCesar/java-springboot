package VetorExercises;

import java.util.Locale;
import java.util.Scanner;

public class ExVetor_Negativos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int amount = 11;
		
		while (amount > 10) {
			System.out.print("Quantos números você vai digitar? (Máximo 10) ");
			amount = sc.nextInt();
		}
		sc.nextLine();
		
		int[] typedNumbers = new int[amount];
		
		for (int i = 0; i < amount; i++) {
			System.out.print("Digite um número: ");
			typedNumbers[i] = sc.nextInt();
		}
		
		System.out.println("NÚMERO NEGATIVOS: ");
		for (int i = 0; i < amount; i ++) {
			if (typedNumbers[i] < 0) {
				System.out.println(typedNumbers[i]);
			}
		}
		
		
		
		
		
		
		sc.close();

	}

}
