package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BlocoFinally {
	public static void main(String[] args) {
		File file = new File("D:\\workspace\\ws-eclipse\\course-java-POO\\Section_15_Tratamento_de_excecoes\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} 
		catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} 
		finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed");
		}
	}
}