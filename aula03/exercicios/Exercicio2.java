package aula03.exercicios;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		int numero, divisor;
		numero = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite um n�mero:"));
		divisor = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite o divisor:"));
		String resultado =
				numero%divisor==0 
				? "O n�mero " + numero + " � multiplo de " + divisor
				: "O n�mero " + numero + " n�o � multiplo de " + divisor;
		System.out.println(resultado);
	}
}
