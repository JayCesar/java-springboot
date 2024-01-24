package fundamentos;

public class Inferencia {

	public static void main(String[] args){
		
		double a = 4.5;
		System.out.println();
		
		var b = 4.5;
		// Aqui a variável será do tipo do valor que eu colocar (isso é inferência e tem haver com o quê o Mulero disse)
		
		var c = "Texto"; // A variável c será do tipo String
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		// Mas eu não posso mudar o tipo da variável!
		
		// IMPORTANTE!
		double d;
		d = 123.65;
		// Eu não consigo fazer isso utilizando o 'var' pois eu preciso já inicializar ela! 
		// Porque só assim o Java consegue inferir o tipo dessa variável
	}
}
