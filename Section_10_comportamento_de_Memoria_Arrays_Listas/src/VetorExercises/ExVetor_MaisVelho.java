package VetorExercises;

import java.util.Locale;
import java.util.Scanner;

public class ExVetor_MaisVelho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		int[] age = new int[n];
		
		int maiorIdade = 0;
		String pessoaMaisVelha = "";
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa: \n", i + 1);
			System.out.print("Nome: ");
			name[i] = sc.next();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
			if (age[i] > maiorIdade) {
				maiorIdade = age[i];
				pessoaMaisVelha = name[i];
			}
		}
		System.out.println("\nPESSOA MAIS VELHA: " + pessoaMaisVelha);
		
		sc.close();

	}

}
