package aula04;


import java.util.Date;

import javax.swing.JOptionPane;
public class ExemploLogin {
	public static void main(String args[]){
		int senha = 1234;
		String nome = "Marcos";
		String usuario;
		int senhaDigitada;	
		boolean sair = true;	
		do {
			 usuario = JOptionPane.showInputDialog("Digite o nome");
			 senhaDigitada = Integer.parseInt(JOptionPane.showInputDialog
			("Digite a senha"));
			 if((senhaDigitada == senha && usuario.equalsIgnoreCase(nome))) {
//				 System.out.println("Voc� logou no sistema");
				 sair = false;
			 }
			 else
			 	JOptionPane.showMessageDialog(null, "Usu�rio ou senha inv�lidos!!!");				
		}
		while(sair);
		
		System.out.println("Voc� logou no sistema");	
	}
}


/*
 * 
 int senha = 1234;
		String nome = "Marcos";
		
		String usuario = JOptionPane.showInputDialog("Digite o nome");
		int senhaDigitada = Integer.parseInt(JOptionPane.showInputDialog
		("Digite a senha"));
		if(senhaDigitada == senha && usuario.equalsIgnoreCase(nome))			
				System.out.println("Voc� logou no sistema");			 		
		else 
			JOptionPane.showMessageDialog(null, "Usu�rio ou senha inv�lidos!!!"); 		
		
 
 
Date data = new Date(); 
int mes = data.getMonth()+1;
*/