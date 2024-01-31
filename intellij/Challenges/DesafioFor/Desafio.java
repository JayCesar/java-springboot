package DesafioFor;

public class Desafio {

    public static void main(String[] args) {

        String valor = "#";
        for(int i = 1; i <= 5; i++){
            System.out.println(valor);
            valor += "#";
        }

        // Versão do desafio
        // Não pode utilizar valor numérico para controlar o laço!

        valor = "#";
        System.out.println();

        // Minha solução em pouco tempo
        for (String i = ""; !i.equalsIgnoreCase("eeeee"); ){
            System.out.println(valor);
            valor += "#";
            i += "e";
        }

        // Resolução:
        System.out.println();
        for (String v = "#"; !v.equals("######"); v += "#"){
            System.out.println(v);
        }


    }
}
