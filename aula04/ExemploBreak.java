package aula04;
public class ExemploBreak {
	public static void main(String args[]){
	int i=1;
		for( ; i < 11; ++i){
			if(i==5)//condi��o de parada
				break; // interrompe o loop
			System.out.println("Valor de i = " + i);
		}
		System.out.println("Pr�ximo linha ap�s o loop...");
		System.out.println("Valor de i = " + i);
	}
}
