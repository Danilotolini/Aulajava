package aula13;

import javax.swing.JOptionPane;
public class megasena { 
	public static void main(String[] args) {
		try {
			int vetor[];
			do {
				int qtd=0;
				do {
				 qtd = Integer.parseInt(JOptionPane.showInputDialog
						("Digite a quantidade de números:"));
				 if(qtd<6 || qtd>15) {
					 JOptionPane.showMessageDialog(null, "Digite apenas números entre 6 e 15");
				 }
				}while(qtd<6 || qtd>15);
				vetor = new int[qtd];
				preencherVetor(vetor);		
				ordenarVetor(vetor); 
				imprimirVetor(vetor);
				System.out.println();
			}while(JOptionPane.showConfirmDialog(null, 
					"Fazer outro jogo?")==0);
		}catch (NumberFormatException e) {
			System.out.println("Digite somente números inteiros.");
		}
	}	
	private static void preencherVetor(int[] vetor) {
		//preenchendo o vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = gerarNumeroNaoRepetido(vetor); 
		}
	}
	//imprimindo o vetor
	private static void imprimirVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
	//gerando números não repetidos
	private static int gerarNumeroNaoRepetido(int[] vetor) {
		int num = 0,  i=0;
		for (i = 0; i < vetor.length; i++) {
			num = (int)(Math.random() * (60-1)) + 1;
			for (int j = i; j < vetor.length; j++) {
				if(vetor[j]==num) {
					num=0;
					i-=1;
					break;
				}								
			}
			if(num!=0)				
				return num;
		}	
		return num;
	}		
	private static void ordenarVetor(int[] vetor) {
		int ordenado[] = vetor;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < ordenado.length; j++) {
				if(vetor[j]>vetor[i]) {
					int trocar = vetor[j];
					vetor[j]=vetor[i];
					vetor[i]=trocar;
				}
			}			
		}
	}
}