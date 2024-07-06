package aula19;
import java.io.*;
import java.nio.file.*;

public class ExemploPath throws IOException {
public static void main(String[] args) {
	 FileOutputStream arquivo = new FileOutputStream
    Path poema = Paths.get("resources\\poema.txt");

    /* Exibe o caminho especificado pelo path. */
    System.out.println(poema);

    /* Exibe o caminho completo do path a partir da raiz. */
    System.out.println(poema.toAbsolutePath());

    /* Exibe apenas o nome do arquivo. */
    System.out.println(poema.getFileName());               

    /* Exibe o caminho completo do diretório pai. */
    System.out.println(poema.getParent().toAbsolutePath());
	}
}
