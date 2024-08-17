package Laboratorios.Cap_15;
import java.util.HashMap;

import javax.swing.JOptionPane;
public class Cap15_Lab1_Lambda {
    public static void main(String[] args) {
    	
        HashMap<String, Integer> pessoaMap = new HashMap<>();
        do {
        	String nome = JOptionPane.showInputDialog("Digite o nome:");
        	int idade =Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
        	 pessoaMap.put(nome, idade);
        }while(JOptionPane.showConfirmDialog(null, "Cadastrar Outra?")==0);
       
        System.out.println(" -- Pessoas --");        
        pessoaMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
