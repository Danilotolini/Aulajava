package Foreach;
import java.util.Iterator;
import java.util.TreeSet;
public class ExemploForEach {
    public static void main(String[] args) {        
        TreeSet<String> cursos = new TreeSet<>();        
        cursos.add("PHP");
        cursos.add("Linux");
        cursos.add("Asp");
        cursos.add("Java");
        cursos.add("Delphi");
        
        System.out.println("Cursos em ordem alfabética: \n");
        System.out.println("For each com expressão lambda: \n");
        cursos.forEach(c -> System.out.println("Curso: " + c)); 
        
        System.out.println("\n For each sem expressão lambda: \n"); 
        
        for (String curso : cursos) {
			System.out.println("Curso: " + curso); 
		} 
        System.out.println("\nWhile convencional:"); 
        Iterator<String> iterator = cursos.iterator(); 
        while(iterator.hasNext()) 
        	System.out.println(iterator.next());
}
}
