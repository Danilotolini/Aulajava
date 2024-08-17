package aula15;
import java.util.HashMap;
public class ExemploEquals {
    public static void main(String[] args) {
	Pessoa a = new Pessoa("Claudio",23);
	Pessoa b = new Pessoa("Claudio",23);
        System.out.println(a.nome + " é igual a " + b.nome + "? " 
        		+ (a.equals(b)));
//	a.nome = b.nome; //Nomes iguais, mas objetos diferentes
		System.out.println(a.nome + " é igual a " + b.nome + "? " 
				+ (a.nome.equals(b.nome)));		
//	a = b; //Objetos iguais		
	System.out.println(a.nome + " é igual a " + b.nome + "? " 
			+ (b.equals(a)));
	
	System.out.println(a.nome + " é igual com hashCode  a " 
    		+ b.nome + "? " + (b.hashCode() == a.hashCode()) );
    }
    
    
}