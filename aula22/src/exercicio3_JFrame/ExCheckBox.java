package exercicio3_JFrame;
import java.awt.*;	import java.awt.event.*;  import javax.swing.*;
public class ExCheckBox extends JFrame implements ItemListener{
	JLabel l1;	
	JCheckBox cbItalico, cbNegrito;
	static int negrito=0,italico=0;
	public static void main(String args[])	{	
		new ExCheckBox ();		
	}

	ExCheckBox (){	
		setBackground(new Color(180,180,180)); 
		setTitle("Uso do JCheckBox");
		setSize(300,70);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		l1 = Criarlinha();
		setLayout(new GridLayout(1, 3, 3, 3));
		cbNegrito = criarbox("Negrito"); 
		cbItalico = criarbox("Italico");
		add(l1);  	add(cbNegrito);  	add(cbItalico);
		setLocationRelativeTo(null);	setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
		private JCheckBox criarbox(String texto) { 
			JCheckBox cb = new JCheckBox(texto);
			cb = new JCheckBox();
			cb.setBackground(new Color(180,180,180));
			cb.addItemListener(this);
			add(cb);
		return cb;
	}

		private JLabel Criarlinha() {
			JLabel linha = new JLabel(JOptionPane.showInputDialog("Digite um texto"));
			linha.setHorizontalAlignment(SwingConstants.CENTER);
			linha.setFont(new Font("Arial",Font.PLAIN,20)); 
			linha.setForeground(new Color(26,72,17));
		return linha;
	}

		public void itemStateChanged(ItemEvent e){  
			if(e.getSource()== cbNegrito){
				if(e.getStateChange()==ItemEvent.SELECTED) 
					negrito=Font.BOLD;
				else  
					negrito=Font.PLAIN;		}  
				if(e.getSource()== cbItalico){     
				if(e.getStateChange()==ItemEvent.SELECTED) 
					italico=Font.ITALIC;
				else  
					italico=Font.PLAIN;		}  
				l1.setFont(new Font("Arial",negrito+italico,20)); 
				}	}
