package VetorExercises;

import java.util.Locale;
import java.util.Scanner;

public class ExVetor_Numeros_Pares {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int nPares = 0;
		int[] numbers = new int[n];
		
		for (int i = 0; i < n; i ++) {
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextInt();
		}
		
		System.out.println("\nNÚMEROS PARES:");
		for (int i = 0; i < n; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.printf("%d ", numbers[i]);
				nPares++;
			}
		}
		System.out.println("\n\nQUANTIDADE DE PARES = " + nPares);
		
		sc.close();
	}
}
