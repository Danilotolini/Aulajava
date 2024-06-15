package aula16;

import javax.swing.JOptionPane;

public class alunos extends alunoprivate{    
	public static void main(String[] args) {
	int qtd; 
    qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos a cadastrar"));
	alunos alunos[] = new alunos[qtd]; 
	for (int i = 0; i < qtd; i++) {
	alunos novo = new alunos();	
	novo.setNome(JOptionPane.showInputDialog("Digite a nome"));
	novo.setNota(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota")));
	alunos[i] = novo;
	} 
	for (int i = 0;i < alunos.length; i++) { 
		System.out.println(alunos[i]);
	}
}
}