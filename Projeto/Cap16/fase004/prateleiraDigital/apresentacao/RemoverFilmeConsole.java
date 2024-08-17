package Projeto.Cap16.fase004.prateleiraDigital.apresentacao;

import java.util.Scanner;

import javax.swing.JOptionPane;
import Projeto.Cap16.fase004.prateleiraDigital.controle.FilmeController;
import Projeto.Cap16.fase004.prateleiraDigital.negocio.Filme;

public class RemoverFilmeConsole {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*** REMO��O DE FILME ***");
		System.out.println("Titulo :");
		String titulo = scan.nextLine();
		
		Filme filme = new Filme();
		filme.setTitulo(titulo);

		FilmeController controller = new FilmeController();
		try {
			controller.remover(filme);
			System.out.println("...");
			System.out.printf("Filme %s removido com sucesso!",titulo);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage(),"Erro ocorrido",JOptionPane.ERROR_MESSAGE);
		}
	}
}