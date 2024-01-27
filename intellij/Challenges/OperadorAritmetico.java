public class OperadorAritmetico {
    public static void main(String[] args) {
        System.out.println((int)operadorDesafio());
    }

    public static double operadorDesafio() {
        double a = Math.pow(((double) 6 * (3 + 2)), 2) / (3 * 2);
        double b = Math.pow((((double) 1 - 5) * (2 - 7) / 2), 2);
        double c = a - b;
        double d = Math.pow(c, 3);
        return d / Math.pow(10, 3);
    }

}
