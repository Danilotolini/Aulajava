package aula04;
public class InstrucoesRotuladas2 {
	public static void main(String args[]){
		instrucao1:
		for(int i = 1; i < 4; i++){
			instrucao2:
			for(int j = 1; j < 4; j++){
				if(j==2){
					System.out.println("Saindo da instru��o 1");
					break ;//sem declarar o r�tulo de parada
				}
				System.out.println("Instru��o 2");
			}			
			System.out.println("Instru��o 1");
		}
	}
}