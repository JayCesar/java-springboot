package application;

import java.io.File;
import java.util.Scanner;

public class Informacoes_do_caminho_do_arquivo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		// Acessando somente o nome
		System.out.println("getName: " + path.getName());
		
		// Acessando somente o caminho
		System.out.println("getName: " + path.getParent());
		
		// Acessando TODO o caminho
		System.out.println("getName: " + path.getPath());
		
		sc.close();

	}
}
