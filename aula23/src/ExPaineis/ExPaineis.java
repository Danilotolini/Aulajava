package ExPaineis;
import java.awt.*; 	import java.awt.event.*;		import javax.swing.*;
public class ExPaineis extends JFrame implements ItemListener{
	JLabel l1,l2;
	float n1=0,result=0;
	JTextField t1, t2;
	JPanel p1,p2;
	JRadioButton radio1,radio2,radio3;
	ButtonGroup radiogroup;
	public static void main(String args[]){ 
		new ExPaineis ();
	}

	ExPaineis (){
		setTitle("Uso de botoes de Radio ");
		setSize(600,200);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		l1 = new JLabel("Digite um valor");
		l1.setForeground(Color.blue);
		l2 = new JLabel("% do Valor :");
		l1.setFont(new Font("Arial", Font.PLAIN, 24));
		l2.setFont(new Font("Arial", Font.PLAIN, 24));
		l2.setForeground(Color.blue);
		t1 = new JTextField(5);   
		t2 = new JTextField(5);
		p1 = new JPanel();        
		p2 = new JPanel();
		t2.setEditable(false);
		t1.setFont(new Font("Arial", Font.PLAIN, 24));
		t2.setFont(new Font("Arial", Font.PLAIN, 24));
		
		radio1 = new JRadioButton("10% do valor");
		radio2 = new JRadioButton("20% do valor");
		radio3 = new JRadioButton("30% do valor");
		radio1.setMnemonic(KeyEvent.VK_1);
		radio2.setMnemonic(KeyEvent.VK_2);
		radio3.setMnemonic(KeyEvent.VK_3);
		
		radiogroup = new ButtonGroup();
		radiogroup.add(radio1);
		radiogroup.add(radio2);
		radiogroup.add(radio3);
		radio1.addItemListener(this);	
		radio1.setFont(new Font("Arial", Font.PLAIN, 24));
		radio2.setFont(new Font("Arial", Font.PLAIN, 24));
		radio3.setFont(new Font("Arial", Font.PLAIN, 24));
		radio2.addItemListener(this);	 
		radio3.addItemListener(this);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER));
		p1.setBackground(new Color(200,200,200));
		p2.setLayout(new GridLayout(2,3));
		p2.setBackground(new Color(200,200,200));
		l1.setFont(new Font("Arial", Font.PLAIN, 24));
		t1.setFont(new Font("Arial", Font.PLAIN, 24));
		p1.add(l1);     
		p1.add(t1);   
		p2.add(radio1); 
		p2.add(radio2); 
		p2.add(radio3);
		p2.add(l2);     
		p2.add(t2);
		getContentPane().add(p1);  
		getContentPane().add(p2);	 
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void itemStateChanged(ItemEvent e){ 
		if (t1.getText().length()==0) return;
		try{  	
			n1 = Float.parseFloat(t1.getText());
			if (e.getSource()==radio1)
				result = (n1 * 10)/100;
			if (e.getSource()==radio2)
				result = (n1 * 20)/100;
			if(e.getSource()==radio3)
				result = (n1 * 30)/100;         
		}
		catch(NumberFormatException erro){  	
			t2.setText("Erro");  return;  
		}
		t2.setText(""+result);           
	}       
}