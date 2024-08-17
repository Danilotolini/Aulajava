package aula04;

import javax.swing.JOptionPane;

public class ExemploIfElseCascata {
    public static void main(String[] args) {  
    	int hora = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite a hora: "));
        if (hora < 12) {
            System.out.println("Bom dia!");
        } 
        else if (hora < 18) {
            System.out.println("Boa tarde!");
        } 
        else {
            System.out.println("Boa noite!");
        }
    }
}



/*
 * Date data = new Date();  
        int hora = data.getHours();
*/
