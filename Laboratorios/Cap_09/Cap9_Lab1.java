package Laboratorios.Cap_09;

import javax.swing.JOptionPane;

public class Cap9_Lab1 {
	public static void main(String args[]){
		
		String nome = JOptionPane.showInputDialog("Digite o nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		String sexo = JOptionPane.showInputDialog("Digite:\nF - feminino ou \nM - Masculino:");
		int rg = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do RG"));
		String data = JOptionPane.showInputDialog("Digite a data de Nascimento");
		float mensalidade = Float.parseFloat(JOptionPane.showInputDialog("Digite a mensalidade"));
		String curso = JOptionPane.showInputDialog("Digite o curso");
		
		Pessoa manuel = new Aluno(nome, idade, sexo.charAt(0), rg, data, mensalidade,curso);

		nome = JOptionPane.showInputDialog("Digite o nome");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		sexo = JOptionPane.showInputDialog("Digite:\nF - feminino ou \nM - Masculino:");
		rg = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do RG"));
		data = JOptionPane.showInputDialog("Digite a data de Nascimento");
		float salario = Float.parseFloat(JOptionPane.showInputDialog("Digite a mensalidade"));
		String disciplina = JOptionPane.showInputDialog("Digite a disciplina");
		
		Pessoa rafael = new Professor(nome, idade, sexo.charAt(0), rg, data, salario, disciplina);
		
		rafael.falar("Manuel?");
		manuel.falar("Presente");
		
		rafael.mostrarDados();
		manuel.mostrarDados();
	}
}
