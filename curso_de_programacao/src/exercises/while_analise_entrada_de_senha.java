package exercises;

import java.util.Locale;
import java.util.Scanner;

public class while_analise_entrada_de_senha {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		int senhaTyped = sc.nextInt();
		
		while (senhaTyped != 2002) {
			System.out.println("Senha Inválida");
			senhaTyped = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		
		
		sc.close();
	}
}
