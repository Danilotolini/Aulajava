package exercicio3;
import java.util.*;

import javax.swing.JOptionPane; 
public class TesteAluno {
	public static void main (String[] args) {
		ArrayList alunos = new ArrayList();
		do {
			long ra = Long.parseLong(JOptionPane.showInputDialog(
					"Digite o RA"));
			String nome = JOptionPane.showInputDialog(
					"Digite o Nome");
			Aluno a = new Aluno(nome, ra);
			alunos.add(a);
		}while(JOptionPane.showConfirmDialog(null, 
				"Cadastrar outro?")==0);
		
		System.out.println(
				"Imprimindo alunos antes da ordenação");
		Iterator iTer1 = alunos.iterator();
		while (iTer1.hasNext()){
			System.out.println(iTer1.next());
		}
		Collections.sort(alunos);

		System.out.println(
				"\nImprimindo alunos depois da ordenação");
		Iterator iTer2 = alunos.iterator();
		while (iTer2.hasNext()){
			System.out.println(iTer2.next());
		}			
	}	
}