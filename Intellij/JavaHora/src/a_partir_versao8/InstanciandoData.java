package a_partir_versao8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciandoData {

    // Instanciar a partir de Strings
    public static void main(String[] args) {

        // Hora Local
        LocalDate d01 = LocalDate.now();
        System.out.println("d02 = " + d01); // é como se eu chamasse d01.toString(); (imprime no formato 8601)
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("d02 = " + d02); // é como se eu chamasse d02.toString(); (imprime no formato 8601)

        // Pegando um texto ISO 8601 e gerar uma data a partir dela
        LocalDate d03 = LocalDate.parse("2023-02-08"); // O parse vem de String para Objeto Data
        System.out.println("d03 = " + d03);
        LocalDateTime d04 = LocalDateTime.parse("2022-07-20T01:30:26");// Esse é o padrão ISO 8601
        System.out.println("d04 = " + d04);

        // Hora Global
        Instant d05 = Instant.now();
        System.out.println("d05 = " + d05);

        Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // Precisei passar o 6
        System.out.println("d06 = " + d06);

        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); // Assim eu passo um timezone diferente
        System.out.println("d07 = " + d07);

        // Texto nm formato customizado para virar uma data hora
        // LocalDate d08 = LocalDate.parse("20/07/2022");
        // Erro: Text '20/07/2022' could not be parsed at index 0
        // Isso acontece porque em nenhum local eu passei esse formato como 'referência'
        // Para isso eu preciso utilizar o DateTimeFormatter
        // DateTimeFormatter é uma classe que serve para formatar data (de string para objeto de data hora)

        // Formatações:
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Agora sim:
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); // Preciso passar o seguno argumento da formatação (como vou interprestar o texto)
        System.out.println("d08 = " + d08);
        // Então o parse do LocalDate tem essa opção de adicionar um novo argumento que é o de formatação

        // LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30"); // Vai gerar o mesmo erro, eu preciso passar a formatação
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        // Agora sim:
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
        System.out.println("d09 = " + d09);

        // Instanciado isoladamente
        LocalDate d10 = LocalDate.of(2022, 7, 20);
        System.out.println("d10 = " + d10);

        LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);

        // Teste
        DateTimeFormatter formatterTest = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime teste = LocalDateTime.now();
        System.out.println(formatterTest.format(teste));

        // Obs: Então o formatter é apenas para pegar do String, pois o formato de data no java segue o ISO 8601

        // Conclusão
        /*
        * O LocalDate e o LocalDateTime precisa de uma formatação quando eu quiser salvar de String para Hora.
        * Essa formtação vem do DateTimeFormater, que é uma classe feita para formatar data (de string para objeto de data hora)
        * Atenção no LocalDate.of(). Com ele consigo instnaciar isoladamente;
        * */


    }
}
