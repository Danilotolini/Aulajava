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
						showInputDialog("Digite um n�mero"));
				somaMatriz += matriz[l][c];
				if(menorValor > matriz[l][c])
					menorValor = matriz[l][c];
				if(maiorValor < matriz[l][c])
					maiorValor = matriz[l][c];
				if(c==l) {//Diagonal principal DP
					if(maiorDP < matriz[l][c])
						maiorDP = matriz[l][c];
				}
				if(c+l == matriz.length-1) {//Diagonal Secund�ria DS
					if(menorDS > matriz[l][c])
						menorDS = matriz[l][c];
				}
			}			
		}
	}
}