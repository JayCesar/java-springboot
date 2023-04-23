package application;

import java.util.Locale;
import java.util.Scanner;

/*
 Fazer um programa para ler um valor numérico qualquer, e daí mostrar
 quanto seria o valor de uma circunferência e do volume de uma esfera
 para um raio daquele valor. Informar também o valor de PI com duas
 casas decimais.
 
 Versão 1: métodos na própria classe do programa
 • Nota: dentro de um método estático você não pode chamar membros de
 instância da mesma classe.
 */

public class ProgramMembrosEstaticosVersion_1 {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		
		double v = volume(radius);
		
		System.out.printf("Circuference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		
		
		sc.close();

	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
