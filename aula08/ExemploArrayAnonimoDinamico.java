package aula08;

public class ExemploArrayAnonimoDinamico {
	void receberMatriz(int minhaMatriz[]){
		// utiliza o array como par�metro
	}
	
	public static void main(String args[]){
		ExemploArrayAnonimoDinamico c = new ExemploArrayAnonimoDinamico();
		c.receberMatriz(new int[]{7, 7, 8, 2, 5}); // precisamos de um argumento de array
	}
}
