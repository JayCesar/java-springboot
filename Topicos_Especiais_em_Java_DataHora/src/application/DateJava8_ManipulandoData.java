package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DateJava8_ManipulandoData {

	public static void main(String[] args) {
		
		// Somando uma unidade de tempo
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4); // Ou seja, eu pego a data D e adiciono 4 horas do dia!
		d = cal.getTime();
		/*
		  1) Eu crio o calendário;
		  2) Adiciono a data nesse calendário;
		  3) Faço a operação que preciso
		  4) Devolvo para avariável 
		*/
		System.out.println(sdf.format(d));	
		
		// Obtendo uma unidade de tempo, ex: quantos minutos?
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println("Minutes: " + minutes);
		int month = 1 + cal.get(Calendar.MONTH);
		System.out.println("Minutes: " + month);
		// Para o calendar o mês começa com o 0, ou seja, janeiro é mês zero, por isso eu tenho que adicioanr o +1
		
		
	}

}
