package exercicio4_JFrame;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class ExJList extends JFrame implements ListSelectionListener, ActionListener
{  
	// Criando objetos Label, Texto  e Botões
	JLabel l1;  
	JTextField t1;    
	JButton bquant,bindice,bclear,badd;
	JList lista; // Criando objeto Lista
	// Criando objetos listModel a partir da classe DefaultListModel
	DefaultListModel listModel; 

	public static void main(String args[]){
		new ExJList ();
	}
	public ExJList (){
		setSize(300,250);
		setTitle("Uso do JList");        
		t1 = new JTextField();        
		t1.addActionListener(this);//adicionando o evento no objeto
		l1 = new JLabel("Sem selecao");        
		bquant = new JButton("Quantidade de itens");        
		bquant.addActionListener(this); //adicionando o evento no objeto
		bindice = new JButton("Indice selecionado");        
		bindice.addActionListener(this); //adicionando o evento no objeto
		bclear = new JButton("Remove item");        
		bclear.addActionListener(this); //adicionando o evento no objeto 
		
		listModel = new DefaultListModel(); //container com os itens
		listModel.addElement("Banana"); 
		listModel.addElement("Pera");
		listModel.addElement("Maça");
		listModel.addElement("Uva");
		lista = new JList(listModel); //adicionando o listModel na Lista.
		lista.addListSelectionListener(this); //Adicionando o evento na lista
		// Criando painel do tipo barra de rolagem
		JScrollPane Painel = new JScrollPane(lista); 
		setLayout(new GridLayout(6,1)); //Criando um Layout do tipo Grid 
		add(l1);
		add(t1);
		add(Painel);
		add(bquant);
		add(bindice);
		add(bclear); 
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 
	
	// Tratando os eventos
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==t1)//verifica se foi disparado objeto t1
		{
			listModel.addElement(t1.getText());  //adiciona itens a lista
			t1.setText(""); //Limpa a caixa de texto
		} 
		if (e.getSource()==bquant)
			//verifica a quantidade de  itens da lista
			t1.setText("Quantidade: " + listModel.getSize());
		if (e.getSource()==bindice)
			//verifica o índice do item selecionado
			t1.setText("Indice selecionado: " + lista.getSelectedIndex());
		if (e.getSource()==bclear)
		{
			int resp = JOptionPane.showConfirmDialog(null,"Confirma a exclusão do item: " + 
					lista.getSelectedValue());
			if(resp==0)
			{
				int index = lista.getSelectedIndex();
				l1.setText("Removido : "+ lista.getSelectedValue());
				listModel.remove(index); 
			}	}        }
	public void valueChanged(ListSelectionEvent e)
	{
		l1.setText("Item Selecionado : " 
		+ lista.getSelectedValue()); 
	}	
}
