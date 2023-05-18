package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main (String[] args) {
		File file = new File("D:\\workspace\\ws-eclipse\\java-springboot\\files_class\\file.txt"); // Precisa de 2 barras!
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		
		}
	}
	
}
