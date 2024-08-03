package Jpanel;
import java.awt.*;
import javax.swing.*;
public class TesteJPanel extends JFrame{
	JButton b1, b2;
	JPanel p1, p2;
	public TesteJPanel(){
		setTitle("Teste JPanel");
		setSize(300,300);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(255,255,255));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);	
		
		p1 = criarPainel(10, 10, 210, 100, Color.BLUE);
		p2 = criarPainel(10,110,210,100, Color.YELLOW);

		b1 = criarButton("Gravar");
		b2 = criarButton("Sair");

		p1.add(b1);
		p2.add(b2);
		getContentPane().add(p1);
		getContentPane().add(p2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private JButton criarButton(String texto) {
		JButton b1 = new JButton(texto); 
		b1.setBounds(30, 30, 150, 45);   
		b1.setFont(new Font("Arial", Font.BOLD, 24));
		return b1;
	}

	private JPanel criarPainel(int distEsq, int distTopo, 
			int largPainel, int altPainel, Color corFundo) {
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(distEsq, distTopo, largPainel, altPainel);
		p1.setBackground(corFundo);
		add(p1);
		return p1;
	}

	public static void main(String [] args){
		new TesteJPanel();
	}
}
