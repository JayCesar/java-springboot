package While;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // do {} while(...); // É a única que acaba com ponto e vírgula

        Scanner entrada = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Você precisa falar as palavras mágicas");
            System.out.println("Qeur sair? ");
            texto = entrada.nextLine();
        } while(!texto.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado!");

        entrada.close();
    }
}
