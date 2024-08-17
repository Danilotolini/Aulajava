package Laboratorios.Cap_07;
public class Cap7_Lab1 {
	public static void main(String args[]){
		Cadastro c1 = new Cadastro();
		Cadastro c2 = new Cadastro("Claudio", "Abreu");
		Cadastro c3 = new Cadastro("Claudio", "Abreu", 40);		
		c1.mostrar();
		c2.mostrar();
		c3.mostrar();
	}
}
