package aula04;
public class ExemploBreak {
	public static void main(String args[]){
	int i=1;
		for( ; i < 11; ++i){
			if(i==5)//condição de parada
				break; // interrompe o loop
			System.out.println("Valor de i = " + i);
		}
		System.out.println("Próximo linha após o loop...");
		System.out.println("Valor de i = " + i);
	}
}
