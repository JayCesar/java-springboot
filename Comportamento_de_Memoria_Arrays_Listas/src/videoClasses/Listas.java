package videoClasses;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		
		// Para remover um elemento:
		// list.remove(1); // Por index
		// list.remove("Anna"); // Compara o valor e se for igual ele remove
		
		System.out.println("--------------");
		
		// Para remover um elemento que começa com a letra 'M':
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		

		System.out.println("--------------");
		
		
		// Para encontrar a posição de um elemento:
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		// Para encontrar alguém que não existe na lista:
		System.out.println("Index of Bob: " + list.indexOf("Marco"));
		// Obs: quando o indexOf não encontra um elemento, ele retorna -1;
		
		
		System.out.println("--------------");
		
		
		// Para deixar na lista comente quem começa com a letra 'A':
		// Para fazer isso eu preciso criar outra lista para salvar o fitro que irei fazer na lista original;
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		/*
		1) Eu criei uma nova lista do tipo String, chamada result
		2) Depois eu adicionei adicionei um tipo 'stream()' que é um tipo especial do Java que aceita operaçãos em Lambda
		3) Depois eu adicionei o método filter e dentro dele eu coloquei a operação em Lambda que procurar as Strings, ou seja, os nomes que comecem com a letra 'A';
		4) Pelo fato de o 'stream()' não ser compatível com List, eu tenho que converter ele de novo para a lista, para fazer isso eu chamei a função 'collect()'
		5) Dentro do argumento eu adicionei Collectors.toList(); Ou seja, agora está compatível;
		
		Resumo: Primeiro eu converto para stream, faço a operação que eu quero e depois volto ele para lista!
		
		*/
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("--------------");
		
		
		// Para encontrar o primeio elemento que começa com a letra 'A':
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name2);
		
		
	}

}
