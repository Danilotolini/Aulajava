package aula05;

import javax.swing.JOptionPane;

public class Tabuada {
	public static void main(String[] args) {
		int num = Integer.parseInt(
			JOptionPane.showInputDialog(
					"Digite um número"));
		for(int i=0; i<11 ; i++)
			System.out.println(num + " X " + i + 
				" = " + (num*i));
	}
}