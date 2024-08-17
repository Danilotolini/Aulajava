package aula08.exercicios;

import javax.swing.JOptionPane;

public class SomaVetores{
	public static void main(String[] args) {
		int qtd = Integer.parseInt(
				  JOptionPane.showInputDialog("Digite o tamanho do vetor"));
		int vetorA [] = new int[qtd];
		int vetorC [] = new int[qtd];
		int vetorB [] = new int[qtd];
		
		Vetor.preencherVetor(vetorA);
		Vetor.preencherVetor(vetorB);

		preencherVetorC(vetorA ,  vetorB, vetorC);
						
		Vetor.imprimirVetor(vetorC);
	}

	public static void preencherVetorC(int[] vetorA, int[] vetorB, int[] vetorC) {
		for (int i = 0; i < vetorB.length; i++) {
			vetorC[i] = ((vetorA[i]) + (vetorB[i]));			
		}		
	}
}
