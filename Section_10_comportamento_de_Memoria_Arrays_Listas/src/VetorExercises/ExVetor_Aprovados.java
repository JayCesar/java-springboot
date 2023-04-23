package VetorExercises;

import java.util.Locale;
import java.util.Scanner;

public class ExVetor_Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		
		String[] alunos = new String[n];
		double[] notas1S = new double[n];
		double[] notas2S = new double[n];
		double[] media = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i + 1);
			alunos[i] = sc.next();
			notas1S[i] = sc.nextDouble();
			notas2S[i] = sc.nextDouble();
			media[i] = (notas1S[i] + notas2S[i]) / 2;
		}
		
		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < n; i++) {
			if (media[i] >= 6.0) {
				System.out.println(alunos[i]);
			}
		}
		
		
		sc.close();

	}

}
