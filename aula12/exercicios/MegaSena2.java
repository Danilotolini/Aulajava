package aula12.exercicios;
import javax.swing.JOptionPane;
public class MegaSena2 {
	public static void main(String[] args) {
		try {
			int vetor[];
			do {
				int qtd = Integer.parseInt(JOptionPane.showInputDialog
						("Digite a quantidade de números:"));
				vetor = new int[qtd];
				//preenchendo o vetor
				for (int i = 0; i < vetor.length; i++) {
					vetor[i] = (int) (Math.random() * (60-1)) + 1; 
				}
				for (int i = 0; i < vetor.length; i++) {
					System.out.print(vetor[i] + " ");
				}
				System.out.println();
			}while(JOptionPane.showConfirmDialog(null, 
					"Fazer outro jogo?")==0);
		}catch (NumberFormatException e) {
			System.out.println("Digite somente números inteiros.");
		}
	}
}