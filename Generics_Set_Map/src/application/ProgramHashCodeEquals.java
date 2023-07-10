package application;

import entities.Client;

public class ProgramHashCodeEquals {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		// Quando eu utilizo o '==' eu estou comparando as feferências de memória! Ou seja, eles têm
				// posições de memória diferentes! Por isso deu 'false!';
		
		System.out.println();
		
		String s1 = "Test";
		String s2 = "Test";
		System.out.println(s1 == s2);
		// Aqui vai dar 'false' porque o compilador dá um tratamento especial para literais
		// Isso não aconteceria se eu fizesse assim: new String("Test");
		// Porque aqui não é literal e sim objeto!
		System.out.println();
		
		String s4 = new String("Test");
		String s3 = new String("Test");
		
		System.out.println(s3 == s4);
		
		// Equals
		/*String a = "Maria";
		String b = "Alex";*/

		//System.out.println(a.equals(b));
		
		//HashCode
		/*String A = "Maria";
		String B = "Alex";

		System.out.println(A.hashCode()); 
		System.out.println(B.hashCode());*/
	}

}
