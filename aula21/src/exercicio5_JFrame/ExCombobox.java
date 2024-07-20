package exercicio5_JFrame;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class ExCombobox extends JFrame{
	public ExCombobox(){		
		setTitle("Janela com Rótulo");//Titulo da janela		
		setSize(600,100);//tamanho da janela
		Container c = getContentPane();		
		c.setLayout(null);// anula o layout padrao		
		//cor de fundo da janela no padrão RGB (Red Green Blue)
		c.setBackground(new Color(240,248,148));
		//provoca o termino da execução (encerra o programa)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		JLabel rotulo = criarJLabel();
		c.add(rotulo);		
	}
	public JLabel criarJLabel(){
		JLabel jl = new JLabel();
		jl.setText("JLabel inserido");
		jl.setLocation(10, 10);
		jl.setSize(200, 50);
		//Torna opaco o fundo do rótulo
		jl.setOpaque(true);
		jl.setBackground(new Color(255,255,255));
		jl.setForeground(new Color(0,0,0));
		jl.setFont(new Font("Courier new", Font.BOLD, 12));
		jl.setToolTipText("JLabel Exemplo");//Dica texto
		jl.setHorizontalAlignment(SwingConstants.LEFT);
		jl.setVerticalAlignment(SwingConstants.TOP);
		setLocationRelativeTo(null);//centraliza a tela	
		return jl;
	}

	public static void main(String [] args){
	 	new ExCombobox();
  }
} 