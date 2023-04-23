package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ProgramRetangle {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangleX = new Rectangle();
		
		System.out.println("Enter rectangle width and height");
		rectangleX.width = sc.nextDouble();
		rectangleX.height = sc.nextDouble();
		
		System.out.println(rectangleX);
		sc.close();
	}
}
