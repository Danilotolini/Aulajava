package Exercicio2;
import java.util.*;

import javax.swing.JOptionPane;
public class Cap15_Lab02 { 
    public static void main(String[] args) {
        ArrayList<Estudante> estudanteList = new ArrayList<>();
       do { 
    	   String name = JOptionPane.showInputDialog("Digite o nome"); 
    	   double notamatematica = Double.parseDouble
    			   (JOptionPane.showInputDialog("Digite a nota de Matemática")); 
    	   double notaPortugues = Double.parseDouble
    			   (JOptionPane.showInputDialog("Digite a nota de Português"));  
    	   estudanteList.add(new Estudante(name, notamatematica,notaPortugues));
       }while(JOptionPane.showConfirmDialog(null, "Cadastrar Outra?")==0);

        //cálculo da média
        estudanteList.forEach(e -> 
          e.setMedia((e.getNotaMatematica() + e.getNotaPortugues()) / 2));

        System.out.println("Média dos alunos:");
        System.out.println("-----------------");
        estudanteList.forEach(System.out::println);
    }
}
