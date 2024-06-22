package exercicio2;

import java.util.*;

import javax.swing.JOptionPane;

public class TesteHashMap {

	public static void main (String args[]){ 		
		HashMap pessoas = new HashMap();
		do { 	
		String ra = JOptionPane.showInputDialog("Digite o RA"); 
		Alunos p = new Alunos(ra);		
		pessoas.put(ra, p);		
		}while(JOptionPane.showConfirmDialog(null, "Cadastrar Outro aluno?") == 0);
		imprimirMapPessoas(pessoas);		
		String ra = JOptionPane.showInputDialog("Digite o RA a ser Removido");
		removerElemento(pessoas, ra);		
		imprimirMapPessoas(pessoas);		 
	
	}
	public static void imprimirMapPessoas(HashMap pessoas){
		Set chaves = pessoas.keySet();
		Iterator iTer = chaves.iterator();

		String chave;
		Alunos p;

		System.out.println("\n --- HashMap de Pessoas ---");

		while (iTer.hasNext()){
			chave = (String) iTer.next();
			p = (Alunos) pessoas.get(chave);
			System.out.println("Chave: " + chave);
			System.out.println(p + "\n");
		}}
	public static void removerElemento(HashMap map, 
			String chave){
		Alunos pessoaRemovida = null;

		if (map.containsKey(chave)){
			System.out.println("\n --- cpf removido ---");

			if(JOptionPane.showConfirmDialog(null, 
					"Confirma a remoção do cpf: " + map.get(chave))==0) {
				pessoaRemovida = (Alunos) map.remove(chave);
				System.out.println(pessoaRemovida);
			}
			else
				System.out.println( map.get(chave) + " NÃO foi excluída ");
		}
		else{
			System.out.println("RA " + chave + " não "
					+ " foi encontrado no hashMap");
		}	}	}
