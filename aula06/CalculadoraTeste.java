package aula06;
import javax.swing.JOptionPane;
public class CalculadoraTeste {	
	public double dividirNumero(double numerador, double denominador) {		
		try {
			while(denominador == 0) {
				System.out.println("O denominador n�o pode ser zero! \nDigite novamente");
				dividirNumero(numerador, Double.parseDouble
						(JOptionPane.showInputDialog("Digite o denominador")));
			}	
		}
		catch (NumberFormatException e) {
			System.out.println("Digite Somente n�meros! \nDigite novamente");
			dividirNumero(
					Double.parseDouble(JOptionPane.showInputDialog("Digite o numerador")), 
					Double.parseDouble(JOptionPane.showInputDialog("Digite o denominador")));
		}
		return (numerador/denominador);
	}
	public double somarNumero() {
		double num1 = 0, num2 = 0, res=0;
		
		try {
				num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1� n�mero")); 
				num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2� n�mero"));
				return (num1+num2);
		}
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite Somente n�meros! \nDigite novamente");
			somarNumero();
		}
		return res;
	}
	public double subtrairNumero() {
		double num1 = 0, num2 = 0;
		try {
				num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1� n�mero")); 
				num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2� n�mero"));				
		}
		catch (NumberFormatException e) {
			System.out.println("Digite Somente n�meros! \nDigite novamente");
			somarNumero();
		}
		return (num1-num2);
	}
	public double multiplicarNumero() {
		double num1 = 0, num2 = 0;
		try {
				num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1� n�mero")); 
				num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2� n�mero"));				
		}
		catch (NumberFormatException e) {
			System.out.println("Digite Somente n�meros! \nDigite novamente");
			somarNumero();
		}
		return (num1*num2);
	}
}
