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
// EXERCICIO MODIFICADO DO ANTERIOR 
/* 
package aula3;

import java.util.Date;

import javax.swing.JOptionPane;

public class ifelse3 {
	public static void main(String[] args) {  
		Date d = new Date();
		int hora = d.getHours();
		String dia = "Bom dia"; 
		String tarde = "Boa tarde"; 
		String noite = "Boa noite";  
		
		if (hora < 12){ 
			JOptionPane.showMessageDialog(null, dia); 
		}else if(hora < 18){ 
			JOptionPane.showMessageDialog(null, tarde); 
		} else if(hora <= 24) { 
			JOptionPane.showMessageDialog(null, noite); 
		}
	}
}
*/
/* 
package aula3;

import javax.swing.JOptionPane;

public class breack {
	 public static void main(String[] args) { 
		 int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite em numero um mês ")); 
		 switch(mes) { 
		 case 1: JOptionPane.showMessageDialog(null, "Janeiro",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 2: JOptionPane.showMessageDialog(null, "Fevereiro",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 3: JOptionPane.showMessageDialog(null, "Março",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 4: JOptionPane.showMessageDialog(null, "Abril",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 5: JOptionPane.showMessageDialog(null, "Maio",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 6: JOptionPane.showMessageDialog(null, "Junho",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 7: JOptionPane.showMessageDialog(null, "Julho",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 8: JOptionPane.showMessageDialog(null, "Agosto",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 9: JOptionPane.showMessageDialog(null, "Setembro",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 10: JOptionPane.showMessageDialog(null, "Outubro",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 11: JOptionPane.showMessageDialog(null, "Novembro", "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 12: JOptionPane.showMessageDialog(null, "Dezembro",  "", JOptionPane.INFORMATION_MESSAGE); break;  
		 }
	 }
} 
*/ 
// EXERCICIO MODIFICADO DO ANTERIOR  
/* 
package aula3;

import javax.swing.JOptionPane;

public class breack {
	 public static void main(String[] args) {  
		 Date data = new Date();
		 int mes = data.getMonth()+1;
		 switch(mes) { 
		 case 1: JOptionPane.showMessageDialog(null, "Janeiro",  "", JOptionPane.INFORMATION_MESSAGE); break;  
		 JOptionPane.showMessageDialog(null, "Mes de férias",  "", JOptionPane.INFORMATION_MESSAGE); break;  
		 case 2: JOptionPane.showMessageDialog(null, "Fevereiro",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 3: JOptionPane.showMessageDialog(null, "Março",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 4: JOptionPane.showMessageDialog(null, "Abril",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 5: JOptionPane.showMessageDialog(null, "Maio",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 6: JOptionPane.showMessageDialog(null, "Junho",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 7: JOptionPane.showMessageDialog(null, "Julho",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 8: JOptionPane.showMessageDialog(null, "Agosto",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 9: JOptionPane.showMessageDialog(null, "Setembro",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 10: JOptionPane.showMessageDialog(null, "Outubro",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 11: JOptionPane.showMessageDialog(null, "Novembro", "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 12: JOptionPane.showMessageDialog(null, "Dezembro",  "", JOptionPane.INFORMATION_MESSAGE); break;  
		 }
	 }
}
*/ 
//OUTRA VARIAÇÃO PORÉM MOSTRANDO AS ESTAÇÕES DO ANO JUNTO DOS MESES
/*
package aula3;

import javax.swing.JOptionPane;

public class breack {
	 public static void main(String[] args) {  
		 int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite em numero um mês ")); 
		 switch(mes) { 
		 case 1: JOptionPane.showMessageDialog(null, "Janeiro",  "", JOptionPane.INFORMATION_MESSAGE);
		 JOptionPane.showMessageDialog(null, "Mês de verão",  "", JOptionPane.INFORMATION_MESSAGE); break;   
		 case 2: JOptionPane.showMessageDialog(null, "Fevereiro",  "", JOptionPane.INFORMATION_MESSAGE); 
		 JOptionPane.showMessageDialog(null, "Mês de verão",  "", JOptionPane.INFORMATION_MESSAGE); break;  
		 case 3: JOptionPane.showMessageDialog(null, "Março",  "", JOptionPane.INFORMATION_MESSAGE); 
		 JOptionPane.showMessageDialog(null, "Mês de outono",  "", JOptionPane.INFORMATION_MESSAGE); break;  
		 case 4: JOptionPane.showMessageDialog(null, "Abril",  "", JOptionPane.INFORMATION_MESSAGE);   
		 JOptionPane.showMessageDialog(null, "Mês de outono",  "", JOptionPane.INFORMATION_MESSAGE); break;  
		 case 5: JOptionPane.showMessageDialog(null, "Maio",  "", JOptionPane.INFORMATION_MESSAGE); 
		 JOptionPane.showMessageDialog(null, "Mês de outono",  "", JOptionPane.INFORMATION_MESSAGE); break;  
		 case 6: JOptionPane.showMessageDialog(null, "Junho",  "", JOptionPane.INFORMATION_MESSAGE); 
		 JOptionPane.showMessageDialog(null, "Mês de inverno",  "", JOptionPane.INFORMATION_MESSAGE); break;  
		 case 7: JOptionPane.showMessageDialog(null, "Julho",  "", JOptionPane.INFORMATION_MESSAGE);  
		 JOptionPane.showMessageDialog(null, "Mês de inverno",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 8: JOptionPane.showMessageDialog(null, "Agosto",  "", JOptionPane.INFORMATION_MESSAGE); 
		 JOptionPane.showMessageDialog(null, "Mês de inverno",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 9: JOptionPane.showMessageDialog(null, "Setembro",  "", JOptionPane.INFORMATION_MESSAGE); 
		 JOptionPane.showMessageDialog(null, "Mês de primavera",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 10: JOptionPane.showMessageDialog(null, "Outubro",  "", JOptionPane.INFORMATION_MESSAGE);  
		 JOptionPane.showMessageDialog(null, "Mês de primavera",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 11: JOptionPane.showMessageDialog(null, "Novembro", "", JOptionPane.INFORMATION_MESSAGE);
		 JOptionPane.showMessageDialog(null, "Mês de primavera",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 12: JOptionPane.showMessageDialog(null, "Dezembro",  "", JOptionPane.INFORMATION_MESSAGE);   
		 JOptionPane.showMessageDialog(null, "Mês de verão",  "", JOptionPane.INFORMATION_MESSAGE); break;  
		 }
	 }
} 
*/
