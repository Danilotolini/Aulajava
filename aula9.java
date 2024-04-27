package aula9;

import javax.swing.JOptionPane;

public class MastrizQuadrada1 {  
	static int menorValor = 0, maiorValor=0, somaMatriz=0;
	public static void main(String args[]){	
	int ordem = Integer.parseInt(
				JOptionPane.showInputDialog("Digite a ordem da matriz"));	
		int matriz[][] = new int[ordem][ordem];

		//preenchendo a matriz
		for (int l = 0; l < matriz.length; l++) {//linhas
			for (int c = 0; c < matriz.length; c++) {//percorre as colunas
				matriz[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
			}			
		}

		//imprimindo a matriz
		for (int l = 0; l < matriz.length; l++) {//linhas
			for (int c = 0; c < matriz.length; c++) {//percorre as colunas
				System.out.print(matriz[l][c] + " ");
			}	
			System.out.println();
		}
	}
} 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
