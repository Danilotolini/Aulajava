package exercicio2;
import javax.swing.JOptionPane;

public class nome {
public static void main(String[] args) {
	String nome = JOptionPane.showInputDialog("Digite seu nome "); 
	System.out.println("O nome: " + nome + " tem " + nome.length() + " caracteres");
}
}
