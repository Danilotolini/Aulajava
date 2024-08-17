package Projeto.Cap16.fase4.prateleiraDigital.apresentacao;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.impacta.prateleiradigital.controle.FilmeController;
import br.com.impacta.prateleiradigital.negocio.Filme;

public class SortearConsole {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*** SORTEAR UM FILME ***");
		System.out.println("Gênero:");
		String genero = scan.nextLine();
		System.out.println("Diretor:");
		String diretor = scan.nextLine();
		System.out.println("Nota acima de:");
		double notaMin = Double.parseDouble(scan.nextLine());
		System.out.println("Número de votos acima de:");
		int votosMin = Integer.parseInt(scan.nextLine());

		FilmeController controller = new FilmeController();
		Filme filmeSorteado = null;
		try {
			filmeSorteado = controller.sortear(genero, diretor,notaMin,votosMin);
			System.out.println("...");
			if(filmeSorteado != null) {
				System.out.printf("Filme %s foi sorteado!",filmeSorteado.getTitulo());
			}else {
				System.out.printf("Filme já foi sorteado com sucesso!");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage(),"Erro ocorrido",JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
