package Laboratorios.Cap_16;
import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class PgmBackup {
	private static final String PASTA_ORIGEM = 
			"C:\\Users\\sabado\\Documents\\documentos";
	
	private static final String PASTA_BACKUP = 
			"C:\\Users\\sabado\\Downloads\\backup";

	public static void main(String[] args) {
//		Path origem = Paths.get(PASTA_ORIGEM);
		Path origem = Paths.get("G:\\musicas\\AnaVitoria");
		Path backup = Paths.get(PASTA_BACKUP);
		try {
			if (Files.exists(backup)) {
				System.out.println("Diretório " + backup.getFileName() 
				+ " já existe.");
			} else {
				Files.createDirectories(backup);
				System.out.println("Diretório " + backup.getFileName() 
				+ " criado com sucesso.");
			}

			Stream<Path> streamOrigem = Files.list(origem);

			streamOrigem.forEach(p -> {
				try {
					System.out.println("Copiando arquivo " + p.getFileName());
					Files.copy(p, backup.resolve(p.getFileName()));
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}