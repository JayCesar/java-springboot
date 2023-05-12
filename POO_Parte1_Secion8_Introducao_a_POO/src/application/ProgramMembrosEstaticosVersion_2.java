package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

/*
 Fazer um programa para ler um valor numérico qualquer, e daí mostrar
 quanto seria o valor de uma circunferência e do volume de uma esfera
 para um raio daquele valor. Informar também o valor de PI com duas
 casas decimais.
 
 • Versão 2: classe Calculator com membros de instância
 */

public class ProgramMembrosEstaticosVersion_2 {
	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circuference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		sc.close();

	}
	
	
}
