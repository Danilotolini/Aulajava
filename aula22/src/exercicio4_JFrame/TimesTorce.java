package exercicio4_JFrame;
import java.awt.*;	import java.awt.event.*;  import javax.swing.*;
public class TimesTorce extends JFrame implements ItemListener{	
	JLabel l1, l2, l3, l4, l5, l6, l7;	
	JCheckBox cbTime1, cbTime2, cbTime3, cbTime4, cbTime5, cbTime6, cbTime7 ;
	static int negrito=0,italico=0;
	public static void main(String args[])	{	
		new TimesTorce ();		
	}
	TimesTorce ()	{	
		setBackground(new Color(180,180,180)); 
		setTitle("Times que torce");
		setSize(600,400);
		setLayout(new FlowLayout(FlowLayout.CENTER));	
		
		setLayout(new GridLayout(9, 1, 3, 3));

		cbTime1 = criarCheckBox("São Paulo");
		cbTime2 = criarCheckBox("Palmeiras");
		cbTime3 = criarCheckBox("Santos");
		cbTime4 = criarCheckBox("Corinthians");
		cbTime5 = criarCheckBox("Grêmio");
		cbTime6 = criarCheckBox("Cruzeiro");
		cbTime7 = criarCheckBox("Fluminense");
		cbTime7 = criarCheckBox("Fortaleza");

		l1 = criarRotulo("Times Selecionados:");
		
		setLocationRelativeTo(null);	
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private JCheckBox criarCheckBox(String texto) {
		JCheckBox cb = new JCheckBox(texto);
		cb.setForeground(Color.BLUE);
		cb.setFont(new Font("Arial",Font.PLAIN,20));
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
		int i=0;
		if(e.getSource()==cbTime1){
			if(e.getStateChange()==ItemEvent.SELECTED) 
				l1.setText(l1.getText() + " " + cbTime1.getText());
			else  
				JOptionPane.showMessageDialog(null, 
						"Mude para o melhor torça para o São Paulo!!!");
		}  
		else if(e.getSource()==cbTime2){    			
			if(e.getStateChange()==ItemEvent.SELECTED) {
				JOptionPane.showMessageDialog(null, 
						"Não tem Mundial!!!");				
				cbTime2.setSelected(true);
				if(i==0) {
					l1.setText(l1.getText() + " " + cbTime2.getText());
					i++;
				}
			}
			else  
				JOptionPane.showMessageDialog(null, 
						"Mude para o melhor torça para o São Paulo!!!");		
		}  
		else if(e.getSource()==cbTime3){     
			if(e.getStateChange()==ItemEvent.SELECTED) {
				JOptionPane.showMessageDialog(null, 
						"Tri Mundial. time do Rei do Futebol!!!");
				l1.setText(l1.getText() + " " + cbTime3.getText());
			}
			else  
				JOptionPane.showMessageDialog(null, 
						"Mude para o melhor torça para o São Paulo!!!");		
		}  
	}	
}


