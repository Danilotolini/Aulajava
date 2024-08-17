package Laboratorios.Cap_11.extras;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class CadastraPessoa {

	public static void main(String[] args) 
			throws AnoInvalidoException {
		Pessoa pessoa = new Pessoa(
			JOptionPane.showInputDialog("Digite o nome"), 
			Integer.parseInt(JOptionPane.showInputDialog
					("Digite o ano de nascimento")));
		System.out.println(pessoa);		
	}
}