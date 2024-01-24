package application;

import java.util.Locale;
import java.util.Scanner;

import services.FahrenheitToCelsius;

public class app {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			FahrenheitToCelsius fahrenheitToCelsius = new FahrenheitToCelsius();
			
			System.out.print("Digite o valor em Fahrenheit: ");
			double valueF = sc.nextDouble();
			double valueC = fahrenheitToCelsius.FahrenheitToCelsius(valueF);

			System.out.printf("%.2fºF = %.2fºC", valueF, valueC);
			
			System.out.print("\nDeseja continuar(s/n)? ");
			String respo = sc.next();
			if (respo.charAt(0) == 'n') break;
			else System.out.println();
			
		}
	}

}
