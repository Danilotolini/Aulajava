package aula03.exercicios;

import javax.swing.JOptionPane;

public class VerificaParImpar {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		String resposta = 
				num%2==0 //teste
				? "O número " + num + " é par. "//resposta se teste verdadeiro 
				:"O número " + num + " é ímpar. ";//resposta se teste falso
		System.out.println(resposta);
	}

}
