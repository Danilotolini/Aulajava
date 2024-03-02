//Logica é a arte de pensar corretamente
/*
package aula3;

import javax.swing.JOptionPane;

public class aula3 {
	public static void main (String[] args) { 
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número "));   
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo número "));   
		if(numero > numero2) {
		JOptionPane.showMessageDialog(null, "O número " + numero + " é maior que o numero " + numero2); 
		} else { 
		JOptionPane.showMessageDialog(null, "O número " + numero2 + " é maior que o numero " + numero);
		}
	}
}
*/
/*
package aula3;

import javax.swing.JOptionPane;

public class pareimpar {
	public static void main (String[] args) { 
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número "));   
		if(numero%2==0) {
		JOptionPane.showMessageDialog(null, "O número " + numero + " é par"); 
		} else { 
		JOptionPane.showMessageDialog(null, "O número " + numero + " é impar");
		}
	}
} 
*/
/* 
package aula3;

public class ifelse2 {
	public static void main(String[] args) {  
		int x = 16; 
		if(x < 15) { 
			System.out.println("x é menor que 15"); 
			System.out.println("O valor de x é " + x); 
		}else { 
			System.out.println("x é maior ou igual a 15"); 
			System.out.println("O valor de x é " + x); 
		}
	}
}
*/
/*
package aula3;

import javax.swing.JOptionPane;

public class ifelse {
	public static void main(String[] args) { 
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade ")); 
		String crianca = "Criança"; 
		String preadolescente = "Pre Adolescente"; 
		String adolescente = "Adolescente"; 
		String adulto = "Adulto";
			
		if(idade <= 10){ 
			JOptionPane.showMessageDialog(null, "Você pertence ao grupo de " + crianca);
		}else if (idade <= 13){ 
			JOptionPane.showMessageDialog(null, "Você pertence ao grupo de " + preadolescente);  
		}else if(idade <= 18){ 
			JOptionPane.showMessageDialog(null, "Você pertence ao grupo de " + adolescente); 
		}else { 
			JOptionPane.showMessageDialog(null, "Você pertence ao grupo de " + adulto); 
		
		}
	}
}
*/
/* 
package aula3;

import javax.swing.JOptionPane;

public class ifelse3 {
	public static void main(String[] args) {  
	
		int hora = Integer.parseInt(JOptionPane.showInputDialog("Digite o horário "));  
		String dia = "Bom dia"; 
		String tarde = "Boa tarde"; 
		String noite = "Boa noite";  
		
		if (hora < 12){ 
			JOptionPane.showMessageDialog(null, dia); 
		}else if(hora < 18){ 
			JOptionPane.showMessageDialog(null, tarde); 
		} else if(hora <= 24) { 
			JOptionPane.showMessageDialog(null, noite); 
		}else { 
			JOptionPane.showMessageDialog(null, "Este horário não existe"); 
		}
	}
} 
*/
