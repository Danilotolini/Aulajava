package Projeto.Cap15.fase03.impacta.prateleiradigital.apresentacao;

import java.util.*;

import javax.swing.JOptionPane;

import Projeto.Cap15.fase03.impacta.prateleiradigital.controle.FilmeController;
import Projeto.Cap15.fase03.impacta.prateleiradigital.negocio.Filme;

public class ConsultarFilmeConsole {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*** CONSULTA DE FILME ***");
		System.out.println("Titulo (total ou parcial) :");
		String titulo = scan.nextLine();
		System.out.println("Gênero:");
		String genero = scan.nextLine();
		System.out.println("Ano (de:) :");
		int anoDe = Integer.parseInt(scan.nextLine());
		System.out.println("Ano (até:) :");
		int anoAte = Integer.parseInt(scan.nextLine());

		FilmeController controller = new FilmeController();
		try {
			List<Filme> filmes = controller.consultarFilme(titulo, genero, anoDe, anoAte);
			System.out.println("...");
			System.out.println("Filme consultado com sucesso!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage(),"Erro ocorrido",JOptionPane.ERROR_MESSAGE);
		}
	}
}
