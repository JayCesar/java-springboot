package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {

		double raio = 3.4; // Isso é uma variável
		final double PI = 3.14159; // Isso é uma CONSTANTE
		
		double area = raio * PI; // Outra variável
		// É uma convenção utilizar letras maiúsculas para nome de constantes
		System.out.println(PI * raio);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.printf("Area = %.2f", area);
			
	}
}
