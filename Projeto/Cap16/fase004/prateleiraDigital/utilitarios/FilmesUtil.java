package Projeto.Cap16.fase004.prateleiraDigital.utilitarios;


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Projeto.Cap16.fase004.prateleiraDigital.negocio.Filme;
public class FilmesUtil {

	public static List<Filme> extrairFilmesFromFile(String fileName) throws Exception {

		List<Filme> filmes = new ArrayList<>();
		Scanner scan = new Scanner(Paths.get(fileName));

		scan.nextLine(); // despreza primeira linha
		while (scan.hasNext()) {
			try {
				Filme filme = gerarFilme(scan.nextLine());
				filmes.add(filme);
			}catch(Exception e) {
				continue; //ignora os filmes do arquivo que possuem dados inv�lidos
			}
		}
		
		return filmes;
	}

	private static Filme gerarFilme(String nextLine) {
		String[] colunas = nextLine.split(";");
		Filme filme = new Filme(colunas[0], colunas[1], 
				Double.parseDouble(colunas[2]), getAsInt(colunas[3]),
				getAsInt(colunas[4]), colunas[5], 
				Integer.parseInt((colunas[6])), colunas[7]);
		return filme;
	}

	private static int getAsInt(String sValor) {
		if (sValor == null || sValor.trim().isEmpty()) {
			return -1;
		}
		return Integer.parseInt(sValor);
	}

	private static double getAsDouble(String sValor) {
		if (sValor == null || sValor.trim().isEmpty()) {
			return -1;
		}
		return Double.parseDouble(sValor);
	}
}

/*

private static Filme roleta(List<Filme> filmes, double notaMin) {
	Filme filme = null;
	Collections.shuffle(filmes);

	filme = filmes.stream().filter(x -> x.getNota() >= notaMin).filter(x -> x.getNumVotos() >= 1000).findFirst()
			.get();
	return filme;
}
*/