package math;

import javax.swing.JOptionPane;
/** 
 * 
 * @author Danilo
 * Este metodo é de calculo de potencia informado pelo usuario 
 */
public class Usamath {
	public static void main(String[] args) {
		double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base"));
		double potencia = Double.parseDouble(JOptionPane.showInputDialog("Digite a potência"));
		
		System.out.println(base + " elevado a " + potencia 
				+ " = " + Math.pow(base, potencia));
		System.out.println("A raiz quadrada de 49 = " + 
				Math.sqrt(49));
	}

}
