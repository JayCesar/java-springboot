package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_e_BufferedReader {

	public static void main(String[] args) {
		String path = "D:\\workspace\\ws-eclipse\\java-springboot\\TrabalhandoComArquivos\\files\\file.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path); 
			br = new BufferedReader(fr); 
			// Ele é instanciado a partir do FileReader -> Deixa mais rápido a leitura
			// br = new BufferedReader(new FileReader(path)); É outra maneira
			
			String line = br.readLine(); // le uma linha e se o file tive no final, ele terona null
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
				
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
