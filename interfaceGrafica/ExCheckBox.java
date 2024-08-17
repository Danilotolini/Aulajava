package interfaceGrafica;
import java.awt.*;	import java.awt.event.*;  import javax.swing.*;
public class ExCheckBox extends JFrame implements ItemListener{	
	JLabel l1;	
	JCheckBox cbNegrito,cbItalico;
	static int negrito=0,italico=0;
	public static void main(String args[])	{	
		new ExCheckBox ();		
	}
	ExCheckBox ()	{	
		setBackground(new Color(180,180,180)); 
		setTitle("Uso do JCheckBox");
		setSize(800,70);
		setLayout(new FlowLayout(FlowLayout.CENTER));

		l1 = criarRotulo(JOptionPane.showInputDialog("Digite um texto"));

		setLayout(new GridLayout(1, 3, 3, 3));

		cbNegrito = criarCheckBox("Negrito");
		cbItalico = criarCheckBox("Italico");

		setLocationRelativeTo(null);	
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private JCheckBox criarCheckBox(String texto) {
		JCheckBox cb = new JCheckBox(texto);
		cb.setBackground(Color.RED);
		cb.addItemListener(this);
		add(cb);
		return cb;
	}
	private JLabel criarRotulo(String texto) {
		JLabel l1 = new JLabel(texto);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Arial",Font.PLAIN,20)); 
		l1.setForeground(new Color(26,72,17));
		add(l1); 
		return l1;
	}
	public void itemStateChanged(ItemEvent e){  
		if(e.getSource()==cbNegrito){
			if(e.getStateChange()==ItemEvent.SELECTED) 
				negrito=Font.BOLD;
			else  
				negrito=Font.PLAIN;		
		}  
		if(e.getSource()==cbItalico){     
			if(e.getStateChange()==ItemEvent.SELECTED) 
				italico=Font.ITALIC;
			else  
				italico=Font.PLAIN;		
		}  
		l1.setFont(new Font("Arial",negrito+italico,20)); 
	}	
}

