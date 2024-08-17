package aula03.exercicios;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		int numero, divisor;
		numero = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite um número:"));
		divisor = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite o divisor:"));
		String resultado =
				numero%divisor==0 
				? "O número " + numero + " é multiplo de " + divisor
				: "O número " + numero + " não é multiplo de " + divisor;
		System.out.println(resultado);
	}
}
