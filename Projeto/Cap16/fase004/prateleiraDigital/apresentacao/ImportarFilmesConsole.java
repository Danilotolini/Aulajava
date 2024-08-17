package Projeto.Cap16.fase004.prateleiraDigital.apresentacao;

import java.util.Scanner;

import javax.swing.JOptionPane;

import Projeto.Cap16.fase004.prateleiraDigital.controle.FilmeController;
public class ImportarFilmesConsole {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("*** IMPORTAR FILMES ***");
		System.out.println("Digite o nome do arquivo :");
/*
 * G:\\impacta2024\\impacta2024\\aulas2024_01\\src\\Projeto\\Cap16\\fase004\\prateleiraDigital\\filmes-imdb.csv
 */
		
		String pathFile = scan.nextLine();
		
		FilmeController controller = new FilmeController();
		try {
			controller.importarFilmes(pathFile);
			System.out.println("...");
			System.out.println("Filmes importados com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,e.getMessage(),
					"Erro ocorrido",JOptionPane.ERROR_MESSAGE);
		}
	}
}