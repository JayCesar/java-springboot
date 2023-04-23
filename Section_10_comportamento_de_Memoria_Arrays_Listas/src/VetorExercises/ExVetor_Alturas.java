package VetorExercises;

import java.util.Locale;
import java.util.Scanner;

public class ExVetor_Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		double somaAlturas = 0, media, percentual;
		int nMenores16 = 0;
		String[] names = new String[n];
		int[] age = new int[n];
		double[] height = new double[n];
		
	
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa \n", i + 1);
			System.out.print("Nome: ");
			names[i] = sc.next();
			
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			height[i] = sc.nextDouble();
			
			somaAlturas += height[i];
			
			if (age[i] < 16) {
				nMenores16++;
			}
		}
		
		media = somaAlturas / n;
		percentual = ((double)nMenores16 / n) * 100;
		
		System.out.printf("\nAltura média: %.2f%n", media);
		System.out.print("Pessoas com menos de 16 anos: " + percentual + "%\n");
		
		for (int i = 0; i < n; i++) {
			if (age[i] < 16) {
				System.out.printf("%s\n", names[i]);
			}
		}
		
		sc.close();

	}
	

}
