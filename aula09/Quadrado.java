package aula09;

public class Quadrado extends Desenho {
	private double lado;
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public Quadrado(int lado) {
		setLado(lado);
	}

	public Quadrado() {
		// TODO Auto-generated constructor stub
	}

	public void imprimir(){
		System.out.println("Imprimindo Quadrado");
	}

	public void calcularArea() {
		System.out.println("Calculando a área de um Quadrado");
		double area = lado*lado;	
		System.out.println("A área do quadrado de lado " 
				+ lado + " = " + area);		
	}
}
