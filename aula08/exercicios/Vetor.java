package aula08.exercicios;

import javax.swing.JOptionPane;

public class Vetor{
	public static void main(String[] args) {
		int tamanho = Integer.parseInt(
				JOptionPane.showInputDialog("Digite o tamanho do vetor:"));
		int vetor [] = new int[tamanho];

		preencherVetor(vetor);
		imprimirVetor(vetor);
	}

	public static void imprimirVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}		
	}

	public static void preencherVetor(int[] vetor) {
		//preenche o vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(
					JOptionPane.showInputDialog(
							"Digite o " + (i+1)+ "º número"));
		}
	}
}
