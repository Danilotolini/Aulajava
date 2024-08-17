package Laboratorios.Cap_15;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cap15_Lab2v2 {

    public static void main(String[] args) {
    	ArrayList<Estudante> estudanteList = new ArrayList<>();
    	do {
        	String nome = JOptionPane.showInputDialog("Digite o nome:");
        	double notaMat = Double.parseDouble(JOptionPane.showInputDialog(
        			"Digite a nota de Matemática:"));
        	double notaPort = Double.parseDouble(JOptionPane.showInputDialog(
        			"Digite a nota de Português:"));
        	estudanteList.add(new Estudante(nome, notaMat, notaPort));
        }while(JOptionPane.showConfirmDialog(null, "Cadastrar Outra?")==0);
        
    	//calculando a Média
    	estudanteList.forEach(e -> 
    	  e.setMedia((e.getNotaMatematica() + e.getNotaPortugues()) / 2));

    	System.out.println(String.format("%-20s %-4s %-4s %-4s", 
        		"Nome","Mate","Port", "Média"));
         
        estudanteList.forEach(System.out::println);
    }
}