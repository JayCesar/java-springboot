package conceitos_basicos.IMC;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura (em metros): ");
        double height = sc.nextDouble();
        System.out.print("Digite o peso (em quilos): ");
        double weight = sc.nextDouble();

        double imc = weight / (height * height);
        System.out.printf("O IMC é " + String.format("%.2f", imc));



        sc.close();
    }
}
