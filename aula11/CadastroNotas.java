package aula11;

import javax.swing.JOptionPane;

public class CadastroNotas {
	public static void main(String args[]){
		try{
			Nota nota = new Nota("Maria", Float.parseFloat( 
					JOptionPane.showInputDialog("Digite a nota")));
		}catch(NotaInvalidaException e){
			System.err.println("Nota inválida = " + e.getMessage());
			e.printStackTrace();
		}
	}
}