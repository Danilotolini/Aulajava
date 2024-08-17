package Projeto.Cap15.fase03.impacta.prateleiradigital.apresentacao;

import java.util.*;

import javax.swing.JOptionPane;

import Projeto.Cap15.fase03.impacta.prateleiradigital.controle.FilmeController;
import Projeto.Cap15.fase03.impacta.prateleiradigital.negocio.Filme;

public class SortearConsole {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*** SORTEAR UM FILME ***");
		System.out.println("G�nero:");
		String genero = scan.nextLine();
		System.out.println("Diretor:");
		String diretor = scan.nextLine();
		System.out.println("Nota acima de:");
		double notaMin = Double.parseDouble(scan.nextLine());
		System.out.println("N�mero de votos acima de:");
		int votosMin = Integer.parseInt(scan.nextLine());

		FilmeController controller = new FilmeController();
		Filme filmeSorteado = null;
		try {
			filmeSorteado = controller.sortear(genero, diretor,notaMin,votosMin);
			System.out.println("...");
			if(filmeSorteado != null) {
				System.out.printf("Filme %s foi sorteado!",filmeSorteado.getTitulo());
			}else {
				System.out.printf("Filme j� foi sorteado com sucesso!");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage(),"Erro ocorrido",JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
