package exercises;

import java.util.Locale;
import java.util.Scanner;

public class URI_1153_for_calcula_numero_fatorial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int fat = 1;
		
		for (int i = 1; i <= n; i++) {
			fat *= i;
		}
		System.out.println(fat);
	
		
		sc.close();

	}

}
