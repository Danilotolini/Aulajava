package aula11;

import javax.swing.JOptionPane;

public class Executor {
	public static void main(String[] args) { 
		int qtd = Integer.parseInt(
				JOptionPane.showInputDialog("Digite a quantidade a cadastrar:"));
			Professor professor[] = new Professor[qtd];
			Aluno aluno[] = new Aluno[qtd];
			
			do {
				String valores[] = {"Aluno","Professor"};
				Object escolha = JOptionPane.showInputDialog(null, 
					"Qual Pessoa deseja Cadastrar?",
				   "Cadastro de Pessoa", 
				   JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);
			for (int i = 0; i < 1; i++) {
				if(escolha.equals("Aluno")) {
					Aluno novo = new Aluno(
						Integer.parseInt(JOptionPane.showInputDialog(
									"Digite o RA do Aluno")),
						JOptionPane.showInputDialog(
								"Digite o nome do Aluno"));
					aluno[i] = novo;
				}
			}
			for (int i = 0; i < 1; i++) {
				if(escolha.equals("Professor")) {
					Professor novo = new Professor(
							Integer.parseInt(JOptionPane.showInputDialog(
										"Digite o RGF do Professor")),
							JOptionPane.showInputDialog(
									"Digite o nome do Professor"));
						professor[i] = novo;
					}
			}	
			}while(JOptionPane.showConfirmDialog(null, "Cadastrar outro")==0);
			for (int i = 0; i < qtd; i++) {
				System.out.println(aluno[i]);
			}
			for (int i = 0; i < qtd; i++) {
				System.out.println(professor[i]);
			}
	}
}
