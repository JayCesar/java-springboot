package fundamentos.operadores;

public class Ternario {

    public static void main(String[] args) {

        double media = 7.6;

        String resultadoParcial = media >= 5.0 ? "Aprovado" : "Recuperação";

        String resultadoFinal = media >= 7.0 ?
                    "Aprovado" : "Recuperação";

        System.out.println("O aluno está " + resultadoFinal);

    }
}
