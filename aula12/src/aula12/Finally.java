package aula12;

import java.io.File; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.io.InputStream;
public class Finally {  
	public static void main (String[] args) { 
		abrirArquivo();
	}
public static void abrirArquivo() throws IOException { 
	File file = null; 
	InputStream is = null; 
	try { 
		file = new File("arquivo.txt"); 
		is = new FileInputStream(file);  
	}
			System.out.println("O arquivo não foi encontrado.");
		}
}
	finally{ 
		is.close();
	}
}
}
