package aula04;

import javax.swing.JOptionPane;

public class ExemploIf {
	public static void main(String args[]){
		int x = Integer.parseInt(JOptionPane.showInputDialog(
		"Digite um n�mero: "));
		if(x < 15){
			System.out.println("x � menor que 15");
			System.out.println("O valor de x � " + x);
		}
	}
}