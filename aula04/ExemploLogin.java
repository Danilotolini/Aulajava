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
//				 System.out.println("Você logou no sistema");
				 sair = false;
			 }
			 else
			 	JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!!!");				
		}
		while(sair);
		
		System.out.println("Você logou no sistema");	
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
				System.out.println("Você logou no sistema");			 		
		else 
			JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!!!"); 		
		
 
 
Date data = new Date(); 
int mes = data.getMonth()+1;
*/