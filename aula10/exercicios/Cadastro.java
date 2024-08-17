package aula10.exercicios;
import javax.swing.JOptionPane;
public class Cadastro {
	public static void main(String[] args) {
		int qtd = Integer.parseInt(
			JOptionPane.showInputDialog("Digite a quantidade a cadastrar:"));
		
		Pessoa p[] = new Pessoa[qtd];
		
		for (int i = 0; i < qtd; i++) {
			String valores[] = {"Aluno","Professor"};
			Object escolha = JOptionPane.showInputDialog(null, 
				"Qual Pessoa deseja Cadastrar?",
			   "Cadastro de Pessoa", 
			   JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);
			if(escolha.equals("Aluno")) {
				p[i] = new Aluno(
					Integer.parseInt(JOptionPane.showInputDialog(
								"Digite o RA do Aluno")),
					JOptionPane.showInputDialog(
							"Digite o nome do Aluno"));
			}
			else if(escolha.equals("Professor")) {
				p[i] = new Professor(
						Integer.parseInt(JOptionPane.showInputDialog(
									"Digite o RGF do Professor")),
						JOptionPane.showInputDialog(
								"Digite o nome do Professor"));
				}
		}
		
		for (int i = 0; i < qtd; i++) {
			System.out.println(p[i]);
		}		
	}
}
