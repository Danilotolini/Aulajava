package interfaceGrafica.exercicios;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class CadastroDadosBasicos extends JFrame implements ActionListener,
ItemListener, ListSelectionListener{
	JLabel lbNome, lbRg, lbCpf, lbDia, lbMes, lbAno;
	JTextField txtNome, txtRg, txtCpf, txtDia, txtMes, txtAno;
	JComboBox cbDia, cbMes, cbAno;
	JButton btEnviar, btCancelar;
	
	public CadastroDadosBasicos() {
		setTitle("Dados Basicos");
		setSize(800,600); 	
//		getContentPane().setBackground(new Color(190,190,190)); 
		getContentPane().setLayout(new GridLayout(7,2)); 
		
		lbNome = criarRotulo("Nome");
		txtNome = criarCaixaTexto(500);
		
		lbDia = criarRotulo("Dia");
		String[] dia = preencherValores(31); 
		cbDia = preencherCombo(dia);
		
		lbMes = criarRotulo("Mês");
		String[] mes = preencherValores(12); 
		cbDia = preencherCombo(mes);
		
		lbAno = criarRotulo("Ano");
		String[] anos = preencherValoresAno(2024); 
		cbDia = preencherCombo(anos);
		
		lbRg = criarRotulo("RG");
		txtRg = criarCaixaTexto(500);
		
		lbCpf = criarRotulo("CPF");
		txtCpf = criarCaixaTexto(500);
		
		btEnviar = criarBotao("Enviar"); 
		btCancelar = criarBotao("Cancelar"); 
		
		
		

	setLocationRelativeTo(null);
	setVisible(true);
	}
	private String[] preencherAno() {
		// TODO Auto-generated method stub
		return null;
	}
	private String[] preencherMes() {
		// TODO Auto-generated method stub
		return null;
	}
	private JComboBox preencherCombo(String[] dado) {
		JComboBox combo = new JComboBox(dado); 
		combo.setFont(new Font("Arial", Font.BOLD, 24));		
		combo.addItemListener(this); 
		add(combo);
		return combo;
	}
	private String[] preencherValores(int qtd) {
		String valor[] = new String[qtd];
		for(int i=0; i<qtd; i++) {
			valor[i] = ""+ (i+1);
		}		
		return valor;
	}
	private String[] preencherValoresAno(int qtd) {
		String valor[] = new String[qtd];
		for(int i=0; i<qtd-1900; i++) {
			valor[i] = ""+ (i+1900);
		}		
		return valor;
	}
	private JTextField criarCaixaTexto(int qtdCaracteres) {
		JTextField texto = new JTextField();
		texto.setSize(qtdCaracteres, 40);
		texto.setHorizontalAlignment(SwingConstants.CENTER);
		texto.setFont(new Font("Arial", Font.BOLD, 24));
		add(texto);
		return texto;
	}
	private JButton criarBotao(String texto) {
		JButton botao = new JButton(texto);
		botao.addActionListener(this);
		botao.setFont(new Font("Arial", Font.BOLD, 24));	
		add(botao);
		return botao;
	}
	public JLabel criarRotulo(String texto) {
		JLabel rotulo = new JLabel(texto);
//		rotulo.setHorizontalAlignment(SwingConstants.CENTER);
		rotulo.setForeground(Color.blue);
		rotulo.setFont(new Font("Arial", Font.BOLD, 24));	
		add(rotulo);
		return rotulo;
	}
	
	
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		new CadastroDadosBasicos();
	}
}