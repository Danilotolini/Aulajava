package aula08.exercicios;

public class Pares2a20{
	public static void main(String[] args) {
		int vetor [] = new int[10];

		//preenche o vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (i+1)*2;
		}
		Vetor.imprimirVetor(vetor);
	}

}
