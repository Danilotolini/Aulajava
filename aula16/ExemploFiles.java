package aula16;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class ExemploFiles {
    public static void main(String[] args) {
        try {
            Path arquivo = Paths.get("resource\\poemas.txt");
            Path novaPasta = Paths.get("resources\\textos\\rascunhos\\vazio");
            Path pasta = Paths.get("G:\\MeusDocumentos\\Mp3");
            
            if (!Files.exists(novaPasta)) {
                System.out.println("O item nao existe.");
            } else if (Files.isDirectory(novaPasta)) {
                System.out.println("O item � um diret�rio.");
            } else if (Files.isRegularFile(arquivo)) {
                System.out.println("O item � um arquivo.");
            }

            /* Exibe  */
            System.out.println(Files.size(arquivo));

            /* Cria o diret�rio rascunhos. */
            Files.createDirectories(novaPasta);

            /* Exibe o conte�do do diret�rio Mp3 */
            Files.list(pasta).forEach(f -> System.out.println(f.getFileName()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

