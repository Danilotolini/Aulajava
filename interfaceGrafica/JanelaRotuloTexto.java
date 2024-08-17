package interfaceGrafica;
import java.awt.*;
import javax.swing.*;
public class JanelaRotuloTexto extends JFrame{
	JLabel nome, endereco, telefone;
	JTextField txtNome, txtEndereco, txtFone;
	JButton btGravar, btSair, btCancelar;
	
	public JanelaRotuloTexto(){
		setTitle("Primeira Janela Swing");
		Dimension screen = //obtém a resolução vídeo
				Toolkit.getDefaultToolkit().getScreenSize();
		
		setSize((int)(screen.getWidth()*(0.85)), 
				(int)(screen.getHeight()*(0.85)));
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(255,255,191));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int linha = 10;
		nome = criarRotulo("Nome:", linha);
		txtNome = criarTexto(linha);
		
		linha+=30;
		endereco = criarRotulo("Endereço:", linha);
		txtEndereco = criarTexto(linha);
		
		linha+=30;
		telefone = criarRotulo("Telefone:", linha);
		txtFone = criarTexto(linha);
		
		linha+=150;
		//botoes
		btGravar = criarBotao("Gravar", linha, 'G', 50);
		btSair = criarBotao("Sair", linha, 'S', 160);
		btCancelar = criarBotao("Cancelar", linha, 'C', 280);


		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	private JButton criarBotao(String texto, int linha, char c , int de) {
		JButton botao = new JButton();
		botao.setText(texto);
		botao.setBounds(de, linha, 120, 30); //D Esq, D Topo, larg, alt
		botao.setBackground(new Color(0,0,170));
		botao.setForeground(Color.YELLOW);
		botao.setFont(new Font("Helvetica", Font.BOLD, 18));
//		botao.setToolTipText("Botao botao");
//		botao.setHorizontalAlignment(SwingConstants.CENTER);
//		botao.setVerticalAlignment(SwingConstants.CENTER);
//		botao.setEnabled(false); //Botão desabilitado.
		botao.setMnemonic(c);  //Tecla de atalho
		getContentPane().add(botao);
		return botao;
	}
	private JTextField criarTexto(int linha) {
		JTextField txt = new JTextField();
		txt.setLocation(200, linha);//esq, topo
		txt.setSize((int)(getWidth()*(0.65)), 30);
		txt.setForeground(Color.red);
		txt.setFont(new Font("Courier new", Font.BOLD, 18));
		add(txt);
		return txt;
	}
	public static void main(String [] args){
		new JanelaRotuloTexto();	 
	}
	
	public void centralizar(){		
		Dimension screen = //obtém a resolução vídeo
				Toolkit.getDefaultToolkit().getScreenSize();
		Dimension janela = getSize();//obtém a altura e largura da minha janela
		if (janela.height > screen.height)
			setSize(janela.width, screen.height);
		if (janela.width > screen.width)
			setSize(screen.width, janela.height);
		setLocation((screen.width - janela.width)/2, 
				(screen.height - janela.height)/2);
	}
	public JLabel criarRotulo(String txt, int linha){
		JLabel rotulo = new JLabel();
		rotulo.setText(txt);
		rotulo.setLocation(10, linha);//esq, topo
		rotulo.setSize((int)(getWidth()*(0.15)), 30);
		//Torna opaco o fundo do rótulo
//		rotulo.setOpaque(true);
		rotulo.setBackground(new Color(255,255,255));
		rotulo.setForeground(Color.BLUE);
		rotulo.setFont(new Font("Courier new", Font.BOLD, 20));
		rotulo.setToolTipText("rotuloabel Exemplo");
		rotulo.setHorizontalAlignment(SwingConstants.LEFT);
		rotulo.setVerticalAlignment(SwingConstants.TOP);
		add(rotulo);
		return rotulo;
	}
	 
} 