package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConvertendoParaTexto {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2023-03-10");
		LocalDateTime d05 = LocalDateTime.parse("2023-03-10T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		// https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		// Eu criei um oibjeto de formatação com esse padrão, contúdo, considerando o fuzo=horário do computador do usuário
		// É importante eu especificar o fuso horário! 
		
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		// ISO_DATE_TIME é uma data/formatação que NÃO TEM fuso horário!
		
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		// ISO_INSTANT é uma data/formatação que TEM fuso horário!
		
		
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d05 = " + d05.format(fmt4));
		
		System.out.println("d06 = " + fmt3.format(d06));
		System.out.println("d06 = " + fmt5.format(d06));
		System.out.println("d06 = " + d06.toString());
		
		
		
	}

}
