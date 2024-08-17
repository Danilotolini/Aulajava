package Projeto.Cap15.fase03.impacta.prateleiradigital.apresentacao;

import java.util.*;

import javax.swing.JOptionPane;

import Projeto.Cap15.fase03.impacta.prateleiradigital.controle.FilmeController;

public class ImportarFilmesConsole {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*** IMPORTAR FILMES ***");
		System.out.println("Digite o nome do arquivo :");
		String pathFile = scan.nextLine();
		
		FilmeController controller = new FilmeController();
		try {
			controller.importarFilmes(pathFile);
			System.out.println("...");
			System.out.println("Filmes importados com sucesso!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage(),"Erro ocorrido",JOptionPane.ERROR_MESSAGE);
		}
	}
}
