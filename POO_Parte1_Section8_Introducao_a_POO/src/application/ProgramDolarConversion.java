package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramDolarConversion {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double dollarAmount = sc.nextDouble();
		
		double reaisToPay = CurrencyConverter.convertToReais(dollarPrice, dollarAmount);
		
		System.out.printf("Amount to be paid in reais = %.2f", reaisToPay);
		
		sc.close();

	}

}
