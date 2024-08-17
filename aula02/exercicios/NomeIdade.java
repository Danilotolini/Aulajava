package aula02.exercicios;

import javax.swing.JOptionPane;

public class NomeIdade {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog
				("Digite o ano de seu nascimento:"));
		int idade = 2023-anoNascimento;
		JOptionPane.showMessageDialog(null, "Nome Digitado:\n" + nome + 
				"\n\nIdade: " + idade);	
		}
}