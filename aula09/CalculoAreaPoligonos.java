package aula09;
import javax.swing.JOptionPane;
public class CalculoAreaPoligonos {
	public static void main(String args[]){
		Quadrado quadrado = new Quadrado(
				Integer.parseInt(JOptionPane.showInputDialog(
						"Digite o lado do Quadrado: ")));
		Triangulo triangulo = new Triangulo(
				Integer.parseInt(JOptionPane.showInputDialog(
						"Digite a base do Triângulo: ")), 
				Integer.parseInt(JOptionPane.showInputDialog(
						"Digite a altura do Triângulo: "))
				);
		quadrado.calcularArea();
		triangulo.calcularArea();
	}
}