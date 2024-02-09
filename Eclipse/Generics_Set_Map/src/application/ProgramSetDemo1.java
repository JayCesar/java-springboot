package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class ProgramSetDemo1 {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		// Esse HashSet é a implementação mais rápida!

		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		set.removeIf(x -> x.length() >= 3);
		// Removo todo elemento x tal que o seu tamaho seja maior ou igual a 3
		
		set.removeIf(x -> x.charAt(0) == 'T');
		// Remove todo elemento x tal que o primeiro caractere seja igua la 'T';
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
	
	}
}
