package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do funcionário
		
		// TIPOS NUMÉRICOS INTEIROS
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; 
		/* Quando eu tenho um valor literal maior do que o range;
		 * Eu preciso colocar a letra para dizer qual é o tipo;
		 * Aqui eu coloquei 'L' pois em de 'Long';
		 * O tipo padrão (default) do Java é inteiro;
		*/
		
		// TIPOS NUMÉRICOS REAIS
		float salario = 11_445.44F;
		/* Quando coloco um literal, preciso colocar o 'F' 
		 * (pois aqui o valor sem 'F' é um double)
		 * O default de um tipo flutuante é double! (por isso o 'l');
		*/
		double vendasAcumuladas = 1_234_798_103.01;
		
		// TIPO BOOLEANO
		boolean estaDeFerias = false; // true
		char status = 'A'; // ativo
		
		// Dias de Empresa
		System.out.println(anosDeEmpresa  * 365);
		
		// Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);	
		
	}

}
