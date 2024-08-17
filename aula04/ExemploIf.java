package aula04;

import javax.swing.JOptionPane;

public class ExemploIf {
	public static void main(String args[]){
		int x = Integer.parseInt(JOptionPane.showInputDialog(
		"Digite um número: "));
		if(x < 15){
			System.out.println("x é menor que 15");
			System.out.println("O valor de x é " + x);
		}
	}
}