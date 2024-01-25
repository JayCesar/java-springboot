package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.println("Bom");
		
		System.out.printf("Valores: %d %d %d%n", 1, 2, 3);
		System.out.print("a");
		System.out.printf("Nome: %s%n", "João");
		
		Scanner entrada = new Scanner(System.in);
		
		entrada.close();
	}
	
}