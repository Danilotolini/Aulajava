package aula15.exercicios;
import java.util.*;
public class TesteHashMap {
	public static void main (String args[]){
		String cpf1 = "251";
		Pessoa p1 = new Pessoa ("Carlos", cpf1);		
		String cpf2 = "573";
		Pessoa p2 = new Pessoa ("Roberto", cpf2);		
		String cpf3 = "952";
		Pessoa p3 = new Pessoa ("Matheus", cpf3);

		HashMap pessoas = new HashMap();
		pessoas.put(cpf1, p1);
		pessoas.put(cpf2, p2);
		pessoas.put(cpf3, p3);		
		imprimirMapPessoas(pessoas);		
		String chave = "952";
		removerElemento(pessoas, chave);		
		imprimirMapPessoas(pessoas);		
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
				pessoaRemovida = (Pessoa) map.remove(chave);
				System.out.println(pessoaRemovida);
			}
			else{
				System.out.println("CPF (chave) não "
						+ "encontrada no hashMap");
			}	}	}


