package a_partir_versao8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConverterDataParaTexto {

    // Converter DATA para String

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2024-02-08");
        LocalDateTime d05 = LocalDateTime.parse("2024-02-08T01:30:36");
        Instant d06 = Instant.parse("2024-02-08T01:30:36Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("d04 = " + d04);
        // Mas eu posso utilizar o fmt1 para dizer o tipo que será impresso de Data para String
        System.out.println("d04 = " + d04.format(fmt1)); // Uma forma
        System.out.println("d04 = " + fmt1.format(d04)); // Outra forma
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        // Formatando LoalDateTime
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("d05 = " + d05.format(fmt1));
        System.out.println("d05 = " + d05.format(fmt2));

        // Para formatar Instant
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // Pega o horário e fuso-horário do computador local
        System.out.println("d06 = " + fmt3.format(d06)); // Inverte a ordem

    }
}
