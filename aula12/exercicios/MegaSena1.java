package aula12.exercicios;
import javax.swing.JOptionPane;
public class MegaSena1 {
	public static void main(String[] args) {
		try {
			int vetor[];
			do {
				int qtd = Integer.parseInt(JOptionPane.showInputDialog
						("Digite a quantidade de números:"));
			}while(JOptionPane.showConfirmDialog(null, 
					"Fazer outro jogo?")==0);
		}catch (NumberFormatException e) {
			System.out.println("Digite somente números inteiros.");
		}
	}
}