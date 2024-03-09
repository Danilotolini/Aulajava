/*
package aula4;

import javax.swing.JOptionPane;

public class aula4 {
	public static void main(String[] args) { 
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um mês em numerico")); 
		switch(mes) { 
		case 1: JOptionPane.showMessageDialog(null, "O mês de janeiro tem 31 dias"); break;
		case 2: JOptionPane.showMessageDialog(null, "O mês de fevereiro tem 29 dias"); break; 
		case 3: JOptionPane.showMessageDialog(null, "O mês de março tem 31 dias"); break;
		case 4: JOptionPane.showMessageDialog(null, "O mês de abril tem 30 dias"); break;
		case 5: JOptionPane.showMessageDialog(null, "O mês de maio tem 31 dias"); break;
		case 6: JOptionPane.showMessageDialog(null, "O mês de junho tem 30 dias"); break; 
		case 7: JOptionPane.showMessageDialog(null, "O mês de julho tem 31 dias"); break;  
		case 8: JOptionPane.showMessageDialog(null, "O mês de agosto tem 31 dias"); break;  
		case 9: JOptionPane.showMessageDialog(null, "O mês de setembro tem 30 dias"); break; 
		case 10: JOptionPane.showMessageDialog(null, "O mês de outubro tem 31 dias"); break;
		case 11: JOptionPane.showMessageDialog(null, "O mês de novembro tem 30 dias"); break; 
		case 12: JOptionPane.showMessageDialog(null, "O mês de dezembro tem 31 dias"); break;
		}
	}
}
*/
/* 
ackage aula4;

import javax.swing.JOptionPane;

public class aula4 {
	public static void main(String[] args) { 
		String mes = JOptionPane.showInputDialog("Digite um mês em numerico"); 
		switch(mes.toUpperCase) { 
		case "Janeiro": case "Março": case "Maio": case "Julho": case "Agosto": case "Outubro": case "Dezembro": 
			JOptionPane.showMessageDialog(null, "O mês de " +  mes + " tem 31 dias"); break; 
		case "Fevereiro": 
			JOptionPane.showMessageDialog(null, "O mês de " + mes + " tem 29 dias"); break; 
		
		case "Abril":  case "Junho":  case "Setembro": case "Novembro": 
			JOptionPane.showMessageDialog(null, "O mês de " + mes + "tem 30 dias"); break;
		
	
		}
	}
}
*/
/* 
package aula4;

public class copa {
	public static void main(String[] args) { 
		for (int ano1 = 1930; ano1 <= 2024; ano1 += 4) {  
			if(ano1 == 1042 || ano1 == 1946) { continue; 
			} 
			System.out.println("copa do mundo de " + ano1 + "."); 		
		}
	} 
}
*/
/* 
package aula4;

public class copa {
	public static void main(String[] args) { 
		for (int ano1 = 1930; ano1 <= 2024; ano1 += 4) {  
			if(ano1 == 1042 || ano1 == 1946) { continue; 
			} 
			System.out.println("copa do mundo de " + ano1 + "."); 		 
			if(ano1==1962 || ano1==1958 || ano1==1994 || ano1==2002) 
				System.out.println(" Brasil CAPEÃO!");
		}
	} 
}
*/
/* 
package aula4;

import javax.swing.JOptionPane;

public class anobissexto {

	public static void main(String[] args) { 
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano"));
		// for(int ano=0; ano==2024; ano++) { 
			if((ano%4==0 && (ano%100)!=0) || (ano%400==0))
		JOptionPane.showMessageDialog(null, "Este ano é um ano bissexto");		  
			else 
		JOptionPane.showMessageDialog(null, "Este ano não é um ano bissexto");		
		}

	}  
 */ 
/*
package aula4;

public class mediaaritmetica {
	public static void main(String[] args) { 
		int oito = 8, nove = 9, sete = 7; 
		int quatro = 4, cinco = 5, seis = 6; 
		int media1 = (oito + nove + sete) / 3; 
		int media2 = (quatro + cinco + seis) / 3;  
		int somamedia = media1 + media2; 
		int media3 = (somamedia) / 2; 
		System.out.println("A média aritmética dos números 8,9 e 7 é " + media1); 
		System.out.println("A media dos numeros 4, 5 e 6 é " + media2);
		System.out.println("A soma das duas médias é" + somamedia);
		System.out.println("A media das medias são " + media3);
	}
}
*/ 
/* 
package aula4;

import javax.swing.JOptionPane;

public class nometeclado {
	public static void main(String[] args) {  
		String nome = JOptionPane.showInputDialog("Insira o seu nome"); 
		for(int i = 0; i <= 10; i++) { 
			System.out.println(nome);
		}
	}
}
*/
/* 
package aula4;

import javax.swing.JOptionPane;

public class antecessor {
	public static void main(String[] args) {  
		int numerointeiro = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero ")); 
		int antecessor = numerointeiro - 1; 
		int sucessor = numerointeiro + 1; 
		JOptionPane.showMessageDialog(null, antecessor + " , " + numerointeiro + " , " + sucessor );
	}
} 
*/ 
/* 
package aula4;

import javax.swing.JOptionPane;

public class ajuste10porcento {
	public static void main(String[] args) {  
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero "));
		float divisao = numero / 100; 
		float multiplicacao = divisao * 10;
		float resultado = multiplicacao + numero;
		
		
		JOptionPane.showMessageDialog(null, resultado );
	}
}

*/ 
//MAI SIMPLES 
/* 
package aula4;

import javax.swing.JOptionPane;

public class ajuste10porcento {
	public static void main(String[] args) {  
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero "));
		System.out.println("Digitando = " + numero); 
		System.out.println("O valor em 10% é = " + numero * 1.1);
	}
}

*/ 
/* 
package aula4;

import javax.swing.JOptionPane;

public class quadrado {
	public static void main(String[] args) { 
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do quadrado")); 
		JOptionPane.showMessageDialog(null, "O valor ao quadrado de " + valor + " é " + valor * valor);
	}
}
*/
/* 
package aula4;

import javax.swing.JOptionPane;

	public class produto {
	public static void main(String[] args) { 
		int produto = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do prduto"));  
		int divisao = produto / 100; 
		int desconto = divisao * 91; 
		
		JOptionPane.showMessageDialog(null, "O valor do produto com desconto é de = " + desconto);
} 
	}
*/
//OUTRO METODO SÓ QUE ESTA COM ERRO  
/* 
package aula4;

import javax.swing.JOptionPane;

	public class produto {
	public static void main(String[] args) { 
		Double produto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do prduto"));   
		Double desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do desconto"));  
		
		JOptionPane.showMessageDialog(null, "O valor do produto é de = " + produto);
		JOptionPane.showMessageDialog(null, "O valor do produto com desconto é de = " + produto - (produto * desconto/100));
	} 
	}
*/ 
/* 
package aula4;

import javax.swing.JOptionPane;

public class calculoinss {
	public static void main(String[] args) {  
		Double aulas = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de aulas dadas"));    
		Double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da aula")); 
		Double aulavalor = aulas * valor; 
		Double INSS = (aulavalor / 100) * 89; 
		JOptionPane.showMessageDialog(null, "Seu salario liquido sera de " + INSS);
	}
}
*/
/* 
package aula4;

import javax.swing.JOptionPane;

public class conversão {
	public static void main(String[] args) {  
		Double celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em graus Celsius"));
		Double resultado = (celsius * 9/5) + 32; 
		JOptionPane.showMessageDialog(null, "O valor de " + celsius + " graus celsius convertido em Fahrenheit é de " + resultado);
}
}
*/
