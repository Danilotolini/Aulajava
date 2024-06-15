package treeset;
	import java.util.Iterator;
	import java.util.TreeSet;
	public class ExemploTreeSet {
	    public static void main(String[] args) {
	        TreeSet<String> cursos = new TreeSet<>();
	        
	        cursos.add("PHP");
	        cursos.add("Linux");
	        cursos.add("Asp");
	        cursos.add("Java");
	        cursos.add("Delphi"); 
	        cursos.add("C#");
	        
	        Iterator<String> iterator = cursos.iterator();
	        System.out.println("Cursos em ordem alfab�tica: \n");
	        
	        while (iterator.hasNext()) {
	            String curso = iterator.next();
	            System.out.println("Curso: " + curso);
	        }
	    }
	}
