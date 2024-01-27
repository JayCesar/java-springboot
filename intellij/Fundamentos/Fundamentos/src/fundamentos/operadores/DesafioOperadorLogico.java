package fundamentos.operadores;

import java.util.Scanner;

public class DesafioOperadorLogico {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("\nO trabalho de terça-feira deu certo? ('S' ou 'N'): ");
            char respo1 = sc.next().charAt(0);
            Boolean terca = verifyInput(respo1);
            System.out.print("O trabalho de quinta-feira deu certo? ('S' ou 'N'): ");
            char respo2 = sc.next().charAt(0);
            Boolean quinta = verifyInput(respo2);

            if(terca && quinta) System.out.println("TV de 50p + Sorvete");
            else if (terca || quinta) System.out.println("TV de 32p + Sorvete");
            else System.out.println("Nenhum sorvete");

            System.out.print("\nDeseja continuar ('S' ou 'N'): ");
            char respo = sc.next().charAt(0);
            if(respo == 'n' || respo == 'N') break;
        }
        sc.close();
    }
    public static boolean verifyInput(char input){
        return input == 's' || input == 'S';
    }
}
