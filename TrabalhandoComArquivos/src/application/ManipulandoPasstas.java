package application;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPasstas {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		// File pode indicar o caminho de um arquivo, quanto o caminho de uma pasta;
		
		File[] folders = path.listFiles(File::isDirectory);
		// Posso colocar am função como argumento de outra função
		// Aqui eu estou filtrando somente files que são diretórios! (path.listFiles(File::isDirectory);)
		
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
				
		// Agora listano arquivos
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for(File file : files) {
			System.out.println(file);
		}
		
		// Criando subpasta a partir da pastinha
		boolean success = new File(strPath + "\\subdir").mkdir(); // Cria uma pasta 'subdir' a partir da pasta no link 'strPath'
		System.out.println("Directory created successfully: " + success);
				
		sc.close();
	}
}
