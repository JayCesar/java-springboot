package application;

import java.util.Map;
import java.util.TreeMap;

public class ProgramMapDemo1 {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		// Lembrando: o TreeMap ordena, logo ele vai ordenar pela chave (key)!
		
		cookies.put("username", "Maria");
		// Para saber o valor do username, eu apenas devo chamar a chave 'username' e ele vai retornar 'Maria';
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		System.out.println("All COOKIES:");
		for (String key : cookies.keySet()) { // cookies.keySet() returna um set de todas as chaves
			System.out.println(key + ": " + cookies.get(key));
		}
	
		cookies.remove("email"); 
		System.out.println("\nApós remover o e-mail");
		// Eu removo do map aquela entrada cuja a chave seja o e-mail;
		for (String key : cookies.keySet()) { // cookies.keySet() returna um set de todas as chaves
			System.out.println(key + ": " + cookies.get(key));
		}
		
		// Adicionando um outro valor numa chave que já existe (phone) - Ele vai sobreescever:
		cookies.put("phone", "99771133");
		System.out.println("\nAll COOKIES (Sobrescrevendo o phone): ");
		for (String key : cookies.keySet()) { // cookies.keySet() returna um set de todas as chaves
			System.out.println(key + ": " + cookies.get(key));
		}
		
		// Verificando se contém a chave 'phone'
		System.out.println("\nContains 'phone' key: " + cookies.containsKey("phone"));
		
		// Pegando o valor da chave 'phone' (que existe)
		System.out.println("\nPhone number: " + cookies.get("phone"));
		
		// Tentando pegar um valor que não existe (pois eu removi ele):
		System.out.println("\nEmail: " + cookies.get("email")); 
		
		// Acessando o tamnho do map
		System.out.println("\nSize: " + cookies.size());
		
	}

}
