package Laboratorios.Cap_11.extras;

import javax.swing.JOptionPane;

public class AnoInvalidoException extends Exception {
	public AnoInvalidoException(String mensagem) {
//		super(mensagem);
		JOptionPane.showMessageDialog(null, mensagem);
	}
}