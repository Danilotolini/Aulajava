package aula06;
import javax.swing.JOptionPane;
public class InverteString {
	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog(
				"Digite o texto");
		System.out.println("Texto Original: " + texto);
		System.out.println("Texto Invertido: " + 
				StringUtils.inverterString(texto));
	}
}
