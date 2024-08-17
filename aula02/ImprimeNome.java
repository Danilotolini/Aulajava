package aula02;

import javax.swing.JOptionPane;
public class ImprimeNome {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog
				("Digite o ano de seu nascimento:"));
		JOptionPane.showMessageDialog(null, "Nome Digitado:\n" + nome);
	}
}