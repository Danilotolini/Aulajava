package aula03.exercicios;

import javax.swing.JOptionPane;

public class VerificaParImpar {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		String resposta = 
				num%2==0 //teste
				? "O n�mero " + num + " � par. "//resposta se teste verdadeiro 
				:"O n�mero " + num + " � �mpar. ";//resposta se teste falso
		System.out.println(resposta);
	}

}
