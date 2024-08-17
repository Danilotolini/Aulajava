package aula03.exercicios;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		int valor1, valor2 , resultado;
		valor1 = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite o valor 1:"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite o valor 2:"));
		resultado = valor1+valor2;
		System.out.println(valor1 + " + " + valor2 + " = " + resultado);
	}
}
