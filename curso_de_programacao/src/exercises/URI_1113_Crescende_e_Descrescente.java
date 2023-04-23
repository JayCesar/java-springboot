package exercises;

import java.util.Locale;
import java.util.Scanner;

public class URI_1113_Crescende_e_Descrescente {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		while (i == 0) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (x > y) {
				System.out.println("Descrescente");
			}
			else if (y > x){
				System.out.println("Crescente");
			}else {
				i += i;
			}
		}
		
		sc.close();
		

	}

}
