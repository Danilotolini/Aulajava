package aula11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
public class ExemploFinally {
	public static void main(String[] args) {
		abrirArquvo();
	}
	private static void abrirArquvo() {
		File file = null;
		InputStream is = null;
		try {
			file = new File("arquivo.txt");
			is = new FileInputStream(file);
		}
		catch (NullPointerException | FileNotFoundException e) {
			System.out.println("O arquivo não foi encontrado.");
		}
//		finally {
//			is.close();
//		}		
	}
}