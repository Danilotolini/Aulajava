package Exemplos.InterfaceGrafica.exercicio;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import ActionListener.TesteEventoAcao;
public class FormularioLogin extends JFrame 
implements ActionListener{
	JButton btnOk, btnCancelar;
	JTextField campoUsuario;
	JPasswordField campoSenha;
	public FormularioLogin(){
		setTitle("Login do Usuário");
		setSize(320,120);
		GridLayout gl = new GridLayout(3,2,1,1);
		getContentPane().setLayout(gl);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		JLabel labelUsuario = criarRotulo(" Usuário: ");
		campoUsuario = new JTextField();
		getContentPane().add(campoUsuario);

		JLabel labelSenha = criarRotulo(" Senha: ");
		campoSenha = new JPasswordField();
		getContentPane().add(campoSenha);

		btnOk = criarBotao("Ok");
		btnCancelar = criarBotao("Cancelar");
		setVisible(true);
	}

	public JButton criarBotao(String texto) {
		JButton botao = new JButton(texto);
		botao.addActionListener(this);
		add(botao);		
		return botao;
	}

	public JLabel criarRotulo(String texto) {
		JLabel rotulo = new JLabel(texto);
		rotulo.setFont(new Font("Times new Roman", Font.BOLD, 18));
		rotulo.setForeground(Color.blue);
		add(rotulo);
		return rotulo;
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource() == btnOk){
			String usu = campoUsuario.getText();
			String senha = String.valueOf(campoSenha.getPassword());
			if (usu.equalsIgnoreCase("Marcos") && senha.equals("2024")){
				JOptionPane.showMessageDialog(null, usu.toUpperCase() 
						+ ", você foi logado ao Sistema.");
				this.setVisible(false);
				TesteEventoAcao te = new TesteEventoAcao();				
				//				System.exit(0); 
			}
			else{
				JOptionPane.showMessageDialog(null, 
						"Usuário ou senha inválidos.\nTente novamente"); } }
		if (e.getSource() == btnCancelar){
			System.exit(0); 
		}		
	}
	public static void main(String[] args) {
		new FormularioLogin();
	}
}
