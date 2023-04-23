package VetorExercises;

import java.util.Locale;
import java.util.Scanner;

public class ExVetor_soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		double sum = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
			sum += vetor[i];
		}
		
		System.out.println();
	
		System.out.print("VALORES = ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%.1f ", vetor[i]);
		}
		System.out.printf("\nSOMA = %.2f%n", sum);
		System.out.printf("MEDIA = %.2f%n", media(sum, n));
		
		sc.close();
		
	}
	
	public static double media(double sum, int quantity) {
		return sum / quantity;
	}

}
