package Exercicio1_JPanel;
import java.awt.*; 
import javax.swing.*;
public class ExercicioPaineis extends JFrame{
	JButton b1, b2, b3, b4;
	JPanel p1, p2;
	public ExercicioPaineis(){
		setTitle("Teste JPanel");
		setSize(400,300);
		getContentPane().setLayout(new GridLayout(2,1,5,5));
		getContentPane().setBackground(new Color(185,195,244));
		
		b1 = criarBotao("Gravar", 'G');
		b2 = criarBotao("Sair", 'S');		
		b3 = criarBotao("Cancelar", 'C');
		b4 = criarBotao("Alterar", 'A');

		p1 = criarPainel(Color.BLUE, b1, 2);
		p1.add(b4);
		p2 = criarPainel(Color.YELLOW, b2, 2);
		p2.add(b3);		
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);		
		
	}	
	private JButton criarBotao(String texto, char atalho) {
		JButton botao = new JButton(texto);
		botao.setFont(new Font("Arial", Font.BOLD, 24));
		botao.setMnemonic(atalho);		
		return botao;
	}
	private JPanel criarPainel(Color corFundo, JButton botao, 
			int linhas) {
		JPanel painel = new JPanel();
		painel.setLayout(new GridLayout(linhas,1,10,10));
		painel.setBackground(corFundo);
		painel.add(botao);
		painel.setSize(linhas, linhas);
		add(painel);
		return painel;
	}
	public static void main(String [] args){
	 new ExercicioPaineis();
  }
}

