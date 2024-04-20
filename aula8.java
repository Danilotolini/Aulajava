package aula8;

public class Pessoa {
String nome;  
int peso;   
double altura;  



} 
=========================================================================================================================================
package aula8;

public class aula8 {
	public static void main(String[] args) { 
		Pessoa pessoas[] = new Pessoa[2]; // declara que pessoas vai armazenar 2 elementos do tipo Pessoa
		pessoas[0] = new Pessoa(); // cria inst�ncia para ocorr�ncia 0
		pessoas[0].altura = 1.68;
		pessoas[0].peso = 55;
		pessoas[0].nome = "Juca";
		
		System.out.println("Nome: " + pessoas[0].nome 
				+ "Altura: " + pessoas[0].altura
				+ "Peso: " + + pessoas[0].peso);
		
		pessoas[1] = new Pessoa(); // cria inst�ncia para ocorr�ncia 1
		pessoas[1].altura = 1.77;
		pessoas[1].peso = 60;
		pessoas[0].nome = "Maria";
		
		System.out.println("Nome: " + pessoas[1].nome 
				+ "Altura: " + pessoas[1].altura
				+ "Peso: " + + pessoas[1].peso);
	} 
} 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
public class ExemploSimplesArrayBidimensional {
	public static void main(String args[]){
		
		int elementos[][] = {{0, 1, 1}, {3, 5, 8, 13}, {21, 34}};
		
		for(int i = 0; i < elementos.length; i++){
			for(int j = 0; j < elementos[i].length; j++){
				System.out.println(elementos[i][j]);
			}
		}
	}
} 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
package aula8;

public class ExemploArgumentosPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		for (int i = 0; i < args.length; i++) {
			System.out.println("Elemento: " + args[i]); 
			
			System.out.println("\nagora com foreach: "); 
			for(String s: args) 
				System.out.println(s);
		}
	}
} 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package aula8;

public class Cap8Lab02 {
	int soma = 0; 
	public static void main(String[] args) {  
		if (args.length > 0) {
			imprimirVetor(args);
			double media = somarVetor(args)/args.length;            
			System.out.println("\nA média das idades:");            
			System.out.println("é de : " + media + " anos.");            
		} 
		else {
			System.out.println("Entre com valores válidos para as idades");
		}
	}
	//método para impressão do vetor
	private static void imprimirVetor(String[] vetor) {
		for (String i : vetor) {
			System.out.print(i + " ");
		}
	}
	//método para somar valores do vetor
	private static double somarVetor(String[] vetor) {
		int soma=0;
		for (int i = 0; i < vetor.length; i++) {
			soma += Integer.parseInt(vetor[i]);
		}
		return soma;
	}
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
