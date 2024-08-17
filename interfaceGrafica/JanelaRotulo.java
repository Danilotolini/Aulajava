package interfaceGrafica;
import java.awt.*;
import javax.swing.*;
public class JanelaRotulo extends JFrame{
	JLabel nome, endereco, telefone;
	JTextField txtNome, txtEndereco, txtFone;
	public JanelaRotulo(){
		setTitle("Primeira Janela Swing");
		Dimension screen = //obtém a resolução vídeo
				Toolkit.getDefaultToolkit().getScreenSize();
		
		setSize((int)(screen.getWidth()*(0.8)), 
				(int)(screen.getHeight()*(0.8)));
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(218,247,250));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int linha = 10;
		nome = criarRotulo("Nome:", linha);
		txtNome = criarTexto(linha);
		
		linha+=30;
		endereco = criarRotulo("Endereço:", linha);
		
		linha+=30;
		telefone = criarRotulo("Telefone:", linha);
		centralizar();
		setVisible(true);
	}
	private JTextField criarTexto(int linha) {
		JTextField txt = new JTextField();
		txt.setLocation(200, linha);//esq, topo
		txt.setSize(450, 30);
		txt.setForeground(Color.red);
		txt.setFont(new Font("Courier new", Font.BOLD, 18));
		add(txt);
		return txt;
	}
	public static void main(String [] args){
		new JanelaRotulo();	 
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
		rotulo.setSize(200, 30);
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