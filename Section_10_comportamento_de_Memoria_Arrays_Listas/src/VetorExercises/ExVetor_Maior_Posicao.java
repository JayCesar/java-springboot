package VetorExercises;

import java.util.Locale;
import java.util.Scanner;

public class ExVetor_Maior_Posicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double maiorValor = 0;
	    int indexMaiorValor = 0;
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
	
		double[] vetor = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		maiorValor = vetor[0];
		
		for (int i = 1; i < n; i++) {
			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
				indexMaiorValor = i;
			}
		}
		System.out.println("\nMAIOR VALOR = " + maiorValor);
		System.out.print("POSICAO DO MAIOR VALOR = " + indexMaiorValor);
		
		sc.close();

	}

}
