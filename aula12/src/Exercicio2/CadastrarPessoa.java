package Exercicio2;

public class CadastrarPessoa {
	public static void main(String[] args) 
			throws AnoInvalidoException {
		Pessoa pessoa = new Pessoa(
			JOptionPane.showInputDialog("Digite o nome"), 
			Integer.parseInt(JOptionPane.showInputDialog
					("Digite o ano de nascimento")));
		System.out.println(pessoa);		
	}
}
