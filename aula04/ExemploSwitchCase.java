package aula04;
import java.util.Date;

import javax.swing.JOptionPane;
public class ExemploSwitchCase {
	public static void main(String args[]){
		//		int mes = 1;		
		Date data = new Date(); 
		int mes = data.getMonth()+1;		
		switch(mes){
			case 1: 
				System.out.println("Janeiro");
				System.out.println("Mês de Férias!!!");  
			break;
			case 2: System.out.println("Fevereiro"); break;
			case 3: System.out.println("Março"); break;
			case 4: System.out.println("Abril"); break;
			case 5: System.out.println("Maio"); break;
			case 6: System.out.println("Junho"); break;
			case 7: System.out.println("Julho"); break;
			case 8: System.out.println("Agosto"); break;
			case 9: System.out.println("Setembro"); break;
			case 10: System.out.println("Outubro"); break;
			case 11: System.out.println("Novembro"); break;
			case 12: System.out.println("Dezembro"); break;
			default: System.out.println("Mês não existe.");
		}
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