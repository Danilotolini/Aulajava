package aula12.exercicios;

import javax.swing.JOptionPane;
/**
 * 
 * @author Marcos Monteiro
 * 
 * Usando a clase Math para c�lculos
 *
 */

public class UsaMath {
	public static void main(String[] args) {
		double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base"));
		double potencia = Double.parseDouble(JOptionPane.showInputDialog("Digite a pot�ncia"));
		
		System.out.println(base + " elevado a " + potencia 
				+ " = " + Math.pow(base, potencia));
		System.out.println("A raiz quadrada de 49 = " + 
				Math.sqrt(49));
	}

}
