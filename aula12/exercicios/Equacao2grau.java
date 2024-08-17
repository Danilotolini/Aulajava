package aula12.exercicios;

import javax.swing.JOptionPane;
/**
 * 
 * @author Marcos Monteiro
 * 
 * Calculando as raízes de uma equação do segundo grau.
 *
 */

public class Equacao2grau {
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C"));
		
		int delta = calcularDelta(a, b, c);
		
		int x1 = (-b + delta)/2*a; 
		int x2 = (-b - delta)/2*a; 
		
		System.out.println("Raízes:\nx1 = " + x1 + "\nx2 = " + x2 );
	}

	private static int calcularDelta(int a, int b, int c) {
		int num =0; 
		int delta = 0;
		num = (b*b) - (4 * a * c);
		try {
		delta = (int) Math.sqrt(num);
		}
		catch (Exception e) {
			System.out.println("Raiz negativa");
			System.exit(-1);
		}
		return delta;
	}

}
