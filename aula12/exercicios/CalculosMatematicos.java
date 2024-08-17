package aula12.exercicios;
import java.awt.JobAttributes;

import javax.swing.JOptionPane;
public class CalculosMatematicos {
	public static void main(String[] args) {
		int escolha = Integer.parseInt(JOptionPane
			.showInputDialog("Digite: \n1 - Potência \n2 - Fibonacci"));
		if(escolha==1)
			calcularPotencia();
		else if(escolha==2)
			geraFibonacci();
		else
			System.out.println("Escolha inválida");
	}

	private static void calcularPotencia() {
		boolean resp=true;
		do {
			try {			

				int num = Integer.parseInt(JOptionPane.
						showInputDialog("Digite o número"));
				int exp = Integer.parseInt(JOptionPane.
						showInputDialog("Digite o expoente"));
				JOptionPane.showMessageDialog(null, num + " elevado  " + exp 
						+ " = " + Math.pow(num, exp));
				resp = false;

			}catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Digite SOMENTE números");
			}		
		}while(resp);
	}

	private static void geraFibonacci() {
		int qtd = Integer.parseInt(JOptionPane
			.showInputDialog("Digite a quantidade de números a gerar:"));
		int vetor[] = new int[qtd];
		vetor[0] = 1;
		vetor[1] = 1;
		int prox=0;
		for (int i = 2; i < vetor.length; i++) {
			prox = vetor[i-1] + vetor[i-2];
			vetor[i] = prox;
		}
		imprimeVetor(vetor);
	}

	private static void imprimeVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
	
	
}