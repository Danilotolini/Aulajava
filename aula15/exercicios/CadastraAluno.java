package aula15.exercicios;

import javax.swing.JOptionPane;

public class CadastraAluno {
	public static void main(String[] args) {
		int qtd;
		qtd = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite a quantidade de alunos:"));
		Aluno alunos[] = new Aluno[qtd];
		
		for (int i = 0; i < alunos.length; i++) {
			Aluno novo = new Aluno();
			novo.setNome(JOptionPane.showInputDialog(
				"Digite o nome do aluno:"));
			novo.setNota(Double.parseDouble(JOptionPane.showInputDialog(
				"Digite nota:")));
			alunos[i] = novo;
		}
		for (int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[i]);
		}
	}
}
