package Exercicio1;
import java.util.*;
public class Cap15_Lab01 {

	public static void main(String[] args) {
		HashMap<String, Integer> pessoaMap = new HashMap<>(); 
		pessoaMap.put("Roberto", 35); 
		pessoaMap.put("Carla", 26);  
		pessoaMap.put("Gabriel", 18);  
		pessoaMap.put("Bruna", 17); 
		
		pessoaMap.forEach((k, v) -> System.out.println(k + " " + v + " anos"));
	}

}
