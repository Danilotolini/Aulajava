package aula18;

import java.util.*;

public class ExemploHashMap {
	public static void main(String[] args) {
		HashMap<String, Produto> map = new HashMap<>();  
		map.put("leite", 	new Produto("leite em p�", "Latic�nios", 5.80)); 
		map.put("cerveja", 	new Produto("cerveja em lata", "Bebidas", 1.89));  
		map.put("detergente", 	new Produto("Detergente", "Limpeza", 2.49));  
		map.put("manteiga", 	new Produto("Manteiga", "Latic�nios", 2.90));  
		map.put("pasta", 	new Produto("Pasta de dente", "Limpeza", 1.75)); 
		
		System.out.println(map.containsKey("cerveja")? "SIM" : "N�O"); 
		System.out.println(map.get("pasta"));   
		System.out.println("Item removido: " + map.remove("detergente"));
		System.out.println("Itens na lista ap�s a remo��o: " + map.size());  
		System.out.println("==========================");  
		map.forEach((k, v) -> System.out.println(v));
}
}	