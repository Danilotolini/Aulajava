package exercicio6_JFrame;
import java.awt.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;  
public class ExFlowLayout extends JFrame
{
	private JButton botao1, botao2, botao3, botao4,
	botao5;

	private Container c; //cria��o do objeto tipo Container

	public ExFlowLayout()//cria��o do m�todo construtor da classe
	{
		super("Exemplo  de Layout de Fluxo");
		Container c = getContentPane();
		//definindo o layot como de Fluxo
		c.setLayout( new FlowLayout()); 
		botao1 = criarBotao("Bot�o 1", '1'); 
		botao2 = criarBotao("Bot�o 2", '2');
		botao3 = criarBotao("Bot�o 3", '3');
		botao4 = criarBotao("Bot�o 4", '4');
		botao5 = criarBotao("Bot�o 5", '5');

		//cria��o dos bot�es
		c.add(botao1);
		c.add(botao2);
		c.add(botao3);
		c.add(botao4);
		c.add(botao5);
		//cria��o dos bot�es
		c.add(botao1);
		c.add(botao2);
		c.add(botao3);
		c.add(botao4);
		c.add(botao5);
		setSize(350, 120);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);   
	}
	public static void main( String args[] )
	{
		new ExFlowLayout();      
	}
	public static JButton criarBotao(String texto, char c) 
	{
		JButton botao = new JButton(texto);
		botao.setBackground(new Color(0,0,170));
		botao.setForeground(Color.YELLOW);
		botao.setFont(new Font("Helvetica", Font.BOLD, 14));
		botao.setToolTipText("Botao de comando");
		botao.setHorizontalAlignment(SwingConstants.CENTER);
		botao.setVerticalAlignment(SwingConstants.CENTER);
		botao.setMnemonic(c); 
		return botao;
	}
}
