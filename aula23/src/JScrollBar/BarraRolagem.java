package JScrollBar;
import java.awt.*; 	
import javax.swing.*;		
import java.awt.event.*;
public  class BarraRolagem extends JFrame{	
	JScrollBar jsbHor = new JScrollBar (0,2,1,1,30);
	JScrollBar jsbVer = new JScrollBar (JScrollBar.VERTICAL,1,1,1,15);

	public static void main(String x[])	{	
		new BarraRolagem();
	}

	public BarraRolagem(){	
		setTitle("Usando Barras de Rolagem");
		setSize(400,300);
		Container c=getContentPane();
		c.setBackground(new Color(255,255,10));
		c.setLayout(new BorderLayout());
		c.add("South", jsbHor); // adiciona na parte inferior
		c.add("East", jsbVer); // adiciona na parte direita
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}