package Laboratorios.Cap_08;
public class Cap8_Lab1 {
	public static int maiorNumero(int array[]){
		int maior = Integer.MIN_VALUE;
		for(int i = 0; i < array.length; i++){
			if(array[i] > maior)
				maior = array[i];
		}
		return maior;
	}	
	public static void main(String args[]){
		int numeros[] = {3,2,11,4,6,9};
		int maior = maiorNumero(numeros);
		System.out.println("O maior n�mero do array � " 
				+ maior);
	}
}