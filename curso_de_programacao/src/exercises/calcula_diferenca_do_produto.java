package exercises;
import java.util.Scanner;

public class calcula_diferenca_do_produto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, dif_produto;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		dif_produto = (a*b) - (c*d);
		
		System.out.printf("DIFERENCA = %d", dif_produto);
		
		sc.close();
		

	}

}