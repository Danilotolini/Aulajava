package Laboratorios.Cap_06.Cap6_Lab1;
public class Calculadora {
	public int somar(int valor1, int valor2){		
		return valor1 + valor2;
	}	
	public int subtrair(int valor1, int valor2){
		return valor1 - valor2;
	}
	
	public int multiplicar(int valor1, int valor2){
		return valor1 * valor2;
	}
	public long multiplicar(int ... valor1){
		long res =1;
		for(int i=0 ; i<valor1.length ; i++)
			res *= valor1[i];
		return res;
	}
	
	public int dividir(int valor1, int valor2){
		return valor1 / valor2;
	}
}
