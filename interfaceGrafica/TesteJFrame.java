package interfaceGrafica;
import java.awt.*;
import javax.swing.*;
public class TesteJFrame extends JFrame{
	public TesteJFrame(){
		setTitle("Primeira Janela Swing");
		Dimension screen = //obtém a resolução vídeo
				Toolkit.getDefaultToolkit().getScreenSize();
		int percentual = 50;
		setSize((int)(screen.getWidth()*(percentual/100)), 
				(int)(screen.getHeight()*(percentual/100)));
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(218,247,250));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		centralizar();
		setVisible(true);
	}
	public static void main(String [] args){
		new TesteJFrame();	 
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
} 