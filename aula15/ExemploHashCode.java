package aula15;
import java.util.HashMap;
public class ExemploHashCode {
    public static void main(String[] args) {
		Pessoa a = new Pessoa("Rodrigo",23);
		Pessoa b = new Pessoa("Claudio",20);

        System.out.println("HashCode() de A (Rodrigo) " 
        + a.hashCode() + 
        		"\nHashCode() de B (Claudio) " 
        + b.hashCode() + "\n");
        
        System.out.println(a.nome + " é igual a " + b.nome + "? " + (
        		a.hashCode() == b.hashCode()));
        
		
		a.nome = b.nome; //Nomes iguais, mas objetos diferentes
		
		System.out.println("HashCode() de A (Claudio) " + a.nome.equals(b.nome) + "\n");
		
		System.out.println(a.nome + " é igual a " + b.nome + "? " + (
				a.hashCode() == b.hashCode()));
		
		a = b; //Objetos iguais
		System.out.println("HashCode() de A (Rodrigo) " + a.hashCode() + 
        		"\nHashCode() de B (Claudio) " + b.hashCode() + "\n");
		System.out.println(a.nome + " é igual a " + b.nome + "? " + (
				a.hashCode() == b.hashCode()));
    }
}