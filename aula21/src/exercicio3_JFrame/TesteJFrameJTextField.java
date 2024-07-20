package exercicio3_JFrame;
import java.awt.*;
import javax.swing.*;
public class TesteJFrameJTextField extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TesteJFrameJTextField(){		
		setTitle("Janela com Rótulo e Caixa de Texto");//Titulo da janela		
		setSize(600,300);//tamanho da janela
		Container c = getContentPane();		
		c.setLayout(null);// anula o layout padrao		
		//cor de fundo da janela no padrão RGB (Red Green Blue)
		c.setBackground(new Color(240,248,148));
		//provoca o termino da execução (encerra o programa)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int linha = 30; 
		int alt=10;
		JLabel rotulo = criarJLabel("Nome: ", 
			10, alt, 100, linha);
		JTextField jt = criarCaixaTexto("Digite o nome aqui", 
			120, alt, 200 , linha);
		JButton b1 = criarBotao("Gravar", 
			150, 150, 100, linha);
		JButton b2 = criarBotao("Sair", 
			250, 150, 100, linha);
		b2.setForeground(Color.RED);
		alt+=40;
		JLabel rotulo2 = criarJLabel("Endereço: ", 
			10, alt, 100, linha);
		JTextField end = criarCaixaTexto("Digite o endereço aqui", 
			120, alt, 300 , linha); 
		alt+=40;
		JLabel rotulo3 = criarJLabel("Telefone: ", 10, alt, 100, linha); 
		JTextField tlf = criarCaixaTexto("Digite o telefone aqui", 120, alt, 300, linha);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	private JButton criarBotao(String texto, 
	int distEsq, int distTopo, int largura, int linha) {
		JButton b1 = new JButton();
		b1.setText(texto);
		//50 posição x, 30 posição y, 100 largura, 30 altura
		b1.setBounds(distEsq, distTopo, largura, linha); //D Esq, D Topo, larg, alt
		b1.setBackground(new Color(0,0,170));
		b1.setForeground(Color.YELLOW);
		b1.setFont(new Font("Helvetica", Font.BOLD, 12));
		b1.setToolTipText("Clique para gravar");
		b1.setHorizontalAlignment(SwingConstants.CENTER);
		b1.setVerticalAlignment(SwingConstants.CENTER);
//		b1.setEnabled(false); //Botão desabilitado.
		b1.setMnemonic('G');  //Tecla de atalho
		add(b1);
		return b1;
	}
	private JTextField criarCaixaTexto(String texto, 
			int distEsq, int distTopo, int largura, int linha) {
		JTextField jt = new JTextField();
		jt.setText(texto);
		jt.setBounds(distEsq, distTopo, largura, linha);
		jt.selectAll();
		add(jt);
		return jt;
	}
	public JLabel criarJLabel(String texto, 
		int distEsq, int distTopo, int largura, int linha){
		JLabel jl = new JLabel();
		jl.setText(texto);
		jl.setForeground(Color.BLUE);
		jl.setBounds(distEsq, distTopo, largura, linha);
		jl.setFont(new Font("Courier new", Font.BOLD, 12));
		jl.setToolTipText("JLabel Exemplo");//Dica texto
		add(jl);
		return jl;
	}
	
	public static void main(String [] args){
	 	new TesteJFrameJTextField();
  }
}