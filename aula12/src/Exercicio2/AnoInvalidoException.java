package Exercicio2;
import javax.swing.JOptionPane;

public class AnoInvalidoException extends Exception {
	public AnoInvalidoException(String mensagem) {
//		super(mensagem);
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
