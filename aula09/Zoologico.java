package aula09;

public class Zoologico {
	public static void main(String args[]){
		Animal a = new Animal(); // a está se referenciando à um objeto da classe base Animal
		a.comer(); // aqui será executado o método comer da classe base Animal
		
		Zebra z = new Zebra();
		z.comer(); // aqui será executado o método comer da classe derivada Zebra
		
		Leao l = new Leao(); // a passar a referenciar o objeto da classe derivada Leao
		l.comer(); // aqui será executado o método comer da classe derivada Leao
	}
}