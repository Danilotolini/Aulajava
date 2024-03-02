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
//OUTRA VARIAÇÃO 
/* 
package aula3;

import javax.swing.JOptionPane;

public class breack {
	 public static void main(String[] args) {  
		 int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite em numero um mês ")); 
		 switch(mes) { 
		 case 1: case 2: case 12: JOptionPane.showMessageDialog(null, "Verão",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 3: case 4: case 5: JOptionPane.showMessageDialog(null, "Outono",  "", JOptionPane.INFORMATION_MESSAGE); break; 
		 case 6: case 7: case 8: JOptionPane.showMessageDialog(null, "Inverno",  "", JOptionPane.INFORMATION_MESSAGE); break;  
		 case 9: case 10: case 11: JOptionPane.showMessageDialog(null, "Primaveira",  "", JOptionPane.INFORMATION_MESSAGE); break; 
	 }
	 } 
}
*/
/* 
package aula3;

import javax.swing.JOptionPane;

public class ifelsepais {
	public static void main(String[] args) {   
		String pais = JOptionPane.showInputDialog("Isira um pais");  
		if (pais.equalsIgnoreCase("Brasil") || pais.equalsIgnoreCase("Portugal")) {  
			JOptionPane.showMessageDialog(null, "Bom dia!");
		}else if(pais.equalsIgnoreCase("França")){
				JOptionPane.showMessageDialog(null, "Bon jour!");
		} else if(pais.equalsIgnoreCase("Argentina")|| pais.equalsIgnoreCase("Chile")|| pais.equalsIgnoreCase("Mexico")) { 
			JOptionPane.showMessageDialog(null, "Buenos dias!"); 
		} else { 
			JOptionPane.showMessageDialog(null, "Good moorning");
		}
	}
}
*/
/* 
package aula3;

public class while2 {

	public static void main(String[] args) {
		int num = 0;  
		while(num < 10) { 
			num++; 
			System.out.println("O valor de num é " + num); 
		

	}
		}
} 
*/
/* 
package aula3;

public class forcompleto {
	public static void main(String[] args) { 
		for(int a = 0 ; a < 600 ; a++) { 
			System.out.println("a = " + a);
			if(a==50) break;
		}
	}
}
*/ 
/* 
package aula3;

public class forcompleto2 {

	public static void main(String[] args) {
		for(int i = 1; i < 11; ++i) { 
			if(i==7) break; 
			System.out.println("Valor de i = " + i);
		} 
		System.out.println("Próximas linhas apos o loop...");

	}

}
*/
//PEQUENA MUDANÇA NO CÓDIGO ANTERIOR 
/* 
package aula3;

public class forcompleto2 {

	public static void main(String[] args) { 
		int i = 1;
		for(; i < 11; ++i) { 
			if(i==11) break; 
			System.out.println("Valor de i = " + i);
		} 
		System.out.println("Próximas linhas apos o loop...");
		System.out.println("Valor de i = " + i);
	}

}
*/
// OUTRA VARIAÇÃO DO ANTERIOR O CONTINUE VAI APENAS PULAR O NUMERO SELECIONADO 
/* 
package aula3;

public class forcompleto2 {

	public static void main(String[] args) { 
		int i = 1;
		for(; i < 11; ++i) { 
			if(i==7) continue; 
			System.out.println("Valor de i = " + i);
		} 
		System.out.println("Próximas linhas apos o loop...");
		System.out.println("Valor de i = " + i);
	}

}
*/
/* 
package aula3;

public class forcompleto3 {

	public static void main(String[] args) {
		for (int x = 0; x < 48; ){ 
			x = x + 3;
			System.out.println("x = " + x);
		}
	}
}
*/
//OU PARA SOMAR MULTIPLOS DE 3 
/* 
package aula3;

public class forcompleto3 {

	public static void main(String[] args) {
		for (int x = 0; x < 48; i+=3 ){ 
			System.out.println("x = " + x);
		}
	}
} 
*/
/* 
package aula3;

import javax.swing.JOptionPane;

public class areadocirculo {
	public static void main(String[] args) {   
		float r = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do raio "));   
		r = r * r;
		float pi = (float) 3.14;
		float area = r * pi; 
		
		JOptionPane.showMessageDialog(null, "O Valor da area do circulo é de " + area);
	}
}
*/
