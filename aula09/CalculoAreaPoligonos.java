package aula09;
import javax.swing.JOptionPane;
public class CalculoAreaPoligonos {
	public static void main(String args[]){
		Quadrado quadrado = new Quadrado(
				Integer.parseInt(JOptionPane.showInputDialog(
						"Digite o lado do Quadrado: ")));
		Triangulo triangulo = new Triangulo(
				Integer.parseInt(JOptionPane.showInputDialog(
						"Digite a base do Tri�ngulo: ")), 
				Integer.parseInt(JOptionPane.showInputDialog(
						"Digite a altura do Tri�ngulo: "))
				);
		quadrado.calcularArea();
		triangulo.calcularArea();
	}
}