package exercises;

import java.util.Locale;
import java.util.Scanner;

public class for_le_numeros_impares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if(x >= 1 && x <= 1000) {
			for (int i = 1; i <= x; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		}
		
		// Solução do professor:
		/*
		 for (int i = 1; i <= x; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		 
		 */
		
		sc.close();

	}

}
