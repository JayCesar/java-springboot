// uri1072
// A dificuldade foi interpretar o exercício e entender a diferneca entre >= e <= no if.  
package exercises;

import java.util.Scanner;


public class for_calacula_valores_entre_10_e_20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int in = 0;
	    int out = 0;
	    
		int qn = sc.nextInt();
		
	    int numero = 0;
		for (int i = 0; i < qn; i++) {
			numero = sc.nextInt();
			if (numero >= 10 && numero <= 20){
				in++;
			}
			else {
				out++;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}
}