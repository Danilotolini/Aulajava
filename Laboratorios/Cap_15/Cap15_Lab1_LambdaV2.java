package Laboratorios.Cap_15;
import java.util.HashMap;

import javax.swing.JOptionPane;
public class Cap15_Lab1_LambdaV2 {
    public static void main(String[] args) {    	
        HashMap<String, Pessoa> pessoaMap = new HashMap<>();
        do {
        	String nome = JOptionPane.showInputDialog("Digite o nome:");
        	int idade =Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
        	Pessoa p = new Pessoa(nome, idade);
        	 pessoaMap.put(p.getNome(), p);
        }while(JOptionPane.showConfirmDialog(null, "Cadastrar Outra?")==0);
       
        pessoaMap.forEach((nome , p) -> System.out.println(p));
    }
}