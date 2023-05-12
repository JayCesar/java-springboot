package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorVersion3;

/*
 Fazer um programa para ler um valor numérico qualquer, e daí mostrar
 quanto seria o valor de uma circunferência e do volume de uma esfera
 para um raio daquele valor. Informar também o valor de PI com duas
 casas decimais.
 
 • Versão 3: classe Calculator com método estático
 */

public class ProgramMembrosEstaticosVersion_03 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = CalculatorVersion3.circumference(radius);
		
		double v = CalculatorVersion3.volume(radius);
		
		System.out.printf("Circuference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", CalculatorVersion3.PI);
		
		sc.close();

	}
	
	
}
