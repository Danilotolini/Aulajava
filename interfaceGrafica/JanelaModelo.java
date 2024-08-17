package interfaceGrafica;
import java.awt.*;
import javax.swing.*;
public class JanelaModelo extends JFrame{
	JLabel nome, endereco, telefone;
	JTextField txtNome, txtEndereco, txtFone;
	public JanelaModelo(){
		setTitle("Primeira Janela Swing");
		Dimension screen = //obt�m a resolu��o v�deo
				Toolkit.getDefaultToolkit().getScreenSize();
		
		setSize((int)(screen.getWidth()*(0.8)), 
				(int)(screen.getHeight()*(0.8)));
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(218,247,250));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int linha = 10;
		nome = criarRotulo("Nome:", linha);
		add(nome);
		txtNome = criarTexto(linha);
		add(txtNome);
		
		linha+=30;
		endereco = criarRotulo("Endere�o:", linha);
		add(endereco);
		txtEndereco = criarTexto(linha);
		add(txtEndereco);
		
		linha+=30;
		telefone = criarRotulo("Telefone:", linha);
		add(telefone);
		txtFone = criarTexto(linha);
		add(txtFone);
		centralizar();
		setVisible(true);
	}
	public static JTextField criarTexto(int linha) {
		JTextField txt = new JTextField();
		txt.setLocation(200, linha);//esq, topo
		txt.setSize(450, 30);
		txt.setForeground(Color.red);
		txt.setFont(new Font("Courier new", Font.BOLD, 18));
		
		return txt;
	}
	public static void main(String [] args){
		new JanelaModelo();	 
	}
	
	public void centralizar(){		
		Dimension screen = //obt�m a resolu��o v�deo
				Toolkit.getDefaultToolkit().getScreenSize();
		Dimension janela = getSize();//obt�m a altura e largura da minha janela
		if (janela.height > screen.height)
			setSize(janela.width, screen.height);
		if (janela.width > screen.width)
			setSize(screen.width, janela.height);
		setLocation((screen.width - janela.width)/2, 
				(screen.height - janela.height)/2);
	}
	public static JLabel criarRotulo(String txt, int linha){
		JLabel rotulo = new JLabel();
		rotulo.setText(txt);
		rotulo.setLocation(10, linha);//esq, topo
		rotulo.setSize(200, 30);
		//Torna opaco o fundo do r�tulo
//		rotulo.setOpaque(true);
		rotulo.setBackground(new Color(255,255,255));
		rotulo.setForeground(Color.BLUE);
		rotulo.setFont(new Font("Courier new", Font.BOLD, 20));
		rotulo.setToolTipText("rotuloabel Exemplo");
		rotulo.setHorizontalAlignment(SwingConstants.LEFT);
		rotulo.setVerticalAlignment(SwingConstants.TOP);
		return rotulo;
	}
	 
} 