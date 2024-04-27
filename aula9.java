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
package aula08.exercicios;
import javax.swing.JOptionPane;
public class MatrizQuadrada {	
	static int menorValor = Integer.MAX_VALUE, 
			maiorValor=Integer.MIN_VALUE, somaMatriz=0;
	static int maiorDP=Integer.MIN_VALUE, menorDS = Integer.MAX_VALUE;
	public static void main(String args[]){			
		int ordem = Integer.parseInt(
				JOptionPane.showInputDialog("Digite a ordem da matriz"));	
		int matriz[][] = new int[ordem][ordem];

		preencherMatriz(matriz);

		imprimirMatriz(matriz);

	}
	public static void imprimirMatriz(int[][] matriz) {
		//imprimindo a matriz
		for (int l = 0; l < matriz.length; l++) {//linhas
			for (int c = 0; c < matriz.length; c++) {//percorre as colunas
				System.out.print(matriz[l][c] + " ");
			}	
			System.out.println();
		}
	}
	public static void preencherMatriz(int[][] matriz) {
		//preenchendo a matriz
		for (int l = 0; l < matriz.length; l++) {//linhas
			for (int c = 0; c < matriz.length; c++) {//percorre as colunas
				matriz[l][c] = Integer.parseInt(JOptionPane.
						showInputDialog("Digite um número"));
				somaMatriz += matriz[l][c];
				if(menorValor > matriz[l][c])
					menorValor = matriz[l][c];
				if(maiorValor < matriz[l][c])
					maiorValor = matriz[l][c];
				if(c==l) {//Diagonal principal DP
					if(maiorDP < matriz[l][c])
						maiorDP = matriz[l][c];
				}
				if(c+l == matriz.length-1) {//Diagonal Secundária DS
					if(menorDS > matriz[l][c])
						menorDS = matriz[l][c];
				}
			}			
		}
	}
} 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
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
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
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
