package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class ProgramExercicioResolvido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		// String path = "D:\\workspace\\ws-eclipse\\java-springboot\\Generics_Set_Map\\input.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Set<LogEntry> set = new HashSet<>(); // O HashSet é o mais rápido e nesse problema não importa a ordem!
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(" ");
				String username = fields[0]; // UserName
				Date moment = Date.from(Instant.parse(fields[1]));
				set.add(new LogEntry(username, moment)); 
				// Se eu tentar adicionar um nome repetido, essa inserão será barrada pela própria estrutura de dados SET;
				line = br.readLine();
			}
			System.out.println("Total user: " + set.size());
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
		
	}

}
