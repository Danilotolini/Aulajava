package aula05;

import javax.swing.JOptionPane;

public class CopasMundo {
	public static void main(String[] args) {
		for(int ano=1930; ano<2033 ; ano+=4) {
			if(ano==1942 || ano==1946)
				continue;
	System.out.println("Copa do Mundo do ano de " + 
		ano);
		}
	}
}