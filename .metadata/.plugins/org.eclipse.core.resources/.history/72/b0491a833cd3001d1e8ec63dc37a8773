package exercises;
import java.util.Locale;
import java.util.Scanner;

public class calcula_trigonometria {

	public static void main(String[] args) {
		
		//Input
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a, b, c, area_t, area_c, area_trap, area_quad, area_ret;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		//Process
		area_t = (a * c) / 2;
		area_c = 3.14159 * Math.pow(c, 2);
		area_trap = ((a * b) * c) / 2;
		area_quad = b*b;
		area_ret = a*b;
		
		System.out.printf("TRIANGULO: %.3f%n", area_t);
		System.out.printf("CIRCULO: %.3f%n", area_c);
		System.out.printf("TRAPEZIO: %.3f%n", area_trap);
		System.out.printf("TRAPEZIO: %.3f%n", area_quad);
		System.out.printf("TRAPEZIO: %.3f%n", area_ret);
				
		
		sc.close();

	}

}
