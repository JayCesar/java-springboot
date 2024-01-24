package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		double a = 2.3;
		String s = "Bom dia X";
		System.out.println(s);
		
		s = s.toUpperCase();
		System.out.println(s);
		
		s = s.replace("X", "Senhora");
		System.out.println(s);
		
		s = s.concat("!!!!");
		System.out.println(s);
		
		String x = "Leo".toLowerCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toLowerCase()
				.concat("!!!!");
		System.out.println(y);
		// Eu posso quebrar as linhas nos ponto
		
		// TIPOS PRIMITIVOS NÃO TEM O OPERADOR "."		
	}
}
