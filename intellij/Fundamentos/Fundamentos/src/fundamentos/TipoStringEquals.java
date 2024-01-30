package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
    
    public static void main(String[] args) {
        System.out.println("2" == "2");

        String s1 = new String("2");
        System.out.println("2" == s1); // Não funciona

        // A forma correta é essa:
        System.out.println("2".equals(s1));

        Scanner entrada = new Scanner(System.in);

        // o next() retira os espaços em branco
        // o nextLine() mantem os espacos em branco
        String s2 = entrada.next().trim(); // trim() remove os espacos em brancos

        System.out.println("2".equals(s2));
        // A moral é sempre usar equals quando forma tratar comperação de igualdade de Stringss
    }

}
