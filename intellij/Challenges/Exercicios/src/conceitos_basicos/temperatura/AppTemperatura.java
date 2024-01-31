package conceitos_basicos.temperatura;

import java.util.Scanner;

public class AppTemperatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor a ser convertido: ");
        double value = sc.nextDouble();
        sc.nextLine();
        System.out.print("Qual é o tipo de temperatura? ");
        String type = sc.nextLine();

        TemperaturaConverter converter = new TemperaturaConverter(value, type);

        double temperatureConverted = converter.temperaturaConverter(converter.getValue(), converter.getType());

        String grau = converter.getType().equals("c") ? "ºC" : "ºF";

        String result = converter.getType().equals("c") ? temperatureConverted + "ºF" : temperatureConverted + "ºC";

        System.out.println(value + grau + " = " + result);



        sc.close();
    }
}
