package aula08.exercicios;
import javax.swing.JOptionPane;
public class MatrizQuadrada1 {	
	static int menorValor = Integer.MAX_VALUE, 
			maiorValor=Integer.MIN_VALUE, somaMatriz=0;
	static int maiorDP=Integer.MIN_VALUE, menorDS = Integer.MAX_VALUE;
	public static void main(String args[]){			
		int ordem = Integer.parseInt(
				JOptionPane.showInputDialog("Digite a ordem da matriz"));	
		int matriz[][] = new int[ordem][ordem];

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
				if(c+l == ordem-1) {//Diagonal Secundária DS
					if(menorDS > matriz[l][c])
						menorDS = matriz[l][c];
				}
			}			
		}

		//imprimindo a matriz
		for (int l = 0; l < matriz.length; l++) {//linhas
			for (int c = 0; c < matriz.length; c++) {//percorre as colunas
				System.out.print(matriz[l][c] + " ");
			}	
			System.out.println();
		}
		System.out.println("A soma da matriz = " + somaMatriz);
		System.out.println("O maior valor da matriz = " + maiorValor);
		System.out.println("O menor valor da matriz = " + menorValor);		
		System.out.println("O maior valor da DP = " + maiorDP);		
		System.out.println("O menor valor da DS = " + menorDS);
		
	}
}