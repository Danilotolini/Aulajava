package aula13;
import javax.swing.JOptionPane;
public class GerarJogos {
	public static void main(String[] args) {
		int qtdJogos = Integer.parseInt(JOptionPane.showInputDialog
				("Digite a quantidade de jogos a realizar: "));
		for(int i=0; i<qtdJogos ; i++) {
			int qtdNumeros = Integer.parseInt(JOptionPane.showInputDialog
					("Digite a quantidade de n�meros para o " + (i+1) + "� jogo: "));
			System.out.println("Jogo " +(i+1) +  ":");			
			for(int n=0; n<qtdNumeros ; n++) {
				System.out.print(MegasenaUtilitario.sortearNumero() + " ");
			}		
			System.out.println();
		}
	}
}
