package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosComDataHora {
	public static void main(String[] args) {
		// Datahora são imutáveis, ou seja, eu tenho que criar outro objeto alterado!
		
		LocalDate d04 = LocalDate.parse("2023-03-10");
		LocalDateTime d05 = LocalDateTime.parse("2023-03-10T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		LocalDate nextYearsLocalDate = d04.plusYears(7);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		System.out.println("nextYearsLocalDate = " + nextYearsLocalDate);
		
		System.out.println();
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		
		System.out.println();
		
		Instant pastWeekLocalInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekLocalInstant = d06.plus(7, ChronoUnit.DAYS);
		// Eu preciso passar a unidade para poder fazer alguma conta com datas do tipo global;
		
		System.out.println("pastWeekLocalInstant = " + pastWeekLocalInstant);
		System.out.println("nextWeekLocalInstant = " + nextWeekLocalInstant);
		
		System.out.println();
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		
		/*
		Para calcular a duração entre dois objetos do tipo LocalDate, eu preciso primeiro converter eles para 
        LocalDateTime, pois ai sim eu terei acesso às horas, permitindo-me fazer algum cálculo de duração:
		 
		 Ou seja, isso:
		   Jeito 'limpo':
		   Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		 
		   Ou gambiarra:
		   Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));
		*/
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekLocalInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekLocalInstant);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
	
		
		
	}
}
