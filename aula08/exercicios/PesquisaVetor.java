package aula08.exercicios;

import javax.swing.JOptionPane;

public class PesquisaVetor {
	public static void main(String[] args) {
		int qtd = Integer.parseInt(
				JOptionPane.showInputDialog("Digite o tamanho do vetor"));
		int vetor [] = new int[qtd];		
		Vetor.preencherVetor(vetor);
		Vetor.imprimirVetor(vetor);

		do {
			int pesquisado = Integer.parseInt(
					JOptionPane.showInputDialog("Digite o n�mero a pesquisar"));

			int indice = -1;
			for (int i = 0; i < vetor.length; i++) {
				if(pesquisado == vetor[i])
					indice = i;
			}

			if(indice == -1)
				System.out.println("\n\nO n�mero " + pesquisado 
						+ " n�o foi encontrado no vetor!");
			else
				System.out.println("\n\nO n�mero " + pesquisado 
						+ " foi encontrado no �ndice: " + indice);
		}while(JOptionPane.showConfirmDialog(null, "Pesquisar outro?") == 0);
	}	
}