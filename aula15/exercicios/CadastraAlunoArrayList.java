package aula15.exercicios;

import java.util.*;

import javax.swing.JOptionPane;

public class CadastraAlunoArrayList {
	public static void main(String[] args) {
		List alunos = new ArrayList<Aluno>();
			
		do {
			Aluno novo = new Aluno();
			novo.setNome(JOptionPane.showInputDialog(
				"Digite o nome do aluno:"));
			novo.setNota(Double.parseDouble(JOptionPane.showInputDialog(
				"Digite nota:")));
			alunos.add(novo);
		}while(JOptionPane.showConfirmDialog(null, "Cadastrar Outro?") == 0);
		alunos.forEach(a -> System.out.println(a));
		
		if(JOptionPane.showConfirmDialog(
				null, "Exluir um Aluno?") == 0){
			String nome = JOptionPane.showInputDialog(
					"Digite o nome a excluir:"); 				
		}
		alunos.forEach(a -> System.out.println(a));
		
	}
}
