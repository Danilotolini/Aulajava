package aula15.exercicios;
import java.util.*;

import javax.swing.JOptionPane;
public class HashMapDinamico {
	public static void main (String args[]){
		HashMap pessoas = new HashMap();
		do {
			String cpf = JOptionPane.showInputDialog("Digite o CPF");
			String nome = JOptionPane.showInputDialog("Digite o Nome");
			Pessoa p = new Pessoa(nome, cpf);
			pessoas.put(cpf, p);
		}while(JOptionPane.showConfirmDialog(null, 
				"Cadastrar outro?")==0);

		imprimirMapPessoas(pessoas);		
		String cpf = JOptionPane.showInputDialog(
				"Digite o CPF a ser Removido");
		removerElemento(pessoas, cpf);		
		imprimirMapPessoas(pessoas);
		if(JOptionPane.showConfirmDialog(null, 
				"Cadastrar outros? ")==0) {
			HashMapDinamico.main(args);
		}
			
		
	}
	public static void imprimirMapPessoas(HashMap pessoas){
		Set chaves = pessoas.keySet();
		Iterator iTer = chaves.iterator();
		String chave;
		Pessoa p;
		System.out.println("\n --- HashMap de Pessoas ---");

		while (iTer.hasNext()){
			chave = (String) iTer.next();
			p = (Pessoa) pessoas.get(chave);
			System.out.println("Chave: " + chave);
			System.out.println(p + "\n");
		}}
	public static void removerElemento(HashMap map, 
			String chave){
		Pessoa pessoaRemovida = null;

		if (map.containsKey(chave)){
			System.out.println("\n --- Pessoa removida ---");

			if(JOptionPane.showConfirmDialog(null, 
					"Confirma a remoção da Pessoa: " + map.get(chave))==0) {
				pessoaRemovida = (Pessoa) map.remove(chave);
				System.out.println(pessoaRemovida);
			}
			else
				System.out.println( map.get(chave) + " NÃO foi excluída ");
		}
		else{
			System.out.println("CPF " + chave + " não "
					+ "encontrada no hashMap");
		}	}	}


