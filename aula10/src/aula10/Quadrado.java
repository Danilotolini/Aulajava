package aula10;

import javax.swing.JOptionPane;

public class Quadrado extends Desenho { 
	private double lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado do quadrado")); 
	
	public double getlado() {
		return lado;
	}

	public void setlado(double lado) {
		this.lado = lado;
	}

	public Quadrado(int lado) { 
		setlado(lado);
		// TODO Auto-generated constructor stub
	}

	public Quadrado() {
		// TODO Auto-generated constructor stub
	}

	public void imprimir(){
		System.out.println("Imprimindo Quadrado");
	}

	public void calcularArea() { 
		System.out.println("Calculando a área de um quadrado"); 
		double area = lado*lado; 
		System.out.println("A área do quadrado de lado " + lado + " = " + area);
		// TODO Auto-generated method stub
		
	}
}
