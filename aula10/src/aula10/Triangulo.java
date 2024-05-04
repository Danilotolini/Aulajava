package aula10;

import javax.swing.JOptionPane;

public class Triangulo extends Desenho { 
	private double base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do Triangulo")); 
	private double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do Triangulo")); 
	
	public double getbase() {
		return base;
	}

	public void setbase(double base) {
		this.base = base;
	}

	public double getaltura() {
		return altura;
	}

	public void setaltura(double altura) {
		this.altura = altura;
	}

	public Triangulo(int base, int altura) {  
		setbase(base); 
		setaltura(altura);
		// TODO Auto-generated constructor stub
	}

	public Triangulo() {
		// TODO Auto-generated constructor stub
	}

	public void imprimir(){	
		System.out.println("Imprimindo Tri�ngulo");
	}

	public void calcularArea() { 
		System.out.println("Calculando a �rea de um tri�ngulo");  
		double area = base * altura / 2; 
		System.out.println("A �rea do triangulo � " + " altura: " + altura + " base: " + base + " = " + area);
		// TODO Auto-generated method stub
	}
	}