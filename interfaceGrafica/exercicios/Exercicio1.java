package interfaceGrafica.exercicios;

import java.awt.*;
import javax.swing.*;

import interfaceGrafica.JanelaModelo;
public class Exercicio1 extends JFrame  {
	public Exercicio1() {
		JLabel nome, endereco, telefone;
		JTextField txtNome, txtEndereco, txtFone;
		int largura, altura;
		largura = Integer.parseInt(JOptionPane
				.showInputDialog("Digite a largura da tela:"));
		altura = Integer.parseInt(JOptionPane
				.showInputDialog("Digite a altura da tela:"));
		setTitle("Primeira Janela Swing"); //Titulo da janela
		setSize(largura , altura); //tamanho da janela
		getContentPane().setLayout(null); // anula o layout padrao
		//cor de fundo da janela no padrão RGB (Red Green Blue)
		int red = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para o vermelho:"));
		int green = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para o verde:"));
		int blue = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para o azul:"));
		getContentPane().setBackground(new Color(red , green , blue));//217. 183, 216 - rosa
		//provoca o termino da execução (encerra o programa)
		int linha = 10;
		nome = JanelaModelo.criarRotulo("Nome", linha);
		add(nome);
		txtNome = JanelaModelo.criarTexto(linha);
		add(txtNome);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);//centraliza a tela
	}
	public static void main(String [] args){
		new Exercicio1();  
	}	
} 
