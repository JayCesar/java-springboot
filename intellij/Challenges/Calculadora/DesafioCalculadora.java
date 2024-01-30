package Calculadora;

import java.util.Scanner;

// Apenas para usar o que foi passado até aqui
public class DesafioCalculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double teste = 1 / 2 ;
        System.out.print("\nDigite o 1° número: ");
        double num1 = sc.nextDouble();
        System.out.print("\nDigite o 2° número: ");
        double num2 = sc.nextDouble();
        System.out.print("\nQual operação? (+ - * /): ");
        char operacao = sc.next().charAt(0);

        // Meu jeito
        double result = operacao == '/' ? num1 / num2
                        : operacao == '+' ? num1 + num2
                        : operacao == '-' ? num1 - num2
                        : operacao == '%' ? num1 % num2
                        : num1 * num2;
        
        // Outra forma:
        String op = String.valueOf(operacao);
        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;

        System.out.println(result);
        System.out.println(resultado);

        sc.close();
    }
}
