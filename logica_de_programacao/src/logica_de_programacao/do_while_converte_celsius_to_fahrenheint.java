/*
Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o
programa.  
 
*/

package logica_de_programacao;

import java.util.Locale;
import java.util.Scanner;

public class do_while_converte_celsius_to_fahrenheint {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/* Utilizando do-while: */

		char resp;
		do {
			System.out.print("Digite a temperatuara em Celsius: ");
			double C = sc.nextDouble();
			double F = (9.0 * C) / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.2f%n", F);
			System.out.print("Deseja repetir (s/n)");
			resp = sc.next().charAt(0);
		} while(resp != 'n');
		

		/* Utilizando while: */

		/*
		 * char resp = 's';
		 * 
		 * while (resp != 'n') { System.out.print("Digite a temperatuara em Celsius: ");
		 * double C = sc.nextDouble(); double F = (9.0 * C) / 5.0 + 32.0;
		 * System.out.printf("Equivalente em Fahrenheit: %.2f%n", F);
		 * System.out.print("Deseja repetir (s/n)"); resp = sc.next().charAt(0); }
		 */

		sc.close();

	}
}
