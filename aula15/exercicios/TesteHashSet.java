package aula15.exercicios;
import java.util.*;
public class TesteHashSet {
	public static void main(String[] args) {
		String nome1 = "Carlos";
		String nome2 = "Josias";
		String nome3 = "Marcos";
		String nome4 = "Armando";

		HashSet nomes = new HashSet();
		nomes.add(nome1);
		nomes.add(nome2);
		nomes.add(nome3);
		nomes.add(nome4);

		Iterator iterator = nomes.iterator();
		int iCont = 1;
		String nome;
		while (iterator.hasNext()){
			nome = (String) iterator.next();
			System.out.println("nome[" + iCont++ + "] = " 
					+ nome);
		}
	}	
} 

/*
 * 
 */

