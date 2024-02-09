package application;

import java.util.Locale;
import java.util.Scanner;


/*
 Problema exemplo 1:
 
 Fazer um programa para ler um número inteiro N e a altura de N
 pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
 altura média dessas pessoas.
 
*/

public class ProgramVetorAltura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f", avg);
		
		sc.close();

	}

}
