package Exercicio2;
import java.util.*;

import javax.swing.JOptionPane;
public class Cap15_Lab02 { 
    public static void main(String[] args) {
        ArrayList<Estudante> estudanteList = new ArrayList<>();
       do { 
    	   String name = JOptionPane.showInputDialog("Digite o nome"); 
    	   double notamatematica = Double.parseDouble
    			   (JOptionPane.showInputDialog("Digite a nota de Matem�tica")); 
    	   double notaPortugues = Double.parseDouble
    			   (JOptionPane.showInputDialog("Digite a nota de Portugu�s"));  
    	   estudanteList.add(new Estudante(name, notamatematica,notaPortugues));
       }while(JOptionPane.showConfirmDialog(null, "Cadastrar Outra?")==0);

        //c�lculo da m�dia
        estudanteList.forEach(e -> 
          e.setMedia((e.getNotaMatematica() + e.getNotaPortugues()) / 2));

        System.out.println("M�dia dos alunos:");
        System.out.println("-----------------");
        estudanteList.forEach(System.out::println);
    }
}
