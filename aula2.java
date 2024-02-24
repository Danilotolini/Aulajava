/* parter 1 
package aula2;
//parte 1
public class aula2 { 
	public static void mais(String[] args) { 
	//espaço reservado na memoria devidamente indentificado para armazenar valor 

	final double VALOR = 3.1415;   
	System.out.println("O valor de pi é de " + VALOR); 
} 
 }
*/ 
/*
package aula2;

public class calculos {
 public static void mains(String[] args) { 
	 int a = 10, b = 25, c = 40,  d = 55; 
	 System.out.println(a + b); 
	 System.out.println(b - a);  
	 System.out.println(c * d);  
	 System.out.println(c / a);  
	 System.out.println(d % a); 
 }
}  
*/  
/*
public class enum2 { 
	private enum meses{ 
	JANEIRO,FEVEREIRO,MARÇO,ABRIL,MAIO,JUNHO,JULHO,AGOSTO,SETEMBRO,OUTUBRO,NOVEMBRO,DEZEMBRO;
	}
	public static void main(String[] args) {
	String atual = "Estamos no mês de ";  
	System.out.println(atual +);
} 
}
*/  
/*
package aula2;

import javax.swing.JOptionPane;

public class ExemploWrappers {
	public static void main(String[] args) { 
	String nome = JOptionPane.showInputDialog("Digite seu nome "); 
	int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade ")); 
	float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu peso "));  
	
	System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nPeso " + peso );
	
	}
}
*/ 
/* 
package aula2;

import javax.swing.JOptionPane; 

public class Tela { 
	public static void main(String[] args) {
	String nome = JOptionPane.showInputDialog("Digite o seu nome");  
	JOptionPane.showMessageDialog(null, "Bem vindo: " + nome);  
	JOptionPane.showMessageDialog(null, "O nome: " + nome + " tem " + nome.length() + " caracteres!"); 
	JOptionPane.showMessageDialog(null, "O nome: " + nome + " tem como quinta letra: " + nome.charAt(4)); 
}
} 
*/
/*  
A RESOLVER
package aula2;

import javax.swing.JOptionPane;

public class calculo3 {
	public static void main(String[] args) { 
		float num1 = float.parseFloat(JOptionPane.showConfirmDialog("Digite número 1")); 
		float num2 = float.parseFloat(JOptionPane.showInputDialog("Digite o numero 2"));  
		float res = num1>num2 ? num1 : num2; 
		
		JOptionPane.showMessageDialog(null, );
		
	}
}
*/ 
/*
package aula2;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

public class calculo4 {
	public static void main(String[] args) {  
	int valor1 = JOptionPane.showMessageDialog(null, "Alternativa errada tente novamente" );; 
	int valor2 = JOptionPane.Interger.parseinteger(null, "Alternativa errada tente novamente" );; 
	int resultado = valor1 + valor2;  
	
	JOptionPane.showConfirmDialog(null, "O resultado é de " + resultado, null, JOptionPane.YES_NO_OPTION, "" JOptionPane.QUESTION_MESSAGE); 
	
	if(resultado != valor1 + valor2){ 
	JOptionPane.showMessageDialog(null, "Alternativa errada tente novamente" );
	}else { 
	JOptionPane.showMessageDialog(null, "Alternativa correta" );
	}
	
	}
}
*/
