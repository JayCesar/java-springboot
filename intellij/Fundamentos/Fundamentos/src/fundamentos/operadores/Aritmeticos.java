package fundamentos.operadores;

public class Aritmeticos {

    public static void main(String[] args) {
        System.out.println(2 + 3);
        var x = 34.56; // Lembrando que é inferência
        double y = 2.2;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        int a = 8;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / (double) b); // Assim eu consigo pegar o valor 'quebrado'

        // Módutlo (%)
        System.out.println(a % b); // Pega o resto da divisão
    }
}
