package exercicio2_JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ExComboBox extends JFrame implements ActionListener, ItemListener
{
	JLabel l1;
	JTextField t1,t2,t3;
	JComboBox combo;
	JButton b1,b2,b3,b4,b5,b6; 

	public static void main(String args[]){
		new ExComboBox();   
	}
	ExComboBox ()	{
		setTitle("Uso do JComboBox");
		setSize(600,250); 	
		getContentPane().setBackground(new Color(190,190,190)); 
		getContentPane().setLayout(new GridLayout(5,2)); 
		
		l1 = criarRotulo("Conteudo");
		getContentPane().add(l1);
		
		String[] cores = {"Branco","Vermelho","Azul","Verde"}; 
		combo = new JComboBox(cores); 
		combo.setFont(new Font("Arial", Font.BOLD, 24));		
		combo.addItemListener(this); 
		getContentPane().add(combo);		
		       
		b1 = criarBotao("Mostra Texto"); 
		b2 = criarBotao("Mostra Índice"); 
		b3 = criarBotao("Adiciona Item"); 
		t1 = criarCaixaTexto();
		b4 = criarBotao("Remove Item"); 	
		b5 = criarBotao("Remove Todos"); 	
		b6 = criarBotao("Quant. Itens"); 
		t2 = criarCaixaTexto();			
		
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private JTextField criarCaixaTexto() {
		JTextField texto = new JTextField();
		texto.setHorizontalAlignment(SwingConstants.CENTER);
		texto.setFont(new Font("Arial", Font.BOLD, 24));
		add(texto);
		return texto;
	}
	private JButton criarBotao(String texto) {
		JButton botao = new JButton(texto);
		botao.addActionListener(this);
		botao.setFont(new Font("Arial", Font.BOLD, 24));	
		add(botao);
		return botao;
	}
	public JLabel criarRotulo(String texto) {
		JLabel rotulo = new JLabel(texto);
		rotulo.setHorizontalAlignment(SwingConstants.CENTER);
		rotulo.setForeground(Color.blue);
		rotulo.setFont(new Font("Arial", Font.BOLD, 24));	
		
		return rotulo;
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==b1)
			l1.setText("Texto: "+combo.getSelectedItem());
		if (e.getSource()==b2)
			l1.setText("Índice: " + combo.getSelectedIndex()); 
		if (e.getSource()==b3) {
			int resp = JOptionPane.showConfirmDialog(null,"Confirma a inclusão "
					+ "da cor: " + t1.getText());
			if(resp==0 && t1.getText().length()!=0){
				combo.addItem(t1.getText());//adiciona item
				t1.setText("");      
			}
		}//limpa o texto de t1 
		if (e.getSource()==b4) {
			int resp = JOptionPane.showConfirmDialog(null,"Confirma a exclusão "
					+ "da cor: " + combo.getSelectedItem());
			if(resp==0)
			combo.removeItemAt( (combo.getSelectedIndex())); // remove o item selecionado
		}
		if (e.getSource()==b5) {
			int resp = JOptionPane.showConfirmDialog(null,"Confirma a exclusão "
					+ "de todas cores: ");
			if(resp==0)
				combo.removeAllItems(); //remove todos itens 
		}
		if (e.getSource()==b6) 
			t2.setText(""+combo.getItemCount());//conta a quantidade total de itens     
	} 
	public void itemStateChanged(ItemEvent e)
	{ 
		t1.setText(""+combo.getSelectedItem());  
	} 
} //mostra o item selecionado