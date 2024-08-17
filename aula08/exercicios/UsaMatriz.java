package aula08.exercicios;

import javax.swing.JOptionPane;

public class UsaMatriz {
		public static void main(String args[]){		
			int ordem = Integer.parseInt(
			  JOptionPane.showInputDialog("Digite a ordem da matriz"));	
			int matriz[][] = new int[ordem][ordem];	
			
			MatrizQuadrada.preencherMatriz(matriz);
			MatrizQuadrada.imprimirMatriz(matriz);
			System.out.println("A soma da matriz = " + MatrizQuadrada.somaMatriz);
			System.out.println("O maior valor da matriz = " + MatrizQuadrada.maiorValor);
			System.out.println("O menor valor da matriz = " + MatrizQuadrada.menorValor);		
			System.out.println("O maior valor da DP = " + MatrizQuadrada.maiorDP);		
			System.out.println("O menor valor da DS = " + MatrizQuadrada.menorDS);
			
		}
}
