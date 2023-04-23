package exercises;

import java.util.Locale;
import java.util.Scanner;

public class while_le_tipo_de_combustivel {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool++;
			}
			else if (tipo == 2) {
				gasolina++;
			}
			else if (tipo == 3) {
				diesel++;
			}
			tipo = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);
		
		
		sc.close();
	}
}
