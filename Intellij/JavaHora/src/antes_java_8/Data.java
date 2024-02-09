package antes_java_8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
    public static void main(String[] args) throws ParseException { // A execeção é um erro que deve ser declarado

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Agora eu estou criando a data
        Date y1 = sdf1.parse("25/06/2018"); // O parse recebe um dado no formato de String e converter para data respeitando a regra
        Date y2 = sdf2.parse("25/06/2018 15:42:07");
        // Assim eu criei dois ojetos do tipo Date

        System.out.println("y1 = " + y1); // Está imprimindo o objeto data
        System.out.println("y2 = " + y2); // Está imprmindo o objeto data

        // Agora para imprimir do jeito que ue especifiquei
        System.out.println("y1 = " + sdf1.format(y1));
        System.out.println("y2 = " + sdf2.format(y2));

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis()); // Outro jeito
        System.out.println(x2);
//        System.out.println(sdf2.format(x1));

    }
}
