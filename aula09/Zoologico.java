package aula09;

public class Zoologico {
	public static void main(String args[]){
		Animal a = new Animal(); // a est� se referenciando � um objeto da classe base Animal
		a.comer(); // aqui ser� executado o m�todo comer da classe base Animal
		
		Zebra z = new Zebra();
		z.comer(); // aqui ser� executado o m�todo comer da classe derivada Zebra
		
		Leao l = new Leao(); // a passar a referenciar o objeto da classe derivada Leao
		l.comer(); // aqui ser� executado o m�todo comer da classe derivada Leao
	}
}