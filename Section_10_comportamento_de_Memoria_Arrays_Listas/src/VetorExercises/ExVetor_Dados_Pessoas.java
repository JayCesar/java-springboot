package VetorExercises;

import java.util.Locale;

/*
 Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa 
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número 
de homens 
 */
import java.util.Scanner;

public class ExVetor_Dados_Pessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		double[] altura = new double[n];
		char[] genero = new char[n];
		int qtdM = 0, qtdF = 0;
		double sumF = 0, menorA = 0, maiorA = 0;

		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			genero[i] = sc.next().charAt(0);
		}

		menorA = altura[0];
		
		for (int i = 0; i < n; i++) {
			if (altura[i] > maiorA) {
				maiorA = altura[i];
			}
			if (altura[i] < menorA) {
				menorA = altura[i];
			}
		
			if (genero[i] == 'M') {
				qtdM++;
			} else if (genero[i] == 'F') {
				qtdF++;
				sumF += altura[i];
			}
		}

	    System.out.printf("Menor altura = %.2f%n", menorA);
	    System.out.printf("Maior altura = %.2f%n", maiorA);
	    System.out.printf("Media das alturas das mulheres = %.2f%n", media(sumF, qtdF));
	    System.out.printf("Numero de homens = %d", qtdM);

		sc.close();
		
	}
	
	public static double media(double sumF, int qtdF) {
		return sumF / qtdF;
	}
	
	

}
