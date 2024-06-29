package aula18;

import java.util.*;


public class ExemploSorted {

	public static void main(String[] args) {
		List<Funcionario> lista = new ArrayList<>();  
		lista.add(new Funcionario(3018, "Joaquim Batista", "Desenvolvedor", 5500.0)); 
		lista.add(new Funcionario(1045, "Maria das Dores", "Analista", 6250.0)); 
		lista.add(new Funcionario(1780, "Jõao Ricardo", "Desenvolvedor", 7100.0)); 
		lista.add(new Funcionario(5200, "Ana Maria", "Vendedor", 4100.0)); 
		lista.add(new Funcionario(3999, "Robson Gusmão", "Analista", 6500.0)); 
		lista.add(new Funcionario(2389, "Eduardo Alves", "Desenvolvedor", 3200.0));
		System.out.println(" Ordenado por Nome:");
		lista.stream() 
		.sorted((Comparator.comparing(Funcionario::getNome)))
		.forEach(System.out::println); 
		System.out.println("\n Ordenado por Cargo:");
		lista.stream() 
		.sorted((Comparator.comparing(Funcionario::getCargo)))
		.forEach(System.out::println);  
		
		System.out.println("\n Ordenado por Salario:");
		lista.stream() 
		.sorted((Comparator.comparing(Funcionario::getSalario)))
		.forEach(System.out::println);
	}
	}


