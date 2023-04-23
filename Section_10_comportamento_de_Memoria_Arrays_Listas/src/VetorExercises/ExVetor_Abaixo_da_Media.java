package VetorExercises;

import java.util.Locale;
import java.util.Scanner;

public class ExVetor_Abaixo_da_Media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double media = 0, soma = 0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		
		media = soma / n;
		
		System.out.printf("\nMEDIA DO VETOR: %.3f%n", media);
		System.out.print("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i <n; i++) {
			if (vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();

	}

}
