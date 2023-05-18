package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_e_BufferedWriter {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Godd afternoon", "Good night"};
		
		String path = "D:\\workspace\\ws-eclipse\\java-springboot\\TrabalhandoComArquivos\\files\\out.txt";
		// Esse é o caminho onde eu irei cirar o arquivo
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
