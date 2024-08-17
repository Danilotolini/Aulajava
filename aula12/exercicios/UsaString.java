package aula12.exercicios;
import javax.swing.JOptionPane;
public class UsaString {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o Nome");
		
		System.out.println("Nome digitado: " + nome);
		System.out.println("Total de caracteres do Nome: " + nome.length());
		System.out.println("Nome em Maiúsculo: " + nome.toUpperCase());
		System.out.println("Nome em Minúsculo: " + nome.toLowerCase());
		imprimirVertical(nome);
		System.out.println("Nome invertido: " + inverteNome(nome));
		StringBuffer invertido = new StringBuffer(nome);
		
		System.out.println("Nome invertido com StringBuffer: " + invertido.reverse());
	}

	private static String inverteNome(String nome) {
		String nomeInvertido = "";
		for(int i=5 ; i>-1; i--)
			nomeInvertido += nome.charAt(i);
		return nomeInvertido;
	}

	private static void imprimirVertical(String nome) {
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}		
	}
}


/*
 * 
 */
