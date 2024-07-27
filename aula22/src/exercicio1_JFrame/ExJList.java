package exercicio1_JFrame;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class ExJList extends JFrame implements ListSelectionListener, ActionListener{  
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
		setTitle("Esportes que pratica");        
		t1 = new JTextField();        
		t1.addActionListener(this);//adicionando o evento no objeto
		l1 = new JLabel("Sem selecao");        
		bquant = criarBotao("Quantidade de itens");        
		bindice = criarBotao("Indice selecionado");        
		bclear = criarBotao("Remove item");        
		
		listModel = new DefaultListModel(); //container com os itens
		listModel.addElement("Futebol"); 
		listModel.addElement("Natação");
		listModel.addElement("Esgrima");
		listModel.addElement("Judô");
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
	private JButton criarBotao(String texto) {
		JButton botao = new JButton(texto);
		botao.addActionListener(this);
		return botao;
	}
	// Tratando os eventos
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==t1){//verifica se foi disparado objeto t1
			listModel.addElement(t1.getText());  //adiciona itens a lista
			JOptionPane.showMessageDialog(null, t1.getText() +  " adicionada(o) na lista");
			t1.setText(""); //Limpa a caixa de texto
		} 
		if (e.getSource()==bquant)
			//verifica a quantidade de  itens da lista
			t1.setText("Quantidade: " + listModel.getSize());
		if (e.getSource()==bindice) {
			//verifica o índice do item selecionado
			t1.setText("Indice selecionado: " + lista.getSelectedIndex());
			if(lista.getSelectedValue().equals("Natação"))
				JOptionPane.showMessageDialog(null, lista.getSelectedValue() +  
						": Esporte de excelência");	
		}
		if (e.getSource()==bclear){
			int resp = JOptionPane.showConfirmDialog(null,"Confirma a exclusão do item: " + 
					lista.getSelectedValue());
			if(resp==0)
			{
				int index = lista.getSelectedIndex();
				l1.setText("Removido : "+ lista.getSelectedValue());
				listModel.remove(index); 
			}	}        }
	public void valueChanged(ListSelectionEvent e)	{
		l1.setText("Índice Selecionado : " +lista.getSelectedValue()); 		
	}
}