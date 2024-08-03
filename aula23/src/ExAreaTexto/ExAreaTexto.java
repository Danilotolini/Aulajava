package ExAreaTexto;
import java.awt.*;	import java.awt.event.*;	import javax.swing.*;
public class ExAreaTexto extends JFrame implements ActionListener {
	JTextArea ta1,ta2;
	JTextField t1;
	JButton b1,b2;

	public static void main(String args[])  	{	
		new ExAreaTexto();
	}

	ExAreaTexto(){   
		setSize(480,280);
		setTitle("Usando Áreas de Texto");
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));  
		t1 = new JTextField(40);  
		t1.addActionListener(this);
		b1 = new JButton("Copia Tudo");   
		b1.addActionListener(this);
		b2 = new JButton("Copia Selecao"); 
		b2.addActionListener(this);
		ta1 = new JTextArea("Editor de texto:\n",5,40);
		ta2 = new JTextArea(5,40);
		JScrollPane painel1 = new JScrollPane(ta1);
		JScrollPane painel2 = new JScrollPane(ta2);
		Container c=getContentPane();
		c.add(painel1);  
		c.add(t1);
		c.add(b1);
		c.add(b2);
		c.add(painel2);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e){ 	
		if (e.getSource()==t1) {   
			ta1.append(t1.getText()); //copie o conteúdo de t1 para a ta1
			t1.setText("");
		}
		if (e.getSource()==b1) 	//se o botão selecionado for o b1 (copia tudo)
			ta2.setText(ta1.getText()); //copia conteúdo de ta1 em ta2
		if (e.getSource()==b2) 	//se o botão selecionado for o 2 (copia seleção)
			ta2.setText(ta1.getSelectedText()); //copia o texto selecionado
	}	
}

