package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ProgramSetDemo2 {

	public static void main(String[] args) {
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		// union
		Set<Integer> c = new TreeSet<>(a);
		// Aqui eu estou fazendo um cópia do set 'a' para o set 'b'
		c.addAll(b);
		// Depois eu faço uma união
		System.out.println(c);
		
		// intersection
		// Junta somente os elementos que eles têm em comum
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		// difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		// Vou remover do conjunto 'e' todo mundo que tá no conjunto b 
		System.out.println(e);

	}

}
