package aula15;

import javax.swing.JOptionPane;

public class UsaVetor {
	public static void main(String[] args) {
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor"));
		
		int vetor[] = new int[tamanho];
		
		for(int i=0 ; i<vetor.length ; i++) {
			vetor[i] = (int) (Math.random() * 100);
			System.out.print(vetor[i] + " ");
		}
		int num = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite o numero a ser pesquisado"));
		boolean b = false;
		for(int i=0 ; i<vetor.length ; i++) {
			if(num==vetor[i]) {
				System.out.println("\nEncontrado no índice: " + i);
				b=true;
				break;
			}
		}
		if(b==false)
			System.out.println("\nNúmero não Encontrado no vetor!");
	}
}