package aula20;

public class UsaString {

	public static void main(String[] args) {
		String nomeCompleto = "Marcos de Arruda Monteiro";
		
		//imprimindo do 1 ao 6 caracter
		for(int i=0; i<6; i++){
			System.out.print(nomeCompleto.charAt(i));
		}
		System.out.println("\n");
		String[] nome = nomeCompleto.split(" ");
		
		for (int i = 0; i < nome.length; i++) {
			System.out.println(nome[i]);
		}
		System.out.println("\n");
		
		//nome invertido
		for (int i = nomeCompleto.length()-1; i > -1; i--) {
			System.out.print(nomeCompleto.charAt(i));
		}
	}
}