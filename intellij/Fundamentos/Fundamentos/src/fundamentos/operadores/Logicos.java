package fundamentos.operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && !condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2); // Ou exclusivo
        System.out.println(!condicao1);
        System.out.println(!condicao2);
    }

}
