package aula09;

public class Triangulo extends Desenho {
	private double altura, base;
	
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public Triangulo(int base, int altura) {
		setBase(base);
		setAltura(altura);
	}

	public Triangulo() {
		// TODO Auto-generated constructor stub
	}

	public void imprimir(){
		System.out.println("Imprimindo Tri�ngulo");
	}

	public void calcularArea() {
		System.out.println("Calculando a �rea de um Tri�ngulo");
		double area = base*altura/2;	
		System.out.println("A �rea do Tri�ngulo de base " 
				+ base + " e altura " + altura  + " = " + area);	
	}
}
