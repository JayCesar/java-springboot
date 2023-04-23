package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		// https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now(); 
		
		LocalDate d04 = LocalDate.parse("2023-03-10");
		LocalDateTime d05 = LocalDateTime.parse("2023-03-10T01:30:26");
		Instant d06 = Instant.parse("2023-03-10T01:30:26Z");
		Instant d07 = Instant.parse("2023-03-10T01:30:26-03:00"); // Horário de São Paulo 
		
		LocalDate d08 = LocalDate.parse("22/10/2023", fmt1);
		// Ou seja, o método parte do LocalDate e Instant tem um sobrecarga que aceita um segundo argumento que define como eu irei interpretar o texto
		
		LocalDateTime d09 = LocalDateTime.parse("22/10/2023 01:30", fmt2);
		LocalDateTime d10 = LocalDateTime.parse("22/10/2023 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		// Posso colocar o DateTimeFormatter dentro também (direto)!
		
		LocalDate d11 = LocalDate.of(2022, 7, 20);
		LocalDateTime d12 = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		System.out.println("d12 = " + d12);
		
		
	}

}
